package com.inheritance.subclasses;

import com.inheritance.baseclass.Vehicle;

public class Car extends Vehicle {


	public Car(String vehicle, String vno) {
		super(vehicle, vno);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("This is "+super.vehicle+" with plate number:"+super.vno);
		System.out.println("================================================");
	}
}