package com.example.model;

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

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity

@Table(name="account")
public class Account {
	

	@Id
	@Column(name="account_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountid;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="balance")
	private double balance;
	


	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accountid, String currency, double balance) {
		super();
		this.accountid = accountid;
		this.currency = currency;
		this.balance = balance;
	}

	public String getCurrancy() {
		return currency;
	}

	public void setCurrancy(String currancy) {
		this.currency = currancy;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getAccountid() {
		return accountid;
	}

	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", currency=" + currency + ", balance=" + balance + "]";
	}
	
		

}
