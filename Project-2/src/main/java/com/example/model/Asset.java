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
@Table(name="asset")
public class Asset {

	@Id
	@Column(name="asset_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int assetid;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="balance")
	private double balance;
	
	
	public Asset() {
		// TODO Auto-generated constructor stub
	}

	public Asset(int assetid, String currency, double balance) {
		super();
		this.assetid = assetid;
		this.currency = currency;
		this.balance = balance;
		//this.accHolder = accHolder;
	}

	public Asset(String currency, double balance) {
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

	public int getAssetid() {
		return assetid;
	}

	@Override
	public String toString() {
		return "Asset [assetid=" + assetid + ", currency=" + currency + ", balance=" + balance + "]";
	}
	
	
}
