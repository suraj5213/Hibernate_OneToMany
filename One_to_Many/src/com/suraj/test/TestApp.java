package com.suraj.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suraj.bean.Person;
import com.suraj.bean.Vehicle;


public class TestApp {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		Person person = new Person();
		
		List<Vehicle> list = new ArrayList<Vehicle>();
		
		list.add(new Vehicle(1221,"ferrari"));
		list.add(new Vehicle(22,"bmw"));
		
		person.setId(102);
		person.setFirstname("pratik");
		person.setVehicle(list);
		
		session.save(person);
		
		for(Vehicle vehicle : list)
		{
			session.save(vehicle);
		}
		session.getTransaction().commit();

		session.close();

	}

}
