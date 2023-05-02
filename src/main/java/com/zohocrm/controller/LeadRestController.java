package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zohocrm.repository.LeadRepository;


@RestController
@RequestMapping("/api/leads")
public class LeadRestController {

	
	@Autowired
	private LeadRepository leadRepository;
	
	@DeleteMapping("/delete/{id}")
	public void deleteLead(@PathVariable long id) {
		leadRepository.deleteById(id);
	}
}
