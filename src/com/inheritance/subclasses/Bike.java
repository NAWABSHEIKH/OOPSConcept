package com.inheritance.subclasses;

import com.inheritance.baseclass.Vehicle;

public class Bike extends Vehicle {
	
	
	public Bike(String vehicle, String vno) {
		super(vehicle, vno);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("This is "+vehicle+" with plate number:"+vno);
		System.out.println("================================================");
	}

}
