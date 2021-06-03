package com.example.demo.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entities.Customer;

import com.example.demo.services.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService cs;
	@PostMapping
	public ResponseEntity<Object> addCustomer(@RequestBody Customer cust) {
	    
		Customer cc = cs.insertCustomer(cust);
	    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cc.getCustomerId()).toUri();
	    return ResponseEntity.created(location).build();
	  }
	@GetMapping("/all")
	public List<Customer> getAllCustomer()
	{
		return cs.getAllCustomers();
	}
	@DeleteMapping("/{id}")
	public void deleteCustomerById(@PathVariable int id)
	{
		cs.deleteCustomer(id);
	}
	@GetMapping("/ByAmount/{amount}")
	public List<Customer> getAllCustomersByAmount(@PathVariable double amount)
	{
		return cs.getAllCustomersByAmount(amount);
	}
	@PutMapping("/updateCustomer")
	public Customer UpdateCustomer(@RequestBody Customer cust)
	{
		Customer c =cs.updateCustomer(cust);
		return c;
	}
}
