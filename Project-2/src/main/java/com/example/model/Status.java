package com.example.model;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity

@Table(name="status")
public class Status {
	

	@Id
	@Column(name="status_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int statusid;
	
	@Column(name="status")
	private String status;

	
	
	public Status() {
		// TODO Auto-generated constructor stub
	}

	public Status(int statusid, String status) {
		super();
		this.statusid = statusid;
		this.status = status;
	}

	public Status(String status) {
		super();
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public int getStatusid() {
		return statusid;
	}

	@Override
	public String toString() {
		return "Status [statusid=" + statusid + ", status=" + status + "]";
	}
	

}
