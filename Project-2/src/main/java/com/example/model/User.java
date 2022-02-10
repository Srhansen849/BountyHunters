package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid;
	
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
	
	@Column(name="code_name")
	private String codename;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="account_fk")
	@JsonBackReference
	private Account account;
	
	@OneToMany(mappedBy="bhHolder", fetch=FetchType.EAGER)
	//@JoinColumn(name="bounty_fk")
	@JsonBackReference
	private List<Bounty> bounty_list;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userid, String firstname, String lastname, String username, String password, String email,
			String codename, Account account, List<Bounty> bounty_list) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.codename = codename;
		this.account = account;
		this.bounty_list = bounty_list;
	}

	public User(String firstname, String lastname, String username, String password, String email, String codename,
			Account account, List<Bounty> bounty_list) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.codename = codename;
		this.account = account;
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

	public String getCodename() {
		return codename;
	}

	public void setCodename(String codename) {
		this.codename = codename;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getUserid() {
		return userid;
	}

	public List<Bounty> getBounty_list() {
		return bounty_list;
	}

	public void setBounty_list(List<Bounty> bounty_list) {
		this.bounty_list = bounty_list;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
				+ username + ", password=" + password + ", email=" + email + ", codename=" + codename
				+ ", account=" + account + ", bounty_list=" + bounty_list + "]";
	}

		
}
