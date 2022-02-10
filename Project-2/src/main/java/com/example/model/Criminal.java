package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="criminal")
public class Criminal {
	
	@Id
	@Column(name="criminal_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int criminal_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="code_name")
	private String code_name;
	
	@Column(name="physical_description")
	private String physical_description;
	
	@Column(name="height")
	private double height;
	
	@Column(name="weight")
	private double weight;
	
	@Column(name="organization")
	private String organization;
	
	@Column(name="associates")
	private String associates;
	
	@Column(name="species")
	private String species;
	
	public Criminal() {
		// TODO Auto-generated constructor stub
	}
	
	public Criminal(String first_name, String last_name, String code_name, String physical_description, double height,
			double weight, String organization, String associates, String species) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.code_name = code_name;
		this.physical_description = physical_description;
		this.height = height;
		this.weight = weight;
		this.organization = organization;
		this.associates = associates;
		this.species = species;
	}

	public Criminal(int criminal_id, String first_name, String last_name, String code_name, String physical_description,
			double height, double weight, String organization, String associates, String species) {
		super();
		this.criminal_id = criminal_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.code_name = code_name;
		this.physical_description = physical_description;
		this.height = height;
		this.weight = weight;
		this.organization = organization;
		this.associates = associates;
		this.species = species;
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

	public String getCode_name() {
		return code_name;
	}

	public void setCode_name(String code_name) {
		this.code_name = code_name;
	}

	public String getPhysical_description() {
		return physical_description;
	}

	public void setPhysical_description(String physical_description) {
		this.physical_description = physical_description;
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

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getAssociates() {
		return associates;
	}

	public void setAssociates(String associates) {
		this.associates = associates;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getCriminal_id() {
		return criminal_id;
	}

	@Override
	public String toString() {
		return "Criminal [criminal_id=" + criminal_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", code_name=" + code_name + ", physical_description=" + physical_description + ", height=" + height
				+ ", weight=" + weight + ", organization=" + organization + ", associates=" + associates + ", species="
				+ species + "]";
	}
	
	
	
	

}
