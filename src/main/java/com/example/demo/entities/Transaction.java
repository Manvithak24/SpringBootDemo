package com.example.demo.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="transaction1")
public class Transaction {
	@Id
	@Column(name = "txn_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int txnId;
	@Column(name = "TXNDATE")
    private LocalDateTime txnDate;
	@Column(name = "TXNAMOUNT")
    private double txnAmount;
	
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "customerid",nullable = false)
    @JsonIgnore
    private Customer customer;
    
	public int getTxnId() {
		return txnId;
	}
	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}
	public LocalDateTime getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(LocalDateTime txnDate) {
		this.txnDate = txnDate;
	}
	public Double getTxnAmount() {
		return txnAmount;
	}
	public void setTxnAmount(Double txnAmount) {
		this.txnAmount = txnAmount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
