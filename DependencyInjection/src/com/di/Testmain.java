package com.di;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PetrolEngine pe=new PetrolEngine();//depentdent object
//		Diselengine de=new Diselengine();	
		Car c=new Car(pe);//Target object and constructor injection
		
      //  c.e=pe;//field injection
		
		//c.setEngine();//setter injection
		
       c.drive();
		
		
//		c.e=de;
//		c.drive();
		
		

	}

}
