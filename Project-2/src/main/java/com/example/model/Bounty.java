package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bounty")
public class Bounty {

	@Id
	@Column(name="bounty_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bounty_id;
	
	@Column(name="capture_description")
	private String capture_description;
	
	@Column(name="turnin_id")
	private int turnin_id;
	
	@Column(name="criminal_id")
	private int criminal_id;
	
	@Column(name="host_id")
	private int host_id;
	
	@Column(name="prefered_status")
	private int prefered_status;
	
	@Column(name="time_limit_id")
	private int time_limit_id;
	
	public Bounty() {
		// TODO Auto-generated constructor stub
	}

	public Bounty(String capture_description, int turnin_id, int criminal_id, int host_id, int prefered_status,
			int time_limit_id) {
		super();
		this.capture_description = capture_description;
		this.turnin_id = turnin_id;
		this.criminal_id = criminal_id;
		this.host_id = host_id;
		this.prefered_status = prefered_status;
		this.time_limit_id = time_limit_id;
	}

	public Bounty(int bounty_id, String capture_description, int turnin_id, int criminal_id, int host_id,
			int prefered_status, int time_limit_id) {
		super();
		this.bounty_id = bounty_id;
		this.capture_description = capture_description;
		this.turnin_id = turnin_id;
		this.criminal_id = criminal_id;
		this.host_id = host_id;
		this.prefered_status = prefered_status;
		this.time_limit_id = time_limit_id;
	}

	public String getCapture_description() {
		return capture_description;
	}

	public void setCapture_description(String capture_description) {
		this.capture_description = capture_description;
	}

	public int getTurnin_id() {
		return turnin_id;
	}

	public void setTurnin_id(int turnin_id) {
		this.turnin_id = turnin_id;
	}

	public int getCriminal_id() {
		return criminal_id;
	}

	public void setCriminal_id(int criminal_id) {
		this.criminal_id = criminal_id;
	}

	public int getHost_id() {
		return host_id;
	}

	public void setHost_id(int host_id) {
		this.host_id = host_id;
	}

	public int getPrefered_status() {
		return prefered_status;
	}

	public void setPrefered_status(int prefered_status) {
		this.prefered_status = prefered_status;
	}

	public int getTime_limit_id() {
		return time_limit_id;
	}

	public void setTime_limit_id(int time_limit_id) {
		this.time_limit_id = time_limit_id;
	}

	public int getBounty_id() {
		return bounty_id;
	}

	@Override
	public String toString() {
		return "Bounty [bounty_id=" + bounty_id + ", capture_description=" + capture_description + ", turnin_id="
				+ turnin_id + ", criminal_id=" + criminal_id + ", host_id=" + host_id + ", prefered_status="
				+ prefered_status + ", time_limit_id=" + time_limit_id + "]";
	}
	
	
	
	
	
	
	
	
}
