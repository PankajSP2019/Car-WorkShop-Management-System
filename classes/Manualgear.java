package classes;

import java.lang.*;
public class Manualgear extends Car{
	private String gearType;
	
	public Manualgear(){}
	public Manualgear(String gearType){
		//perameterized constructor
		if(gearType.equals("manual gear")){
			this.gearType=gearType;
		}
		else{System.out.println("Error Gear Type");}
	}
	//setter mathod
	public void setGeraType(String gearType){
		if(gearType.equals("manual gear")){
			this.gearType=gearType;
		}
		else{System.out.println("Error Gear Type");}
	}
	//getter mathod
	public String getGearType(){
		return gearType;
	}
	public void showDetails(){
		
		//System.out.println("\n\n\n");
		//super.showDetails();
		
		System.out.println("Car Name : "+carName);
		System.out.println("Car Id : "+carId);
		System.out.println("Identify the Problem Of Car in : "+problem);
		System.out.println("Charge for this "+problem+" Problem is(BDT) : "+charge);
		System.out.println("Cars Gear Type : "+gearType);
		
	}
}
