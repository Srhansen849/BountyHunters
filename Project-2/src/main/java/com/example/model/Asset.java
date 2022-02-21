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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "asset")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "assetid")
public class Asset {

	@Id
	@Column(name = "asset_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int assetid;

	@Column(name = "currency")
	private String ascurrency;

	@Column(name = "balance")
	private double balance;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "account_fk")
	@JsonManagedReference
	private Account accountfk;

	public Asset() {
		// TODO Auto-generated constructor stub
	}

	public Asset(int assetid, String ascurrency, double balance, Account accountfk) {
		super();
		this.assetid = assetid;
		this.ascurrency = ascurrency;
		this.balance = balance;
		this.accountfk = accountfk;
	}

	public Asset(String ascurrency, double balance, Account accountfk) {
		super();
		this.ascurrency = ascurrency;
		this.balance = balance;
		this.accountfk = accountfk;
	}

	public String getAscurrency() {
		return ascurrency;
	}

	public void setAscurrency(String ascurrency) {
		this.ascurrency = ascurrency;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account getAccountfk() {
		return accountfk;
	}

	public void setAccountfk(Account accountfk) {
		this.accountfk = accountfk;
	}

	public int getAssetid() {
		return assetid;
	}

	@Override
	public String toString() {
		return "Asset [assetid=" + assetid + ", ascurrency=" + ascurrency + ", balance=" + balance + ", accountfk="
				+ accountfk + "]";
	}

}
