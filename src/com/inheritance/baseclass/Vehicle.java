package com.inheritance.baseclass;

public abstract class Vehicle {
	public String vehicle,vno;
	public Vehicle(String vehicle,String vno) {
		this.vehicle=vehicle;
		this.vno=vno;	
	}
	public abstract void displayDetails();
}
