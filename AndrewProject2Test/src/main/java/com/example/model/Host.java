package com.example.model;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="host")
@JsonIdentityInfo(generator =ObjectIdGenerators.IntSequenceGenerator.class, property = "hostid")
public class Host {
	
	@Id
	@Column(name="host_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int hostid;
	
	@Column(name="host_name", unique=true, nullable=false)
	private String hostname;
	
	@Column(name="username", unique=true, nullable=false)
	private String husername;
	
	@Column(name="password")
	private String hpassword;
	
	@Column(name="email", unique=true, nullable=false)
	private String hemail;
	
	@Column(name="association")
	private String hassociation;
	
	@Column(name="representative")
	private String representative;
	


	public Host() {
		// TODO Auto-generated constructor stub
	}

	
	public Host(int hostid, String hostname, String husername, String hpassword, String hemail, String hassociation,
			String representative) {
		super();
		this.hostid = hostid;
		this.hostname = hostname;
		this.husername = husername;
		this.hpassword = hpassword;
		this.hemail = hemail;
		this.hassociation = hassociation;
		this.representative = representative;
	}


	public Host(String hostname, String husername, String hpassword, String hemail, String hassociation,
			String representative) {
		super();
		this.hostname = hostname;
		this.husername = husername;
		this.hpassword = hpassword;
		this.hemail = hemail;
		this.hassociation = hassociation;
		this.representative = representative;

	}


	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getHusername() {
		return husername;
	}

	public void setHusername(String husername) {
		this.husername = husername;
	}

	public String getHpassword() {
		return hpassword;
	}

	public void setHpassword(String hpassword) {
		this.hpassword = hpassword;
	}

	public String getHemail() {
		return hemail;
	}

	public void setHemail(String hemail) {
		this.hemail = hemail;
	}

	public String getHassociation() {
		return hassociation;
	}

	public void setHassociation(String hassociation) {
		this.hassociation = hassociation;
	}

	public String getRepresentative() {
		return representative;
	}

	public void setRepresentative(String representative) {
		this.representative = representative;
	}




	public int getHostid() {
		return hostid;
	}

	@Override
	public String toString() {
		return "Host [hostname=" + hostname + ", husername=" + husername + ", hpassword="
				+ hpassword + ", hemail=" + hemail + ", hassociation=" + hassociation + ", representative="
				+ representative + "]";
	}


	


	


	

	
	
	

}
