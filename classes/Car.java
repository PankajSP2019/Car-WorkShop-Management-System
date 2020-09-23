package classes;
import interfaces.*;

import java.lang.*;
public abstract class Car{
	//this is an abstract class
	protected String carName;
	protected String carId;
	protected String problem;
	protected double charge;
	
	public Car(){
		//empty constructor
	}
	public Car(String carName,String carId,String problem,double charge){
		//perameterized constructor
		this.carName=carName;
		this.carId=carId;
		this.problem=problem;
		this.charge=charge;
	}
	//setter mathod
	public void setCarName(String carName){
		this.carName=carName;
	}
	public void setCarId(String carId){
		this.carId=carId;
	}
	public void setProblem(String problem){
		this.problem=problem;
	}
	public void setCharge(double charge){
		this.charge=charge;
	}
	//getter mathod
	public String getCarName(){
		return carName;
	}
	public String getCarId(){
		return carId;
	}
	public String getProblem(){
		return problem;
	}
	public double getCharge(){
		return charge;
	}
	public abstract void showDetails();  /*{
		 System.out.println("Car Name : "+carName);
		System.out.println("Car Id : "+carId);
		System.out.println("Identify the Problem Of Car in : "+problem);
		System.out.println("Charge for this "+problem+" Problem is(BDT) : "+charge);
	} */
	
	
	
	
}