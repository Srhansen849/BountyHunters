package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="time")
public class Time {
	
	@Id
	@Column(name="time_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int timeid;
	
	@Column(name="time_status")
	private String timestatus;
	
	
	public Time() {
		// TODO Auto-generated constructor stub
	}

	public Time(int timeid, String timestatus) {
		super();
		this.timeid = timeid;
		this.timestatus = timestatus;
	}

	public String getTimestatus() {
		return timestatus;
	}

	public void setTimestatus(String timestatus) {
		this.timestatus = timestatus;
	}


	public int getTimeid() {
		return timeid;
	}

	@Override
	public String toString() {
		return "Time [timeid=" + timeid + ", timestatus=" + timestatus + "]";
	}
	
	
}
