package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Customer;

public interface CustomerService {
	public Customer insertCustomer(Customer customer);

	public List<Customer> getAllCustomers();

	public Customer updateCustomer(Customer customer);

	public void deleteCustomer(int id);

	public List<Customer> getAllCustomersByAmount(double amount);
}
