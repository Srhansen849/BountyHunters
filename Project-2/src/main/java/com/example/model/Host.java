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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Host")
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

	
	
	
	
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="host_id")
//	private int host_id;
//	@Column(name="username")
//	private String username;
//	@Column(name="password")
//	private String password;
//	@Column(name="association")
//	private String association;
//	@Column(name="email")
//	private String email;
//	@Column(name="representative")
//	private String representative;
//	
//	@OneToMany(mappedBy="acclist", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
//	@JsonBackReference
//	private List<Account> account_list;
//	
//	@OneToOne(fetch=FetchType.EAGER)
//	@JoinColumn(name="host_id")
//	private Bounty host;
//	
//	@Column(name="code_name")
//	private String code_name;
//	@Column(name="first_name")
//	private String first_name;
//	@Column(name="last_name")
//	private String last_name;
//	
//	public Host() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Host(int host_id, String username, String password, String association, String email, String representative,
//			List<Account> account_list, String code_name, String first_name, String last_name) {
//		super();
//		this.host_id = host_id;
//		this.username = username;
//		this.password = password;
//		this.association = association;
//		this.email = email;
//		this.representative = representative;
//		this.account_list = account_list;
//		this.code_name = code_name;
//		this.first_name = first_name;
//		this.last_name = last_name;
//	}
//
//	public Host(String username, String password, String association, String email, String representative,
//			List<Account> account_list, String code_name, String first_name, String last_name) {
//		super();
//		this.username = username;
//		this.password = password;
//		this.association = association;
//		this.email = email;
//		this.representative = representative;
//		this.account_list = account_list;
//		this.code_name = code_name;
//		this.first_name = first_name;
//		this.last_name = last_name;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getAssociation() {
//		return association;
//	}
//
//	public void setAssociation(String association) {
//		this.association = association;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getRepresentative() {
//		return representative;
//	}
//
//	public void setRepresentative(String representative) {
//		this.representative = representative;
//	}
//
//
//	public String getCode_name() {
//		return code_name;
//	}
//
//	public void setCode_name(String code_name) {
//		this.code_name = code_name;
//	}
//
//	public String getFirst_name() {
//		return first_name;
//	}
//
//	public void setFirst_name(String first_name) {
//		this.first_name = first_name;
//	}
//
//	public String getLast_name() {
//		return last_name;
//	}
//
//	public void setLast_name(String last_name) {
//		this.last_name = last_name;
//	}
//
//	public int getHost_id() {
//		return host_id;
//	}
//	
//	
//
//	public List<Account> getAccount_list() {
//		return account_list;
//	}
//
//	public void setAccount_list(List<Account> account_list) {
//		this.account_list = account_list;
//	}
//
//	@Override
//	public String toString() {
//		return "Host [host_id=" + host_id + ", username=" + username + ", password=" + password + ", association="
//				+ association + ", email=" + email + ", representative=" + representative + ", account_list=" + account_list
//				+ ", code_name=" + code_name + ", first_name=" + first_name + ", last_name=" + last_name + "]";
//	}
	
	

}
