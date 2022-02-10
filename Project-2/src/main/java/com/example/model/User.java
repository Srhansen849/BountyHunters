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
@Table(name="user")
public class User {

	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="code_name")
	private String code_name;
	
	@OneToMany(mappedBy="bhHolder", fetch=FetchType.EAGER)
	@JsonBackReference
	private List<Account> account_list;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JsonBackReference
	private List<Bounty> bounty_list;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, String first_name, String last_name, String email, String code_name,
			List<Account> account_list, List<Bounty> bounty_list) {
		super();
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.code_name = code_name;
		this.account_list = account_list;
		this.bounty_list = bounty_list;
	}

	public User(int user_id, String username, String password, String first_name, String last_name, String email,
			String code_name, List<Account> account_list, List<Bounty> bounty_list) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.code_name = code_name;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCode_name() {
		return code_name;
	}


	public void setCode_name(String code_name) {
		this.code_name = code_name;
	}


	public List<Account> getAccount_list() {
		return account_list;
	}


	public void setAccount_list(List<Account> account_list) {
		this.account_list = account_list;
	}


	public int getUser_id() {
		return user_id;
	}
	
	public List<Bounty> getBounty_list() {
		return bounty_list;
	}

	public void setBounty_list(List<Bounty> bounty_list) {
		this.bounty_list = bounty_list;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + ", first_name="
				+ first_name + ", last_name=" + last_name + ", email=" + email + ", code_name=" + code_name
				+ ", account_list=" + account_list + ", bounty_list=" + bounty_list + "]";
	}


	
	
} 
	
	
	
	
	

