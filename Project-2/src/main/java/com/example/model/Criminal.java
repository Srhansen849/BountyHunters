package com.example.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity

@Table(name="criminal")

public class Criminal {
	
	@Id
	@Column(name="ciminal_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int criminalid;
	
	@Column(name="first_name", nullable=false)
	private String firstname;
	
	@Column(name="last_name", nullable=false)
	private String lastname;
	
	@Column(name="code_name", unique=true)
	private String codename;
	
	@Column(name="description")
	private String description;
	
	@Column(name="organization")
	private String organization;
	
	@Column(name="height")
	private double height;
	
	@Column(name="weight")
	private double weight;
	
	@Column(name="species")
	private String species;
	
	@Column(name="associates")
	private String associates;

	
	
	public Criminal() {
		// TODO Auto-generated constructor stub
	}

	public Criminal(int criminalid, String firstname, String lastname, String codename, String description,
			String organization, double height, double weight, String species, String associates) {
		super();
		this.criminalid = criminalid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.codename = codename;
		this.description = description;
		this.organization = organization;
		this.height = height;
		this.weight = weight;
		this.species = species;
		this.associates = associates;
	}
	
	public Criminal(String firstname, String lastname, String codename, String description, String organization,
			double height, double weight, String species, String associates) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.codename = codename;
		this.description = description;
		this.organization = organization;
		this.height = height;
		this.weight = weight;
		this.species = species;
		this.associates = associates;
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

	public String getCodename() {
		return codename;
	}

	public void setCodename(String codename) {
		this.codename = codename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getAssociates() {
		return associates;
	}

	public void setAssociates(String associates) {
		this.associates = associates;
	}


	public int getCriminalid() {
		return criminalid;
	}

	@Override
	public String toString() {
		return "Criminal [criminalid=" + criminalid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", codename=" + codename + ", description=" + description + ", organization=" + organization
				+ ", height=" + height + ", weight=" + weight + ", species=" + species + ", associates=" + associates
				+ "]";
	}

	

}
