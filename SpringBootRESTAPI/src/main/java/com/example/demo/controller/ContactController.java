package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Contact;
import com.example.demo.service.ContactService;

@RestController
public class ContactController {

			@Autowired
			ContactService cservice;
			
			@GetMapping("/allcons")
			public List<Contact> getAll()
			{
				return cservice.getAll();
			}
			
			@PostMapping("/savecon")
			public Contact savecontact(@RequestBody Contact ct)
			{
				return cservice.savec(ct);
			}
			
			
			
			//http://localhost:8080/getcontact?cid=3
			@GetMapping("/getcontact")
			public Contact getContact(@RequestParam("cid") int id)
			{				
				return cservice.getContact(id);
			}
			
			
			//path variable : no key-value pair
			//http://localhost:8080/getcontact/3
			@GetMapping("/getcontact/{cid}")
			public Contact getCon(@PathVariable("cid")int id)
			{
				return cservice.getContact(id);
			}
			
			
			@GetMapping("getbyname")
			public List<Contact> getContacts(@RequestParam("nm")  String nm)
			{
				
				return cservice.getByFname(nm);
				
			}
			
			
			@GetMapping("/getbyno")
			public List<Contact> getContactByNo(@RequestParam("no")  String no)
			{
				
				return cservice.getByNo(no);
				
			}
			
			
			@GetMapping("/updateName")
			public String updateName(@RequestParam("fnm") String fname,@RequestParam("email")  String email)
			{
				
				if(cservice.updateFname(fname, email)==1)
					return "success";
				else
					return "failure";
			}
			
			
			@GetMapping("/getname")
			public String getName(@RequestParam("cid") int id)
			{
			
					return cservice.getName(id);
			}

}


