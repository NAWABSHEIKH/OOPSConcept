package com.inheritance.main;

import com.inheritance.baseclass.Vehicle;
import com.inheritance.subclasses.Bike;
import com.inheritance.subclasses.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle c=new Car("Car","MH 1234");
		c.displayDetails();
		
		Vehicle b=new Bike("Bike","WB 1234");
		b.displayDetails();

	}

}
