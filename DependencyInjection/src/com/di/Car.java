package com.di;

public class Car {
	
	Engine e;//capable of holding both petrol and disel
	
	public Car(Engine e) {
		this.e=e;
	}//constructor injection
	
	
	void  setEngine(Engine e) {
		this.e=e;
		
	}//setter injection
	
	void drive() {
		if(e!=null) {
			e.start();
		}else {
			System.out.println("no engine is present for the car");
		}
	}

}
