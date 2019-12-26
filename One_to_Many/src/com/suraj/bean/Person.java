package com.suraj.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name",length=10)
	private String firstname;
	
	@OneToMany
	List<Vehicle> vehicle = new ArrayList<Vehicle>();

	public Person() {
		super();
	}

	public Person(int id, String firstname, List<Vehicle> vehicle) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.vehicle = vehicle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstname=" + firstname + ", vehicle=" + vehicle + "]";
	}

	

}
