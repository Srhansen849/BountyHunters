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


@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="accountid")
@Table(name="account")
public class Account {
	

	@Id
	@Column(name="account_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountid;

	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
//	@JoinColumn(name="asset_id")
	@JsonBackReference(value="al")
	private List<Asset> assetlist;

	
	public Account() {
		// TODO Auto-generated constructor stub
	}


	public Account(int accountid, List<Asset> assetlist) {
		super();
		this.accountid = accountid;
		this.assetlist = assetlist;
	}


	public Account(List<Asset> assetlist) {
		super();
		this.assetlist = assetlist;
	}


	public int getAccountid() {
		return accountid;
	}



	public List<Asset> getAssetlist() {
		return assetlist;
	}


	public void setAssetlist(List<Asset> assetlist) {
		this.assetlist = assetlist;
	}


	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", assetlist=" + assetlist + "]";
	}


	

		

}

