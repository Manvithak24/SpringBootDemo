package com.example.demo.dao;

import java.time.LocalDateTime;
import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Transaction;



public interface TransacRepository extends JpaRepository<Transaction, Integer>{
	@Query("select txn from Transaction txn where txn.txnDate =:date")
	public List<Transaction> getTransactionsByTxnDate(LocalDateTime date);
	

	public List<Transaction> getAllTransactionsByTxnAmountBetween(double min,double max);
	
	@Query("select txn from Transaction txn where txn.txnAmount = :amount")
	public List<Transaction> getAllTransactionsByAmount(double amount);
}
