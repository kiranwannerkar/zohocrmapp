package com.zohocrm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.service.ContactService;

@Controller
public class BillingController {

	@Autowired
	private ContactService contactService;
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam long id, Model model) {// here we have to read the id and based on id i should get contact info so that we can display contact info into billing page automatically
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact",contact);
		return "generate_bill";
		
	}
}
