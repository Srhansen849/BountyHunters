package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="account") 
public class Account {

	@Id
	@Column(name="account_id")	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int account_id;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="balance")
	private Double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String currency, Double balance) {
		super();
		this.currency = currency;
		this.balance = balance;
	}

	public Account(int account_id, String currency, Double balance) {
		super();
		this.account_id = account_id;
		this.currency = currency;
		this.balance = balance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public int getAccount_id() {
		return account_id;
	}

	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", currency=" + currency + ", balance=" + balance + "]";
	}
	
}
