package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entity.Lead;

public interface LeadService {
	public void saveOneLead(Lead lead);

	public Lead findLeadById(long id);

	public void deleteLeadById(long id);

	public List<Lead> getAllLeads();

}
