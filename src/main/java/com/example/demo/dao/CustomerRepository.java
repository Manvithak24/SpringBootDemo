package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer>{
	@Query("select c from Customer c join c.transactions txn where txn.txnAmount = :amount")
	public List<Customer> getAllCustomersByAmount(double amount);
}
	

