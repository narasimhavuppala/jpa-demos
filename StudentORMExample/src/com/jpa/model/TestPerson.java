package com.jpa.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestPerson {

	public static void main(String[] args) {

		PersonDetails obj=new PersonDetails(50);
		//obj.setId(1);
		obj.setName("Narasimha");
		obj.setSalary(123456.00);
		obj.setSSN("USA123456");
		
		
		PersonDetails obj1=new PersonDetails(50);
		//obj1.setId(1);
		obj1.setName("Narasimha");
		obj1.setSalary(123456.00);
		obj1.setSSN("USA123456");
		
		EntityManagerFactory  emf=Persistence.createEntityManagerFactory("StudentORMExample");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(obj);
		em.persist(obj1);
		em.getTransaction().commit();
		
	}

}
