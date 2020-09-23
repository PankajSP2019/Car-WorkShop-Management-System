import java.lang.*;
import classes.*;
import interfaces.*;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class T extends Exception{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		Scanner inputDouble= new Scanner(System.in);
		Scanner inputBoolean= new Scanner(System.in);
		while(true) {
			System.out.println("\n----------------WELCOME TO TOPU MOTOR------------------\n");
			System.out.println("1. Employee");
			System.out.println("2. Customer");
			System.out.println("3. Exit");
			
			System.out.print("You selct: ");
			
			Workshop w1 = new Workshop();
			//w1.setEmployeSize(100);
			//w1.setCustomerSize(100);
			//w1.setCarSize(100);
			
			//Workshop w1=new Workshop("Topu motor","Dhanmondi",true,true,10,10,10);
			int option = input.nextInt();
			switch(option) {
				case 1:  //Employe
					boolean s=true;
					//boolean stackPrint = true;
					boolean flag=false;
					do{
						try{
							
							input = new Scanner(System.in);
		                    input1 = new Scanner(System.in);
		                    input3 = new Scanner(System.in);
		                    input4 = new Scanner(System.in);
		                    inputString = new Scanner(System.in);
		                    inputInt = new Scanner(System.in);
		                    inputDouble= new Scanner(System.in);
		                    inputBoolean= new Scanner(System.in);
							
							
							while(s){
						   w1 = new Workshop();
					       w1.setEmployeSize(100);
					
							System.out.print("Want to add Employe? (Enter 0 for yes & 1 for no) :");
							int cmm1=input.nextInt();
							if(cmm1==0){
								System.out.print("How many Employe Infomation you Want to entered : ");
								int x2=input.nextInt();
							
							for(int i=1;i<=x2;i++){
								
							System.out.print("Enter employe name: ");
							String name1 = input1.nextLine();
							
							System.out.print("Enter employe id: ");
							String id1 = input1.nextLine();
							
							System.out.print("Enter employe address: ");
							String address = input1.nextLine();
							
							System.out.print("Enter employe salary: ");
							double salary = input3.nextDouble();
							
							System.out.print("Enter employe join date: ");
							int date = input.nextInt();
							
							System.out.print("Enter employe join month: ");
							int month = input.nextInt();
							
							System.out.print("Enter emlpoye join year: ");
							int year = input.nextInt();
							
							String save=name1+" "+address+" "+id1+"  ("+date+"/"+month+"/"+year+")  "+salary;
							w1.writeInFile(save,"file/Employe_Info.txt");
							
							Info i1 = new Info(date, month, year, id1);
							
							Employe e1 = new Employe(name1, address, i1, salary);
							w1.addEmploye(e1);	
							}			
						    	}
							
							System.out.println("2. Search Employe by Id");					   
							System.out.println("3. Remove Employee");
							System.out.println("4. Show all Employee");
							System.out.println("5. Show All Employe Information From Saved File ");
							System.out.println("6. Back To Main Menu ");
							
							System.out.print("You select: ");
							int option2 = input.nextInt();
							
							if(option2==2){
								System.out.print("Enter Id : ");
								String ssE1=input4.nextLine();
								
								w1.searchEmployeById(ssE1);
							}
							
							else if(option2==3){
								System.out.print("Enter Employe Id Want to Remove : ");
							     String s6= input4.nextLine();
								 w1.removeEmploye(s6);
							}
							else if(option2==4){
								w1.showEDetails();
							}
							else if(option2==5){
								w1.FileReader("file/Employe_Info.txt");
							}
							else if(option2==6){
								s=false;
								break;
							}
							else{
								System.out.println("Entered Wrong..\nTry Again.... ");
							}
						//break;							
					}
					flag=true;
					//break;
							
							
						}
						catch(InputMismatchException e){
							System.out.println("InputMismatchException Handled");
							System.out.println("You should Try again");	
							//if(stackPrint)
							//e.printStackTrace();
						}
						//break;
						catch(ArithmeticException e){
							System.out.println("ArithmeticException Handled");
							System.out.println("You should Try again");
						}
				        //break;
						catch(Exception e){
							System.out.println(e.getMessage());
							System.out.println("You should Try again");
						}
						//break;
						
					}while(!flag);
					
					
				break;	
				
				case 2:  //customer
					
					boolean st=true;
					boolean flag1=false;
					
					do{
						try{
							input = new Scanner(System.in);
		                    input1 = new Scanner(System.in);
		                    input3 = new Scanner(System.in);
		                    input4 = new Scanner(System.in);
		                    inputString = new Scanner(System.in);
		                    inputInt = new Scanner(System.in);
		                    inputDouble= new Scanner(System.in);
		                    inputBoolean= new Scanner(System.in);
							
							while(st){
						
						w1=new Workshop();
						w1.setCustomerSize(100);
						w1.setCarSize(100);
						
						Autogear g1=new Autogear("auto gear");
						Manualgear g2=new Manualgear("manual gear");
						
						System.out.print("ADD Customer (Enter 0 for Yes/1 For NO) : ");
						int s7=inputInt.nextInt();
						if(s7==0){
							
						 System.out.print("How many Customer and car Information Want to Enter : ");
						int cmm2=input.nextInt();
						for(int i=1;i<=cmm2;i++){
							
							System.out.print("Customer Name : ");
							String nm2=inputString.nextLine();
							
							System.out.print("Phone Number : ");
							String phn1=inputString.nextLine();
							
							System.out.print("Age : ");
							int ag=inputInt.nextInt();
							
							System.out.print("Car Name : ");
							String cnm1=inputString.nextLine();
							
							System.out.print("Car Gear Type : ");
							String gt1=inputString.nextLine();
							
							System.out.print("Car Id : ");
							String cid=inputString.nextLine();
							
							System.out.print("Problem In(Specific part/'s): ");
							String cplm1=inputString.nextLine();
							
							System.out.print("Charge(Approximate) : ");
							double ch5=inputDouble.nextDouble();
							
							String save2=nm2+"  "+phn1+"  "+cnm1+"  "+gt1+" "+cid+"  "+cplm1+"  "+ch5;
							w1.writeInFile(save2,"file/Customer_And_Car_Info.txt");
							 
							String save3=cnm1+"  "+gt1+" "+cid+"  "+cplm1+"  "+ch5;
							w1.writeInFile(save3,"file/Car_Info.txt");
							 
							 //Autogear g1=new Autogear("auto gear");
							//Manualgear g2=new Manualgear("manual gear"); 
							if(gt1.equals("auto")){
								
								
								 g1.setCarName(cnm1);
								 g1.setCarId(cid);
								 g1.setProblem(cplm1);
								 g1.setCharge(ch5);
								 //g1.showDetails();
							 
							}else if(gt1.equals("manual")){
									 
									
									 g2.setCarName(cnm1);
									 g2.setCarId(cid);
									 g2.setProblem(cplm1);
									 g2.setCharge(ch5);
									 //g2.showDetails();
							}else{
								System.out.println("Invalid Gear Type.");
							}
							
							if(gt1.equals("auto")){
								Customer cu1=new Customer(nm2,phn1,ag,g1);
							    w1.addCustomer(cu1);
								//w1.showCuDetails();
							}else if(gt1.equals("manual")){
								Customer cu1=new Customer(nm2,phn1,ag,g2);
							    w1.addCustomer(cu1);
								//w1.showCuDetails();
								
							}
						}
						
						}
						
						
					System.out.println("\n1. Show All Customer ");
					System.out.println("2. Search Customer by Phone Number");
					System.out.println("3. Deliver The Car To Customer");				
					System.out.println("4. Show All Customer And Car Information From Saved File");				
					System.out.println("5. Show All Car Information From Saved File");				
					System.out.println("6. Back to Main Menu\n");
					
					System.out.print("You Select : ");
					int select1 = input.nextInt();
					switch(select1) {
						case 1:
						
						w1.showCuDetails();
						
							break;  
						
						case 2:
						System.out.print("Enter Customer Phone Number : ");
						String number1=inputString.nextLine();
						
						w1.searchCoustomerByPhnNumber(number1);
						
							break;
						case 3:
							System.out.print("Enter Customer Mobile Number : ");
							String rv=inputString.nextLine();
						
						
						System.out.print("Problem of Car Solve ?(Enter true for yes/false for No) : ");
						boolean b2=inputBoolean.nextBoolean();
						
						System.out.print("Payment Clear?(Enter true for yes/false for No) : ");
						boolean b3=inputBoolean.nextBoolean();
						
						if(b2==true && b3==true){
							w1.removeCusmoter(rv);
						}
						else if(b2==false){
							System.out.print("Problem Of The Car Not Slove Yet.. ");
						}
						else if(b3){
							System.out.print("Payment Is Not Clear Yet..");
						}
						break;
						
						case 4:
						    w1.FileReader("file/Customer_And_Car_Info.txt");
								break;
								
						case 5:
							w1.FileReader("file/Car_Info.txt");
							break;
						
						 case 6:
						 
						 //System.exit(0);
						   st=false;
							
							break; 
						
						default:
						System.out.println("\nInvalid Selection.....\n Select Again \n");
					 }
					 
					}
							
							flag1=true;
						}
						catch(InputMismatchException e){
							System.out.println("InputMismatchException Handled");
							System.out.println("You should Try again");	
							//if(stackPrint)
							//e.printStackTrace();
						}
						catch(ArithmeticException e){
							System.out.println("ArithmeticException Handled");
							System.out.println("You should Try again");
						}
						catch(Exception e){
							System.out.println(e.getMessage());
							System.out.println("You should Try again");
						}
					}while(!flag1);
					
					break;
				
				   case 3:  //exit
				   
					System.exit(0);
					break;
					
				default:   //default output
					System.out.print("\n--------option doesn't match,SORRY,Try again!--------\n");
			
		}
		
		
		
		// Car c1=new Car("BMW","123456-1","gear problem",50000);
	    // c1.showDetails();
		
		// Autogear a1=new Autogear("auto gear");
		// a1.setCarName("Audi");
		// a1.setCarId("11-558-4");
		// a1.setProblem("Wheel");
		// a1.setCharge(1200.00);
		//a1.showDetails();
		
		// Manualgear m1=new Manualgear("manual gear");
		// m1.setCarName("Ti");
		// m1.setCarId("11-558-10");
		// m1.setProblem("engin");
		// m1.setCharge(1000000);
		//m1.showDetails();
		
		// Customer cu1=new Customer("pankaj","01968977706",21,m1);
		// cu1.showDetails();
		
		//workshop
		
		//********employe*****
		
		// Workshop w1=new Workshop("Topu motor","Dhanmondi",true,true,10,10,10);
		
		// Info i1=new Info(30,10,2020,"20-3010-1");
		// Employe e1=new Employe("rk mishra","dhaka",i1,50.00);
		// Info i2=new Info(15,9,2019,"19-159-1");
		// Employe e2=new Employe("dhube ji","dhaka",i2,50.00);
		// e1.showDetails();
		
		// w1.addEmploye(e1);
		// w1.addEmploye(e2);
		// w1.showEDetails();
		// w1.removeEmploye(e1);
		// w1.showEDetails();
		// w1.searchEmployeByName("rk mishra");
		// w1.searchEmployeById("");
		
		
		
		// ******car*******
		
		// Workshop w1=new Workshop("Topu motor","Dhanmondi",true,true,10,10,10);
		// w1.addCar(a1);
		// w1.addCar(m1);
		// w1.showCDetails();
		// w1.removeCar(a1,true);
		// w1.showCDetails();
		// w1.searchCarByCarId("11-558-10");


		//*****customer*********
        
		// Customer cu1=new Customer("pankaj","01968977706",21,m1);
		// Customer cu2=new Customer("das","017********",20,a1);
		
		// Workshop w1=new Workshop("Topu motor","Dhanmondi",true,true,10,10,10);
		// w1.addCustomer(cu1);
		// w1.addCustomer(cu2);
		// w1.showCuDetails();
		// w1.searchCoustomerByName("oop1");
		// w1.removeCusmoter(cu2);
		// w1.showCuDetails();
		// w1.searchCoustomerByPhnNumber("019");
		
		
	}// main while loop
	

}

}