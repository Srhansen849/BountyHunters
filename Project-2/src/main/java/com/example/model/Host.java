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

@Entity
@Table(name="host")
public class Host {
	
	@Id
	@Column(name="host_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int hostid;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="association")
	private String association;
	
	@Column(name="representative")
	private String representative;
	
	@Column(name="code_name")
	private String codename;
	
	@OneToMany(mappedBy="hostHolder", fetch=FetchType.EAGER)
	@JsonBackReference
	private List<Bounty> bounty_list;
	
	public Host() {
		// TODO Auto-generated constructor stub
	}

	public Host(int hostid, String firstname, String lastname, String username, String password, String email,
			String association, String representative, String codename,
			List<Bounty> bounty_list) {
		super();
		this.hostid = hostid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.association = association;
		this.representative = representative;
		this.codename = codename;
		this.bounty_list = bounty_list;
	}

	public Host(String firstname, String lastname, String username, String password, String email, String association,
			String representative, String codename, List<Bounty> bounty_list) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.association = association;
		this.representative = representative;
		this.codename = codename;
		this.bounty_list = bounty_list;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAssociation() {
		return association;
	}

	public void setAssociation(String association) {
		this.association = association;
	}

	public String getRepresentative() {
		return representative;
	}

	public void setRepresentative(String representative) {
		this.representative = representative;
	}

	public String getCodename() {
		return codename;
	}

	public void setCodename(String codename) {
		this.codename = codename;
	}


	public List<Bounty> getBounty_list() {
		return bounty_list;
	}

	public void setBounty_list(List<Bounty> bounty_list) {
		this.bounty_list = bounty_list;
	}

	public int getHostid() {
		return hostid;
	}

	@Override
	public String toString() {
		return "Host [hostid=" + hostid + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
				+ username + ", password=" + password + ", email=" + email + ", association=" + association
				+ ", representative=" + representative + ", codename=" + codename + 
				", bounty_list=" + bounty_list + "]";
	}
	
	
}
