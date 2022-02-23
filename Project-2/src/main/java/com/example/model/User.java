package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "huntername")
public class User {


	@Id
	@Column(name="hunter_name", unique=true, nullable=false)
	private String huntername;
	
	@Column(name="username", unique=true, nullable=false)
	private String uusername;
	
	@Column(name="password")
	private String upassword;
	
	@Column(name="email", unique=true, nullable=false)
	private String uemail;
	
	@OneToMany(mappedBy="bhHolder", fetch=FetchType.EAGER)
//	@JoinColumn(name="bounty_fk")
	@JoinColumn(name="account_id")
	@JsonBackReference
	private Account uaccount;
	
	@JsonBackReference(value="ac")
	private Account account;
	
	@OneToMany(mappedBy="userfk", fetch=FetchType.EAGER)
	//@JoinColumn(name="bounty_fk")
	@JsonBackReference
	private List<Bounty> ubountylist;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String huntername, String uusername, String upassword, String uemail, Account uaccount,
			List<Bounty> ubountylist) {
		super();
		this.huntername = huntername;
		this.uusername = uusername;
		this.upassword = upassword;
		this.uemail = uemail;
		this.uaccount = uaccount;
		this.ubountylist = ubountylist;
	}

	public User(String huntername, String uusername, String upassword, String uemail, Account uaccount) {
		super();
		this.huntername = huntername;
		this.uusername = uusername;
		this.upassword = upassword;
		this.uemail = uemail;
		this.uaccount = uaccount;
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

	public List<Bounty> getUbountylist() {
		return ubountylist;
	}

	public void setUbounty_list(List<Bounty> ubountylist) {
		this.ubountylist = ubountylist;
	}


	public Account getUaccount() {
		return uaccount;
	}

	@Override
	public String toString() {
		return "User [huntername=" + huntername + ", uusername=" + uusername + ", upassword="
				+ upassword + ", uemail=" + uemail + ", uaccount=" + uaccount + ", ubountylist="
				+ ubountylist + "]";
	}

}
