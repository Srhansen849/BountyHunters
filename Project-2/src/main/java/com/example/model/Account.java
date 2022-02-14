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
	
	
	@OneToMany(mappedBy="assetHolder", fetch=FetchType.EAGER)
	@JsonBackReference
	private List<Asset> asset_list;


	
	public Account() {
		// TODO Auto-generated constructor stub
	}



	public Account(int accountid, List<Asset> asset_list) {
		super();
		this.accountid = accountid;
		this.asset_list = asset_list;
	}



	public Account(List<Asset> asset_list) {
		super();
		this.asset_list = asset_list;
	}



	public List<Asset> getAsset_list() {
		return asset_list;
	}



	public void setAsset_list(List<Asset> asset_list) {
		this.asset_list = asset_list;
	}



	public int getAccountid() {
		return accountid;
	}



	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", asset_list=" + asset_list + "]";
	}
	
	

//	public Account(int accountid, String currency, double balance) {
//		super();
//		this.accountid = accountid;
//		this.currency = currency;
//		this.balance = balance;
//	}
//
//	public String getCurrancy() {
//		return currency;
//	}
//
//	public void setCurrancy(String currency) {
//		this.currency = currency;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//
//	public int getAccountid() {
//		return accountid;
//	}
//
//	@Override
//	public String toString() {
//		return "Account [accountid=" + accountid + ", currency=" + currency + ", balance=" + balance + "]";
//	}
	
	
		

}
