package com.lq.bank.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class AccountController {
	
	/*
	@GetMapping
	public Map<String, Object> getCustomerList() {
		
		Map<String, Object> customerMap = new HashMap();
		
		customerMap.put("First Name", "John");
		customerMap.put("Last Name", "Doe");
		customerMap.put("Age", 18);
		
		return customerMap;
	}
	*/
	@GetMapping
	public List<Map> getCustomerList() {
		
		List<Map> customerList = new ArrayList<Map>();
		
		
		Map<String, Object> customerMap1 = new HashMap<String, Object>();
		Map<String, Object> customerMap2 = new HashMap<String, Object>();
		
		customerMap1.put("First Name", "John");
		customerMap1.put("Last Name", "Doe");
		customerMap1.put("Age", 18);
		
		customerMap2.put("First Name", "Jane");
		customerMap2.put("Last Name", "Doe");
		customerMap2.put("Age", 18);
	
		customerList.add(customerMap1);
		customerList.add(customerMap2);
		
		return customerList;
		
		
	}
	
	@PostMapping
	public String createCustomer() {
		return "Soon";
	}
	
	@PutMapping("/{id}")
	public String updateCustomer() {
		return "soon";
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomer() {
		return "soon";
	}

}
