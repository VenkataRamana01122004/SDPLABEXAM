package com.klu.jfsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.jfsd.model.Customer;
import com.klu.jfsd.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController 
{
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("viewall")
	public List<Customer> viewall()
	{
		return customerService.getAllCustomers();
	}
}
