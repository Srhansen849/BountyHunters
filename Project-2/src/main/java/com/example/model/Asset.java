package com.example.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import javax.persistence.CascadeType;


import javax.persistence.FetchType;

import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="assetid")
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
	


	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//	@JoinColumn(name="account_fk")
	@JsonBackReference
	private Account accountid;

	
	public Asset() {
		// TODO Auto-generated constructor stub
	}

	public Asset(int assetid, String currency, double balance, Account assetHolder) {
		super();
		this.assetid = assetid;
		this.currency = currency;
		this.balance = balance;
		this.accountid = assetHolder;

	}

	public Asset(String currency, double balance, Account assetHolder) {
		super();
		this.currency = currency;
		this.balance = balance;
		this.accountid = assetHolder;

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



	public Account getAssetHolder() {
		return accountid;
	}

	public void setAssetHolder(Account assetHolder) {
		this.accountid = assetHolder;
	}


	public int getAssetid() {
		return assetid;
	}

	@Override
	public String toString() {
		return "Asset [assetid=" + assetid + ", currency=" + currency + ", balance=" + balance + ", account_id="
				+ accountid + "]";
	}

}
	


