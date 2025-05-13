package com.polymorphism.subclass;

import com.polymorphism.baseclass.Vehicle;

public class Car extends Vehicle{

	public Car(String name, String vno) {
		super(name, vno);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("This is "+name+" with vechile number:"+vno);
		
	}

}
