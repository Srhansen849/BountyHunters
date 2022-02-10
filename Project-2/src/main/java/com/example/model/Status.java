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
	private int status_id;
	

	@Column(name="status")
	private String status;
	
	public Status() {
		// TODO Auto-generated constructor stub
	}

	public Status(String status) {
		super();
		this.status = status;
	}

	public Status(int status_id, String status) {
		super();
		this.status_id = status_id;
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStatus_id() {
		return status_id;
	}

	@Override
	public String toString() {
		return "Status [status_id=" + status_id + ", status=" + status + "]";
	}
	
	
	
	

}
