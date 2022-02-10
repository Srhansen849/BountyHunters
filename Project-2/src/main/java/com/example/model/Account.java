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
@Table(name="Account")
public class Account {
	
	
	@Id
	@Column(name="account_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountid;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="balance")
	private double balance;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="user_fk")
	@JsonManagedReference
	private User acHolder;

	
	
//	@Column(name="account_id")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Id
//	private int account_id;
//	@Column(name="currency")
//	private String currency;
//	@Column(name="amount")
//	private double amount;
//	
//	@ManyToOne(fetch=FetchType.EAGER)
//	@JsonManagedReference
//	@JoinColumn(name="account_id", nullable=false)
//	private User acclist;
//	
//	
//	public Account() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Account(int account_id, String currency, double amount) {
//		super();
//		this.account_id = account_id;
//		this.currency = currency;
//		this.amount = amount;
//	}
//
//	public Account(String currency, double amount) {
//		super();
//		this.currency = currency;
//		this.amount = amount;
//	}
//
//	public String getCurrency() {
//		return currency;
//	}
//
//	public void setCurrency(String currency) {
//		this.currency = currency;
//	}
//
//	public double getAmount() {
//		return amount;
//	}
//
//	public void setAmount(double amount) {
//		this.amount = amount;
//	}
//
//	public int getAccount_id() {
//		return account_id;
//	}
//
//	@Override
//	public String toString() {
//		return "Account [account_id=" + account_id + ", currency=" + currency + ", amount=" + amount + "]";
//	}
	
	

}
