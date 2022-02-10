package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Time")
public class Time {
	
	
	@Id
	@Column(name="time_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int timeid;
	
	@Column(name="time_status")
	private String timestatus;

	
	
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="time_id")
//	private int time_id;
//	@Column(name="time_status")
//	private String time_status;//Might need to be date or something else
//	
//	@OneToOne(fetch = FetchType.EAGER, optional = false)
//	@JoinColumn(name="time_limit_id")
//	private Bounty timestat;
//	
//	public Time() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Time(int time_id, String time_status) {
//		super();
//		this.time_id = time_id;
//		this.time_status = time_status;
//	}
//
//	public Time(String time_status) {
//		super();
//		this.time_status = time_status;
//	}
//
//	public String getTime_status() {
//		return time_status;
//	}
//
//	public void setTime_status(String time_status) {
//		this.time_status = time_status;
//	}
//
//	public int getTime_id() {
//		return time_id;
//	}
//
//	@Override
//	public String toString() {
//		return "Time [time_id=" + time_id + ", time_status=" + time_status + "]";
//	}
	
	

}
