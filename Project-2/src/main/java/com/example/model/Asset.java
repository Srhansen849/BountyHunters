package com.example.model;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


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
	
//	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
////	@JoinColumn(name="account_fk")
//	@JsonManagedReference
//	private Account assetHolder;
	
	public Asset() {
		// TODO Auto-generated constructor stub
	}

	public Asset(int assetid, String currency, double balance) {
		super();
		this.assetid = assetid;
		this.currency = currency;
		this.balance = balance;
//		this.assetHolder = assetHolder;
	}

	public Asset(String currency, double balance) {
		super();
		this.currency = currency;
		this.balance = balance;
//		this.assetHolder = assetHolder;
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

//	public Account getAssetHolder() {
//		return assetHolder;
//	}
//
//	public void setAssetHolder(Account assetHolder) {
//		this.assetHolder = assetHolder;
//	}

	public int getAssetid() {
		return assetid;
	}

	@Override
	public String toString() {
		return "Asset [assetid=" + assetid + ", currency=" + currency + ", balance=" + balance + "]";
	}
	
	

}
