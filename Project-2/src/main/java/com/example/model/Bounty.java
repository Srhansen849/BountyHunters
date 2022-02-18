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
	
	@Column(name="capture")
	private String capture;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="time")
	private String time;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="user_fk")
	@JsonBackReference(value="bh")
	private User bhHolder;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="host_fk")
	@JsonBackReference(value="hh")
	private Host hostHolder;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="criminal_fk")
//	@JsonBackReference(value="c")
	private Criminal criminalid;
	

	private String turninid;
	

	private String preferid;

	
	private String activeid;

	

	public Bounty() {
		// TODO Auto-generated constructor stub
	}






	public Bounty(int bountyid, String capture, double amount, String currency, String time, User bhHolder,
			Host hostHolder, Criminal criminalid, String turninid, String preferid, String activeid) {
		super();
		this.bountyid = bountyid;
		this.capture = capture;
		this.amount = amount;
		this.currency = currency;
		this.time = time;
		this.bhHolder = bhHolder;
		this.hostHolder = hostHolder;
		this.criminalid = criminalid;
		this.turninid = turninid;
		this.preferid = preferid;
		this.activeid = activeid;
	}






	public Bounty(String capture, double amount, String currency, String time, User bhHolder, Host hostHolder,
			Criminal criminalid, String turninid, String preferid, String activeid) {
		super();
		this.capture = capture;
		this.amount = amount;
		this.currency = currency;
		this.time = time;
		this.bhHolder = bhHolder;
		this.hostHolder = hostHolder;
		this.criminalid = criminalid;
		this.turninid = turninid;
		this.preferid = preferid;
		this.activeid = activeid;
	}
	
	
	






	public Bounty(double amount, String currency, Host hostHolder, Criminal criminalid, String preferid,
			String time, String activeid) {
		super();
		this.amount = amount;
		this.currency = currency;
		this.time = time;
		this.hostHolder = hostHolder;
		this.criminalid = criminalid;
		this.preferid = preferid;
		this.activeid = activeid;
	}






	public String getCapture() {
		return capture;
	}






	public void setCapture(String capture) {
		this.capture = capture;
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






	public User getBhHolder() {
		return bhHolder;
	}






	public void setBhHolder(User bhHolder) {
		this.bhHolder = bhHolder;
	}






	public Host getHostHolder() {
		return hostHolder;
	}






	public void setHostHolder(Host hostHolder) {
		this.hostHolder = hostHolder;
	}






	public Criminal getCriminalid() {
		return criminalid;
	}






	public void setCriminalid(Criminal criminalid) {
		this.criminalid = criminalid;
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
		return "Bounty [bountyid=" + bountyid + ", capture=" + capture + ", amount=" + amount + ", currency=" + currency
				+ ", bhHolder=" + bhHolder + ", hostHolder=" + hostHolder + ", criminalid=" + criminalid + ", turninid="
				+ turninid + ", preferid=" + preferid + ", time=" + time + "]";

	}

	
	
	

}
