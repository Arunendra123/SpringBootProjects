package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactServiceImp;

@RestController
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	private ContactServiceImp contactServiceImp;
	
	@GetMapping("{userId}")
	public List<Contact> getConctactsOfUser(@PathVariable int userId){
		return contactServiceImp.getContactsOfUser(userId);
	}
}
