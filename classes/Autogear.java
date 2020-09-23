package classes;

import java.lang.*;
public class Autogear extends Car{
	private String gearType;
	
	public Autogear(){}
	public Autogear(String gearType){
		//perameterized constructor
		if(gearType.equals("auto gear")){
			this.gearType=gearType;
		}
		else{System.out.println("Error Gear Type");}
	}
	//setter mathod
	public void setGeraType(String gearType){
		if(gearType.equals("auto gear")){
			this.gearType=gearType;
		}
		else{System.out.println("Error Gear Type");}
	}
	//getter mathod
	public String getGearType(){
		return gearType;
	}
	public void showDetails(){
		//super.showDetails();
		
		System.out.println("Car Name : "+carName);
		System.out.println("Car Id : "+carId);
		System.out.println("Identify the Problem Of Car in : "+problem);
		System.out.println("Charge for this "+problem+" Problem is(BDT) : "+charge);
		System.out.println("Cars Gear Type : "+gearType);
		
	}
	
}