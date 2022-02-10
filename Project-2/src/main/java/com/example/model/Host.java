package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="host")
public class Host {
	
	@Id
	@Column(name="host_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int host_id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="association")
	private String association;
	
	@Column(name="email")
	private String email;
	
	@Column(name="representative")
	private String representative;
	
//	@Column(name="account_id")
//	private int account_id;
	
	@Column(name="code_name")
	private String code_name;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	private List<Account> account_list;
	
	private List<Bounty> bounty_list;
	
	public Host() {
		// TODO Auto-generated constructor stub
	}

	public Host(String username, String password, String association, String email, String representative, 
				String code_name, String first_name, String last_name, List<Account> account_list, List<Bounty> bounty_list) {
		super();
		this.username = username;
		this.password = password;
		this.association = association;
		this.email = email;
		this.representative = representative;
//		this.account_id = account_id;
		this.code_name = code_name;
		this.first_name = first_name;
		this.last_name = last_name;
		this.account_list = account_list;
		this.bounty_list = bounty_list;
		
		
	}

	public Host(int host_id, String username, String password, String association, String email, String representative,
			String code_name, String first_name, String last_name, List<Account> account_list, List<Bounty> bounty_list) {
		super();
		this.host_id = host_id;
		this.username = username;
		this.password = password;
		this.association = association;
		this.email = email;
		this.representative = representative;
//		this.account_id = account_id;
		this.code_name = code_name;
		this.first_name = first_name;
		this.last_name = last_name;
		this.account_list = account_list;
		this.bounty_list = bounty_list;
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

	public String getAssociation() {
		return association;
	}

	public void setAssociation(String association) {
		this.association = association;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRepresentative() {
		return representative;
	}

	public void setRepresentative(String representative) {
		this.representative = representative;
	}

//	public int getAccount_id() {
//		return account_id;
//	}
//
//	public void setAccount_id(int account_id) {
//		this.account_id = account_id;
//	}

	public String getCode_name() {
		return code_name;
	}

	public void setCode_name(String code_name) {
		this.code_name = code_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getHost_id() {
		return host_id;
	}

	public List<Account> getAccount_list() {
		return account_list;
	}

	public void setAccount_list(List<Account> account_list) {
		this.account_list = account_list;
	}

	public List<Bounty> getBounty_list() {
		return bounty_list;
	}

	public void setBounty_list(List<Bounty> bounty_list) {
		this.bounty_list = bounty_list;
	}

	@Override
	public String toString() {
		return "Host [host_id=" + host_id + ", username=" + username + ", password=" + password + ", association="
				+ association + ", email=" + email + ", representative=" + representative + ", code_name=" + code_name
				+ ", first_name=" + first_name + ", last_name=" + last_name + ", account_list=" + account_list
				+ ", bounty_list=" + bounty_list + "]";
	}

	
	
	
	

}
