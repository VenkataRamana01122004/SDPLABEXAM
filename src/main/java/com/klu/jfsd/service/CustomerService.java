package com.klu.jfsd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.jfsd.model.Customer;

@Service
public interface CustomerService {

	List<Customer> getAllCustomers();

}
