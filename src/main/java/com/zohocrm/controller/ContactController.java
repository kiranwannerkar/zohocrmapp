package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.service.ContactService;

@Controller
public class ContactController {
//	@Autowired
//	private ContactService contactService;
	// OR constructor injections spring boot handle its dependency

	private ContactService contactService;

	public ContactController(ContactService contactService) {
		super();
		this.contactService = contactService;
	}

	@RequestMapping("/listAllContacts")
	public String listAllLeads(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";

	}
}
