package com.example.demo.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TransacRepository;
import com.example.demo.entities.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	TransacRepository res;
	@Override
	public Transaction getTransactionById(int id) {
		return res.findById(id).get();
	}

	@Override
	public List<Transaction> getTransactionsByDate(LocalDateTime date) {
		
		return res.getTransactionsByTxnDate(date);
	}

	@Override
	public List<Transaction> getAllTransactionsBetweenAmount(String amountRange) {
		String[] temp = amountRange.split("-");
		double min = Double.parseDouble(temp[0]);
		double max = Double.parseDouble(temp[1]);
		return res.getAllTransactionsByTxnAmountBetween(min,max);
		
	}

	@Override
	public List<Transaction> getAllTransactionsByAmount(double amount) {
	
		return res.getAllTransactionsByAmount(amount);
	}

}

