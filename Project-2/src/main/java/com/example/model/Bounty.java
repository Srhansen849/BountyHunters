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
@Table(name="Bounty")
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
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="user_fk")
	@JsonManagedReference
	private User bhHolder;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="host_fk")
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
	private Status perfid;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="time_id")
	@JsonBackReference
	private Time timeid;

	
	
	
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="bounty_id")
//	private int bounty_id;
//	@Column(name="capture_description")
//	private String capture_description;
//	
//	@OneToOne(mappedBy="bounty", fetch=FetchType.EAGER, optional=false, cascade=CascadeType.ALL)
//	private Criminal criminal_id;
//	
//	
//	@ManyToOne(fetch = FetchType.EAGER, optional = false)
//	@JsonManagedReference
//	@JoinColumn(name="active_bounty_list")
//	private User actbountlist;
//	
//	@ManyToOne(fetch = FetchType.EAGER, optional = false)
//	@JsonManagedReference
//	@JoinColumn(name="completed_bounty_list")
//	private User compbountlist;
//	
//	
//	@OneToOne(mappedBy="timestat",fetch = FetchType.EAGER, optional = false, cascade=CascadeType.ALL)
//	private Time time_limit_id;
//	
//	@OneToOne(mappedBy="turninstat",fetch = FetchType.EAGER, optional = false, cascade=CascadeType.ALL)
//	private Status turnin_id;
//	
//	
//	@OneToOne(mappedBy="preferedstat",fetch = FetchType.EAGER, optional = false, cascade=CascadeType.ALL)
//	private Status prefered_status_id;
//	
//	@OneToOne(mappedBy="host",fetch = FetchType.EAGER, optional = false, cascade=CascadeType.ALL)
//	private Host host_id;
	
	
	
//	@Column(name="turnin_id")
//	private int turnin_id;
//	@Column(name="criminal_id")
//	private int criminal_id;
//	@Column(name="host_id")
//	private int host_id;
//	@Column(name="prefered_status_id")
//	private int prefered_status_id;
//	@Column(name="time_limit_id")
//	private int time_limit_id;
	
//	@OneToOne(fetch=FetchType.EAGER, optional=false)
//	@JoinColumn(name="", nullable=false)
//	private User user;
	
	
	public Bounty() {
		// TODO Auto-generated constructor stub
	}

//	public Bounty(int bounty_id, String capture_description, int turnin_id, int criminal_id, int host_id,
//			int prefered_status_id, int time_limit_id) {
//		super();
//		this.bounty_id = bounty_id;
//		this.capture_description = capture_description;
//		this.turnin_id = turnin_id;
//		this.criminal_id = criminal_id;
//		this.host_id = host_id;
//		this.prefered_status_id = prefered_status_id;
//		this.time_limit_id = time_limit_id;
//	}
//
//	public Bounty(String capture_description, int turnin_id, int criminal_id, int host_id, int prefered_status_id,
//			int time_limit_id) {
//		super();
//		this.capture_description = capture_description;
//		this.turnin_id = turnin_id;
//		this.criminal_id = criminal_id;
//		this.host_id = host_id;
//		this.prefered_status_id = prefered_status_id;
//		this.time_limit_id = time_limit_id;
//	}
//
//	public String getCapture_description() {
//		return capture_description;
//	}
//
//	public void setCapture_description(String capture_description) {
//		this.capture_description = capture_description;
//	}
//
//	public int getTurnin_id() {
//		return turnin_id;
//	}
//
//	public void setTurnin_id(int turnin_id) {
//		this.turnin_id = turnin_id;
//	}
//
//	public int getCriminal_id() {
//		return criminal_id;
//	}
//
//	public void setCriminal_id(int criminal_id) {
//		this.criminal_id = criminal_id;
//	}
//
//	public int getHost_id() {
//		return host_id;
//	}
//
//	public void setHost_id(int host_id) {
//		this.host_id = host_id;
//	}
//
//	public int getPrefered_status_id() {
//		return prefered_status_id;
//	}
//
//	public void setPrefered_status_id(int prefered_status_id) {
//		this.prefered_status_id = prefered_status_id;
//	}
//
//	public int getTime_limit_id() {
//		return time_limit_id;
//	}
//
//	public void setTime_limit_id(int time_limit_id) {
//		this.time_limit_id = time_limit_id;
//	}
//
//	public int getBounty_id() {
//		return bounty_id;
//	}
//
//	@Override
//	public String toString() {
//		return "Bounty [bounty_id=" + bounty_id + ", capture_description=" + capture_description + ", turnin_id="
//				+ turnin_id + ", criminal_id=" + criminal_id + ", host_id=" + host_id + ", prefered_status_id="
//				+ prefered_status_id + ", time_limit_id=" + time_limit_id + "]";
//	}
	
	

}
