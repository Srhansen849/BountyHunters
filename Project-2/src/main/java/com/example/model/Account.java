package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;


import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity

@Table(name="account")
public class Account {
	

	@Id
	@Column(name="account_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountid;
	
//	@Column(name="currency")
//	private String currency;
//	
//	@Column(name="balance")
//	private double balance;

	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="account_id")
	@JsonBackReference
	private List<Asset> asset;

	
	public Account() {
		// TODO Auto-generated constructor stub
	}


	public Account(int accountid, /* String currency, double balance, */ List<Asset> asset) {
		super();
		this.accountid = accountid;
//		this.currency = currency;
//		this.balance = balance;
		this.asset = asset;
	}
	
	public Account(/* String currency, double balance, */ List<Asset> asset) {
		super();
//		this.currency = currency;
//		this.balance = balance;
		this.asset = asset;
	}

//	public String getCurrency() {
//		return currency;
//	}
//
//	public void setCurrency(String currancy) {
//		this.currency = currancy;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}



	public int getAccountid() {
		return accountid;
	}


	public List<Asset> getAssets() {
		return asset;
	}

	public void setAssests(List<Asset> asset) {
		this.asset = asset;
	}

	@Override
	public String toString() {
		return "Account [accountid=" + accountid +  ", asset=" + asset + "]";
	}

		

}
