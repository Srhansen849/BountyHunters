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
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "accountid")
@Entity
@Table(name = "account")
public class Account {

	@Id
	@Column(name = "account_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountid;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name="account_id")
	private List<Asset> asset;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accountid, List<Asset> asset) {
		super();
		this.accountid = accountid;
		this.asset = asset;
	}

	public Account(List<Asset> asset) {
		super();
		this.asset = asset;
	}

	public int getAccountid() {
		return accountid;
	}

	public List<Asset> getAsset() {
		return asset;
	}

	public void setAsset(List<Asset> asset) {
		this.asset = asset;
	}

	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", asset=" + asset + "]";
	}

}
