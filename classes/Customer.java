package classes;

import java.lang.*;
import interfaces.*;

public class Customer implements Icustomer {
	private String name;
	private String phnNumber;
	private int age;
	Car car;
	
	public Customer(){
		//empty constructor
	}
	public Customer(String name,String phnNumber,int age,Car car){
		//perameterized constructor
		this.name=name;
		this.phnNumber=phnNumber;
		this.age=age;
		this.car=car;
	}
	//setter mathod
	public void setName(String name){
		this.name=name;
	}
	public void setPhnNumber(String phnNumber){
		this.phnNumber=phnNumber;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setCar(Car car){
		this.car=car;
	}
	//getter method
	public String getName(){
		return name;
	}
	public String getPhnNumber(){
		return phnNumber;
	}
	public int getAge(){
		return age;
	}
	public Car getCar(){
		return car;
	}
	
	//show details of customer
	public void showDetails(){
		System.out.println("Car Owners Name : "+name);
		System.out.println("Mobile No. : "+phnNumber);
		System.out.println("Age : "+age);
		//System.out.println(car);
		car.showDetails();
	}


	
}