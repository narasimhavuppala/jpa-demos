package com.jpa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the person_details database table.
 * 
 */
@Entity
@Table(name="person_details")
@NamedQuery(name="PersonalDetails.findAll", query="SELECT p FROM PersonalDetails p")
public class PersonalDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(length=50)
	private String name;

	private double salary;

	private String ssn;

	public PersonalDetails() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

}