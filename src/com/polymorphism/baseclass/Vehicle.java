package com.polymorphism.baseclass;

public abstract class Vehicle {
	public String name, vno;
	
	public Vehicle(String name,String vno){
		this.name=name;
		this.vno=vno;
	}

	public abstract void startEngine();
}
