package com.suraj.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	
	@Id
	@Column(name = "veh_id")
	private int veh_id;
	
	@Column(name = "veh_name",length=10)
	private String veh_name;

	public Vehicle() {
		super();
	}

	public Vehicle(int veh_id, String veh_name) {
		super();
		this.veh_id = veh_id;
		this.veh_name = veh_name;
	}

	public int getVeh_id() {
		return veh_id;
	}

	public void setVeh_id(int veh_id) {
		this.veh_id = veh_id;
	}

	public String getVeh_name() {
		return veh_name;
	}

	public void setVeh_name(String veh_name) {
		this.veh_name = veh_name;
	}

	@Override
	public String toString() {
		return "Vehicle [veh_id=" + veh_id + ", veh_name=" + veh_name + "]";
	}
	
	

}
