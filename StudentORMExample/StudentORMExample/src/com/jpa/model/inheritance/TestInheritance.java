package com.jpa.model.inheritance;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("StudentORMExample");
		EntityManager em=emf.createEntityManager();
		Bike b=new Bike();
		b.setChasisNumber("BikehasisNumber");
		b.setManufacturer("bikemanufacturer");
		b.setManufacturingDate(new Date());
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();

	}

}
