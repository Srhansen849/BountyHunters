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
//	@JoinColumn(name="user_fk")
	@JsonBackReference(value="bh")
	private User bhHolder;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//	@JoinColumn(name="host_fk")
	@JsonBackReference(value="hh")
	private Host hostHolder;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//	@JoinColumn(name="criminal_fk")
//	@JsonBackReference(value="c")
	private Criminal criminalid;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//	@JoinColumn(name="turnin_fk")
//	@JsonBackReference(value="ts")
	private Status turninid;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//	@JoinColumn(name="prefer_fk")
//	@JsonBackReference(value="ps")
	private Status preferid;

	

	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//	@JoinColumn(name="active_fk")
//	@JsonBackReference(value="as")
	private Status activeid;

	

	public Bounty() {
		// TODO Auto-generated constructor stub
	}


	public Bounty(int bountyid, String capture, double amount, String currency, User bhHolder, Host hostHolder,

			Criminal criminalid, Status turninid, Status preferid, String time, Status activeid) {

		super();
		this.bountyid = bountyid;
		this.capture = capture;
		this.amount = amount;
		this.currency = currency;
		this.bhHolder = bhHolder;
		this.hostHolder = hostHolder;
		this.criminalid = criminalid;
		this.turninid = turninid;

		this.preferid = preferid;


		this.time = time;
	}

	public Bounty(String capture, double amount, String currency, User bhHolder, Host hostHolder, Criminal criminalid,

			Status turninid, Status preferid, String time) {

		super();
		this.capture = capture;
		this.amount = amount;
		this.currency = currency;
		this.bhHolder = bhHolder;
		this.hostHolder = hostHolder;
		this.criminalid = criminalid;
		this.turninid = turninid;

		this.preferid = preferid;

		this.time = time;
	}
	
	public Bounty(String capture, double amount, String currency, Host hostHolder, Criminal criminalid,
			Status preferid, String time, Status activeid) {
		super();
		this.capture = capture;
		this.amount = amount;
		this.currency = currency;
		this.hostHolder = hostHolder;
		this.criminalid = criminalid;
		this.activeid = activeid;
		this.preferid = preferid;
		this.time = time;
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

	public Status getTurninid() {
		return turninid;
	}

	public void setTurninid(Status turninid) {
		this.turninid = turninid;
	}

	public Status getPreferid() {
		return preferid;
	}

	public void setPerfid(Status preferid) {
		this.preferid = preferid;
	}


	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getBountyid() {
		return bountyid;
	}

	public Status getActiveid() {
		return activeid;
	}

	public void setActiveid(Status activeid) {
		this.activeid = activeid;
	}

	@Override
	public String toString() {
		return "Bounty [bountyid=" + bountyid + ", capture=" + capture + ", amount=" + amount + ", currency=" + currency
				+ ", bhHolder=" + bhHolder + ", hostHolder=" + hostHolder + ", criminalid=" + criminalid + ", turninid="
				+ turninid + ", preferid=" + preferid + ", time=" + time + "]";

	}

	
	
	

}
