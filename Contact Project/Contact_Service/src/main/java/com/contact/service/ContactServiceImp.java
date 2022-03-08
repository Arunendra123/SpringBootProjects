package com.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImp implements ContactService {

	private List<Contact> contactList;
	
	public ContactServiceImp() {
		contactList=new ArrayList<Contact>();
		contactList.add(new Contact(1,"Amit","amit@gmail.com",111));
		contactList.add(new Contact(2,"Saroj","saroj@gmail.com",111));
		contactList.add(new Contact(3,"Sushil","sushil@gmail.com",111));
		contactList.add(new Contact(4,"Ram","ram@gmail.com",111));
		contactList.add(new Contact(5,"Bhuvan","bhuvan@gmail.com",111));
		contactList.add(new Contact(1,"Rohit","rohit@gmail.com",112));
		contactList.add(new Contact(2,"Vinay","vinay@gmail.com",112));
		contactList.add(new Contact(3,"Sokhu","sokhu@gmail.com",112));		
		contactList.add(new Contact(1,"Amit","amit@gmail.com",113));
		contactList.add(new Contact(2,"Saroj","saroj@gmail.com",113));
		contactList.add(new Contact(3,"vibhuti","vbhuti@gmail.com",114));
		contactList.add(new Contact(4,"rohu","rohu@gmail.com",114));
		contactList.add(new Contact(5,"saroj","saroj@gmail.com",114));
	}

	@Override
	public List<Contact> getContactsOfUser(int userId) {
		return contactList.stream().filter(contact->contact.getUserId()==userId).collect(Collectors.toList());
	}
}
