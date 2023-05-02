package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Contact;
import com.zohocrm.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public void saveContact(Contact contact) {
		contactRepository.save(contact);
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactRepository.findAll();

		return contacts;
	}

	@Override
	public Contact getContactById(long id) {
		Optional<Contact> findById = contactRepository.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
