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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="bountyid")
@Table(name="bounty")
public class Bounty {
	

	@Id
	@Column(name="bounty_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bountyid;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="time")
	private String time;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="user_fk")
	private User userfk;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="host_fk")
	private Host hostfk;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="criminal_fk")
	private Criminal criminalfk;
	

	private String turninid;
	

	private String preferid;

	
	private String activeid;

	

	public Bounty() {
		// TODO Auto-generated constructor stub
	}



	public Bounty(int bountyid, double amount, String currency, String time, User userfk, Host hostfk,
			Criminal criminalfk, String turninid, String preferid, String activeid) {
		super();
		this.bountyid = bountyid;
		this.amount = amount;
		this.currency = currency;
		this.time = time;
		this.userfk = userfk;
		this.hostfk = hostfk;
		this.criminalfk = criminalfk;
		this.turninid = turninid;
		this.preferid = preferid;
		this.activeid = activeid;
	}



	public Bounty(double amount, String currency, String time, User userfk, Host hostfk, Criminal criminalfk,
			String turninid, String preferid, String activeid) {
		super();
		this.amount = amount;
		this.currency = currency;
		this.time = time;
		this.userfk = userfk;
		this.hostfk = hostfk;
		this.criminalfk = criminalfk;
		this.turninid = turninid;
		this.preferid = preferid;
		this.activeid = activeid;
	}



	public Bounty(double amount, String currency, String time, Host hostfk, Criminal criminalfk, String preferid,
			String activeid) {
		super();
		this.amount = amount;
		this.currency = currency;
		this.time = time;
		this.hostfk = hostfk;
		this.criminalfk = criminalfk;
		this.preferid = preferid;
		this.activeid = activeid;
	}



	public Bounty(int bountyid, User userfk, Criminal criminalfk, String turninid) {
		super();
		this.bountyid = bountyid;
		this.userfk = userfk;
		this.criminalfk = criminalfk;
		this.turninid = turninid;
	}



	public Bounty(int bountyid, double amount, User userfk, Host hostfk, Criminal criminalfk, String activeid) {
		super();
		this.bountyid = bountyid;
		this.amount = amount;
		this.userfk = userfk;
		this.hostfk = hostfk;
		this.criminalfk = criminalfk;
		this.activeid = activeid;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}





	public User getUserfk() {
		return userfk;
	}



	public void setUserfk(User userfk) {
		this.userfk = userfk;
	}



	public Host getHostfk() {
		return hostfk;
	}



	public void setHostfk(Host hostfk) {
		this.hostfk = hostfk;
	}



	public Criminal getCriminalfk() {
		return criminalfk;
	}



	public void setCriminalfk(Criminal criminalfk) {
		this.criminalfk = criminalfk;
	}



	public String getTurninid() {
		return turninid;
	}



	public void setTurninid(String turninid) {
		this.turninid = turninid;
	}



	public String getPreferid() {
		return preferid;
	}



	public void setPreferid(String preferid) {
		this.preferid = preferid;
	}



	public String getActiveid() {
		return activeid;
	}



	public void setActiveid(String activeid) {
		this.activeid = activeid;
	}



	public int getBountyid() {
		return bountyid;
	}



	@Override
	public String toString() {
		return "Bounty [bountyid=" + bountyid + ", amount=" + amount + ", currency=" + currency + ", time=" + time
				+ ", userfk=" + userfk + ", hostfk=" + hostfk + ", criminalfk=" + criminalfk + ", turninid=" + turninid
				+ ", preferid=" + preferid + ", activeid=" + activeid + "]";
	}





	




	

	
	
	

}
