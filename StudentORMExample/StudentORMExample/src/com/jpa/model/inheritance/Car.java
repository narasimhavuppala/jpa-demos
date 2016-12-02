package com.jpa.model.inheritance;

import com.jpa.model.inheritance.Vehicle;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Car
 *
 */
@Entity

public class Car extends Vehicle implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CarId;
	
	private String manufacturer;
	
	private String modelName;
	
	private double mileagge;

	
	private static final long serialVersionUID = 1L;

	public Car() {
		super();
	}
   
}
