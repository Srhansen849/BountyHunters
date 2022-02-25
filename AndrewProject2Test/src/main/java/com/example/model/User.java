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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="user_table")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "userid")
public class User {

	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid;
	
	@Column(name="hunter_name", unique=true, nullable=false)
	private String huntername;
	
	@Column(name="username", unique=true, nullable=false)
	private String uusername;
	
	@Column(name="password")
	private String upassword;
	
	@Column(name="email", unique=true, nullable=false)
	private String uemail;
	
	private int rank;
	

	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="account_id")
	@JsonBackReference(value = "ac")
	private Account uaccount;
	

	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userid, String huntername, String uusername, String upassword, String uemail, Account uaccount, int rank) {
		super();
		this.userid = userid;
		this.huntername = huntername;
		this.uusername = uusername;
		this.upassword = upassword;
		this.uemail = uemail;
		this.uaccount = uaccount;
		this.rank = rank;
	}


	public User(String huntername, String uusername, String upassword, String uemail, Account uaccount, int rank) {
		super();
		this.huntername = huntername;
		this.uusername = uusername;
		this.upassword = upassword;
		this.uemail = uemail;
		this.uaccount = uaccount;
		this.rank = rank;
	}



	public String getHuntername() {
		return huntername;
	}

	public void setHuntername(String huntername) {
		this.huntername = huntername;
	}

	public String getUusername() {
		return uusername;
	}

	public void setUusername(String uusername) {
		this.uusername = uusername;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}


	public Account getUaccount() {
		return uaccount;
	}

	public int getUserid() {
		return userid;
	}
	

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "User [huntername=" + huntername + ", uusername=" + uusername + ", upassword="
				+ upassword + ", uemail=" + uemail + ", uaccount=" + uaccount + ", ubountylist="
				+ "]";
	}

	

	

	

		

}

