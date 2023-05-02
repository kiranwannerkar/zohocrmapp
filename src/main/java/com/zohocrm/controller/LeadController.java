package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.service.ContactService;
import com.zohocrm.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	@Autowired
	private ContactService contactService;

	// http://localhost:8080/context-path/viewCreateLeadPage    context-path-=> mention in application.property
	@GetMapping("/viewCreateLeadPage")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	
	@PostMapping("/save")
	public String saveLead(@ModelAttribute("lead") Lead lead, Model model) {//Model-> with this we can exchange data from controller to view
		leadService.saveOneLead(lead);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	
	@PostMapping("/convertLead")
	public String convertLead(@RequestParam long id,Model model) { // From the form we have to read id so we r using @RequestParam
		//based on id let us get lead deatails then we will put that details form lead to contact
		
		Lead lead = leadService.findLeadById(id);
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName()); //taking data from lead object and initializing contact object
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.saveContact(contact);
		leadService.deleteLeadById(id);  // note:- data coming from lead module then it coming to contact module this means this person purchase product and other went into enquiry section
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
		
	}
	
	@RequestMapping("/listAll")
	public String listAllLeads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads",leads);
		return "list_leads";
		
		
	}
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam long id, Model model) {
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead",lead);
		return "lead_info";
		
	}

}
