package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Contact;
import com.example.demo.repository.ContactRepository;



@Service
public class ContactService {

		@Autowired
		ContactRepository crepo;
		
		public Contact  getContact(int cid)
		{
		  //return crepo.findById(cid).get();
			
		Optional<Contact>oc=crepo.findById(cid);
		
			Contact ct=null;
			
			try {
				ct=oc.get();
			}
			catch(NoSuchElementException e)
			{
				ct=null;
			}
			return ct;
		}
		
		public List<Contact> getAll()
		{
			 return crepo.findAll();
		}
		
		
		
		
		public Contact savec(Contact c)
		{
			//insert operation in database
			return crepo.save(c);
		}
		
		
		public List<Contact> getByFname(String fnm)
		{
			return crepo.getContactByName(fnm);
		}
		
		
		//?
		public List<Contact> getByNo(String no)
		{
			return (List<Contact>) crepo.getContactsByNo(no);
		}
		
		//?
		public int updateFname(String fnm,String email)
		{
			
			return crepo.updateName(fnm, email);
		}

				
		public String getName(int cid)
		{
			return crepo.getName(cid);
		}



}
