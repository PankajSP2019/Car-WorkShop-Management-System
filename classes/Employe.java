package classes;

import java.lang.*;
import interfaces.*;
public class Employe{
	private String name;
	private String address;
	Info info;
	private double salary;
	//Car cars[];
	public Employe(){
		
	}
	public Employe(String name,String address,Info info,double salary){
		this.name=name;
		this.address=address;
		this.info=info;
		this.salary=salary;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setInfo(Info info){
		this.info=info;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public double getSalary(){
		return salary;
	}
	public Info getInfo(){
		return info;
	}
	
	public void showDetails(/* String pass */){
		//for password
		
		//if(pass.equals("pankaj")){
		System.out.println("Employe name : "+name);
		System.out.println("Employe Address : "+address);
		System.out.println("Salary : "+salary);
		info.showDetails();
		//}else{
		//	System.out.println("Wrong password");
		//}
		
	}
	
	
}