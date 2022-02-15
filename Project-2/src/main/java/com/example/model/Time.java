package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="time") 
public class Time {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int time_id;
	private String time_status;

	public Time() {
		// TODO Auto-generated constructor stub
	}
	
	public Time(String time_status) {
		super();
		this.time_status = time_status;
	}

	public Time(int time_id, String time_status) {
		super();
		this.time_id = time_id;
		this.time_status = time_status;
	}

	public String getTime_status() {
		return time_status;
	}

	public void setTime_status(String time_status) {
		this.time_status = time_status;
	}

	public int getTime_id() {
		return time_id;
	}

	@Override
	public String toString() {
		return "Time [time_id=" + time_id + ", time_status=" + time_status + "]";
	}
	
	
	
	
	
}
