package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entity.Contact;

public interface ContactService {

	public void saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);
}
