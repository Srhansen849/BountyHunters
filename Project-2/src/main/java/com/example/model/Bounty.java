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
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
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
	@JoinColumn(name="user_id")
	@JsonManagedReference
	private User bhHolder;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="host_id")
	@JsonManagedReference
	private Host hostHolder;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="criminal_id")
	@JsonBackReference
	private Criminal criminalid;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="turnin_id")
	@JsonBackReference
	private Status turninid;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="prefer_id")
	@JsonBackReference
	private Status prefid;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="active_id")
	@JsonBackReference
	private Status activeid;
	
	public Bounty() {
		// TODO Auto-generated constructor stub
	}

	public Bounty(int bountyid, String capture, double amount, String currency, User bhHolder, Host hostHolder,
			Criminal criminalid, Status turninid, Status perfid, String time, Status activeid) {
		super();
		this.bountyid = bountyid;
		this.capture = capture;
		this.amount = amount;
		this.currency = currency;
		this.bhHolder = bhHolder;
		this.hostHolder = hostHolder;
		this.criminalid = criminalid;
		this.turninid = turninid;
		this.prefid = perfid;
		this.time = time;
	}

	public Bounty(String capture, double amount, String currency, User bhHolder, Host hostHolder, Criminal criminalid,
			Status turninid, Status perfid, String time, Status activeid) {
		super();
		this.capture = capture;
		this.amount = amount;
		this.currency = currency;
		this.bhHolder = bhHolder;
		this.hostHolder = hostHolder;
		this.criminalid = criminalid;
		this.turninid = turninid;
		this.prefid = perfid;
		this.time = time;
	}
	
	public Bounty(String capture, double amount, String currency, Host hostHolder, Criminal criminalid,
			Status prefid, String time, Status activeid) {
		super();
		this.capture = capture;
		this.amount = amount;
		this.currency = currency;
		this.hostHolder = hostHolder;
		this.criminalid = criminalid;
		this.activeid = activeid;
		this.prefid = prefid;
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

	public Status getPrefid() {
		return prefid;
	}

	public void setPerfid(Status perfid) {
		this.prefid = perfid;
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
				+ ", time=" + time + ", bhHolder=" + bhHolder + ", hostHolder=" + hostHolder + ", criminalid="
				+ criminalid + ", turninid=" + turninid + ", prefid=" + prefid + ", activeid=" + activeid + "]";
	}

	
	
	
}
