package com.example.demo.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Transaction;
import com.example.demo.services.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	

	@Autowired
	TransactionService ts;
	
	@GetMapping("/{id}")
	public Transaction getTransactionById(@PathVariable int id)
	{
		
		return ts.getTransactionById(id);
	}
	@GetMapping("/ByDate/{date}")
	public List<Transaction> getTransactionsByDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) 
						LocalDateTime date)
	{
		return ts.getTransactionsByDate(date);
	}
	@GetMapping("/ByAmount/{amount}")
	public List<Transaction> getAllTransactionsByAmount(@PathVariable double amount)
	{
		return ts.getAllTransactionsByAmount(amount);
	}
	@GetMapping("/BetweenAmount/{amount}")
	public List<Transaction> getAllTransactionsBetweenAmount(@PathVariable String amount)
	{
		return ts.getAllTransactionsBetweenAmount(amount);
	}

}
