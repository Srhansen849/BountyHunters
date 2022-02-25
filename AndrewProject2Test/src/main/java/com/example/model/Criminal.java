package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "criminal")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "criminalid")
public class Criminal {

	@Id
	@Column(name = "criminal_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int criminalid;

	@Column(name = "crim_name", unique = true, nullable = false)
	private String crimname;

	@Column(name = "height")
	private double height;

	@Column(name = "weight")
	private double weight;

	@Column(name = "species")
	private String species;

	public Criminal() {
		// TODO Auto-generated constructor stub
	}

	public Criminal(int criminalid, String crimname, double height, double weight, String species) {
		super();
		this.criminalid = criminalid;
		this.crimname = crimname;
		this.height = height;
		this.weight = weight;
		this.species = species;
	}

	public Criminal(String crimname, double height, double weight, String species) {
		super();
		this.crimname = crimname;
		this.height = height;
		this.weight = weight;
		this.species = species;
	}

	public String getCrimname() {
		return crimname;
	}

	public void setCrimname(String crimname) {
		this.crimname = crimname;
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

	public int getCriminalid() {
		return criminalid;
	}

	@Override
	public String toString() {
		return "Criminal [" + "crimname=" + crimname + ", height=" + height + ", weight=" + weight + ", species="
				+ species + "]";
	}

}
