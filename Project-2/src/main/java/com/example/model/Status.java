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
@Table(name="Status")
public class Status {
	
	
	@Id
	@Column(name="status_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int statusid;
	
	@Column(name="status")
	private String status;

	
	
	
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="status_id")
//	private int status_id;
//	@Column(name="status")
//	private String status;
//	
//	@OneToOne(fetch = FetchType.EAGER, optional = false)
//	@JoinColumn(name="turnin_id")
//	private Bounty turninstat;
//	
//	@OneToOne(fetch = FetchType.EAGER, optional = false)
//	@JoinColumn(name="prefered_status_id")
//	private Bounty preferedstat;
//	
//	public Status() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Status(int status_id, String status) {
//		super();
//		this.status_id = status_id;
//		this.status = status;
//	}
//
//	public Status(String status) {
//		super();
//		this.status = status;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
//
//	public int getStatus_id() {
//		return status_id;
//	}
//
//	@Override
//	public String toString() {
//		return "Status [status_id=" + status_id + ", status=" + status + "]";
//	}
	
	

}
