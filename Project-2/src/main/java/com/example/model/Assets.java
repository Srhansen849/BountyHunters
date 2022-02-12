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
@Table(name="assets")
public class Assets {

	@Id
	@Column(name="assest_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int assestid;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="balance")
	private double balance;
	
	
	public Assets() {
		// TODO Auto-generated constructor stub
	}

	public Assets(int assestid, String currency, double balance) {
		super();
		this.assestid = assestid;
		this.currency = currency;
		this.balance = balance;
		//this.accHolder = accHolder;
	}

	public Assets(String currency, double balance) {
		super();
		this.currency = currency;
		this.balance = balance;
		//this.accHolder = accHolder;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

//	public Account getAccHolder() {
//		return accHolder;
//	}
//
//	public void setAccHolder(Account accHolder) {
//		this.accHolder = accHolder;
//	}

	public int getAssestid() {
		return assestid;
	}

	@Override
	public String toString() {
		return "Assets [assestid=" + assestid + ", currency=" + currency + ", balance=" + balance + "]";
	}
	
	
}
