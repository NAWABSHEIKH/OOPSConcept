package com.polymorphism.serviceclass;

import java.util.ArrayList;

import com.polymorphism.baseclass.Vehicle;
import com.polymorphism.subclass.Bike;
import com.polymorphism.subclass.Car;

public class VehicleService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Car> car=new ArrayList<>();
		
		Car c1=new Car("Car","WB 1234");
		Car c2=new Car("Car","MP 5344");
		Car c3=new Car("Car","UP 1264");
		
		car.add(c1);
		car.add(c3);
		car.add(c2);
		
		for(Car car1:car) {
			car1.startEngine();
		}
		
	System.out.println("=====================================");	
	
     ArrayList<Bike> bike=new ArrayList<>();
		
		Bike b1=new Bike("Bike","WB 1234");
		Bike b2=new Bike("Bike","MP 5344");
		Bike b3=new Bike("Bike","UP 1264");
		
		bike.add(b1);
		bike.add(b3);
		bike.add(b2);
		
		for(Bike bike1:bike) {
			bike1.startEngine();
		}
		
		System.out.println("=====================================");	
		
		//Try using upcasting with polymorphism, which is more flexible and scalable:
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();

		vehicles.add(new Car("Car", "WB 1234"));
		vehicles.add(new Car("Car", "MP 5344"));
		vehicles.add(new Bike("Bike", "UP 1264"));
		vehicles.add(new Bike("Bike", "BR 8888"));

		for (Vehicle v : vehicles) {
		    v.startEngine(); // Runtime Polymorphism in action
		}


	}

}
