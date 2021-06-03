package com.example.demo.services;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.entities.Transaction;





public interface TransactionService {
	public Transaction getTransactionById(int id);

	public List<Transaction> getTransactionsByDate(LocalDateTime date);

	public List<Transaction> getAllTransactionsBetweenAmount(String amountRange);

	public List<Transaction> getAllTransactionsByAmount(double amount);
}
