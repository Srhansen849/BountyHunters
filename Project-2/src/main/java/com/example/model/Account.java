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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	@JoinColumn(name="assets_fk")
	@JsonBackReference
	private List<Assets> assets;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accountid, /* String currency, double balance, */ List<Assets> assets) {
		super();
		this.accountid = accountid;
//		this.currency = currency;
//		this.balance = balance;
		this.assets = assets;
	}
	
	public Account(/* String currency, double balance, */ List<Assets> assests) {
		super();
//		this.currency = currency;
//		this.balance = balance;
		this.assets = assets;
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

	public List<Assets> getAssets() {
		return assets;
	}

	public void setAssests(List<Assets> assets) {
		this.assets = assets;
	}

	@Override
	public String toString() {
		return "Account [accountid=" + accountid +  ", assets=" + assets + "]";
	}

		
}
