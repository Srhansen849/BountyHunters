package com.example.model;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


=======

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

>>>>>>> 6f4b04aaea73daf95602b443e4ebbfc5d73858c8

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
	
<<<<<<< HEAD
=======
//	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
////	@JoinColumn(name="account_fk")
//	@JsonManagedReference
//	private Account assetHolder;
>>>>>>> 6f4b04aaea73daf95602b443e4ebbfc5d73858c8
	
	public Asset() {
		// TODO Auto-generated constructor stub
	}

	public Asset(int assetid, String currency, double balance) {
		super();
		this.assetid = assetid;
		this.currency = currency;
		this.balance = balance;
<<<<<<< HEAD

=======
//		this.assetHolder = assetHolder;
>>>>>>> 6f4b04aaea73daf95602b443e4ebbfc5d73858c8
	}

	public Asset(String currency, double balance) {
		super();
		this.currency = currency;
		this.balance = balance;
<<<<<<< HEAD

=======
//		this.assetHolder = assetHolder;
>>>>>>> 6f4b04aaea73daf95602b443e4ebbfc5d73858c8
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

<<<<<<< HEAD
	
=======
//	public Account getAssetHolder() {
//		return assetHolder;
//	}
//
//	public void setAssetHolder(Account assetHolder) {
//		this.assetHolder = assetHolder;
//	}
>>>>>>> 6f4b04aaea73daf95602b443e4ebbfc5d73858c8

	public int getAssetid() {
		return assetid;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Asset [assetid=" + assetid + ", currency=" + currency + ", balance=" + balance +"]";
=======
		return "Asset [assetid=" + assetid + ", currency=" + currency + ", balance=" + balance + "]";
>>>>>>> 6f4b04aaea73daf95602b443e4ebbfc5d73858c8
	}
	
	

}
