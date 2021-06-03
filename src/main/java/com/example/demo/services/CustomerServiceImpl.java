package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.entities.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository res;
	
	@Override
	public Customer insertCustomer(Customer customer) {
		return res.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return res.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer custUpdate =res.findById(customer.getCustomerId()).get();
		if(custUpdate != null)
		{
		return res.save(customer);
		}
		return null;
	}

	@Override
	public void deleteCustomer(int id) {
		res.deleteById(id);
		
	}

	@Override
	public List<Customer> getAllCustomersByAmount(double amount) {
		
		return res.getAllCustomersByAmount(amount);
		
	}

}
































































































//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.dao.CustomerRepository;
//import com.example.demo.entities.Customer1;
//import com.example.demo.entities.Transac;
//
//
//@Service
//public class CustomerServiceImpl implements CustomerService {
//	@Autowired
//	CustomerRepository cr;
//	@Override
//	public List<Customer1> getAllCustomers() {
//		// TODO Auto-generated method stub
//		return cr.findAll();
//	}
//	@Override
//	public Customer1 insertCustomer(Customer1 customer) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public Customer1 updateCustomer(Customer1 customer) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public void deleteCustomer(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public List<Customer1> getAllCustomersByAmount(int amount) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
//
//}
