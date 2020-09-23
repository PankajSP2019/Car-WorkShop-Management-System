package classes;

import java.lang.*;
import java.io.*;
import interfaces.*;
public class Workshop implements IWorkshopAddOparetion,IWorkshopRemoveOparetion,IWorkshopSearchOparetion{
	protected String Wname;
	protected String Waddress;
	protected boolean checkCar;
	protected boolean paymentCheck;
	static int E_count=0;//for employe
	static int Cu_count=0;//for customers
	static int C_count=0;//for car
	
	protected FileWriter writer;
	protected FileReader reader;
	protected BufferedReader bfr;
	
	Employe employes[];
	Car cars[];
	Customer customers[];
	
	public Workshop(){
		//empty constructor
	} 
	public Workshop(String Wname,String Waddress,boolean checkCar,boolean paymentCheck,int sizeOfEmploye,int sizeOfCar,int sizeOfCostomer){
		//perameterized constructor
		this.Wname=Wname;
		this.Waddress=Waddress;
		this.checkCar=checkCar;
		this.paymentCheck=paymentCheck;
		employes=new Employe[sizeOfEmploye];
		cars=new Car[sizeOfCar];
		customers=new Customer[sizeOfCostomer];
	}
	//setter mathod
	public void setWname(String Wname){
		this.Wname=Wname;
	}
	public void setWaddress(String Waddress){
		this.Waddress=Waddress;
	}
	public void setCheckCar(boolean checkCar){
		this.checkCar=checkCar;
	}
	public void SetPaymentCheck(boolean paymentCheck){
		this.paymentCheck=paymentCheck;
	}
	public void setEmployeSize(int sizeOfEmploye){
		employes=new Employe[sizeOfEmploye];
	}
	public void setCustomerSize(int sizeOfCostomer){
		customers=new Customer[sizeOfCostomer];
	}
	public void setCarSize(int sizeOfCar){
		cars=new Car[sizeOfCar];
	}
	//getter mathod
	public String getWname(){
		return Wname;
	}
	public String setWaddress(){
		return Waddress;
	}
	public boolean getCheckCar(){
		return checkCar;
	}
	public boolean getPaymentCheck(){
		return paymentCheck;
	}
	//(1)...............Employe.................
	
	//Add employe
	public void addEmploye(Employe e){
		
		int flag=0;
		for(int i=0;i<employes.length;i++){
			
			if(employes[i]==null){
				employes[i]=e;
				System.out.println("\n"+employes[i].getName()+"'s Profile Added");
				flag=1;
				break;
			}
		}
		if(flag == 1){
			E_count++;
			System.out.println("----Employe Added----");
			}
		else {System.out.println("----Employe CanNot Added----");}
		System.out.println("Employe in garage : "+E_count+"\n");
	}
	//show employe details
	public void showEDetails(){
		for(int i=0;i<employes.length;i++){
			if(employes[i]!=null){
				System.out.println("------"+(i+1)+"--------");
				employes[i].showDetails();
				System.out.println();
			}
		}
	}
	//delete / remove employe from Workshop by id
	public void removeEmploye(String id){
		int flag=0;
		for(int i=0;i<employes.length;i++){
			if(employes[i].getInfo().getId().equals(id)){
				System.out.println("\n"+employes[i].getName()+"'s Profile Removed");
				employes[i]=null;
				flag=1;
				break;
			}
		}
		if(flag==1){
			E_count--;
			System.out.println("----Employe Removed----");
		}else{
			System.out.println("----Employe CanNot Added----");
		}
		System.out.println("Employe in garage : "+E_count+"\n");		
	}
	//search employe by Employe Name
	public void searchEmployeByName(String name){
		int flag=0;
		System.out.println("-----------------Search Result('s)-----------------");
		for(int i=0;i<employes.length;i++){
			if(employes[i]!=null && employes[i].getName().equals(name)){
				System.out.println("\n\n-----------------"+(i+1)+"----------------\n\n");
				employes[i].showDetails();
				flag++;
				
			}
		}
		if(flag!=0){
			System.out.println("\n---------found--------");
		}else{
			System.out.println("\n---------Not found--------");
		}
		System.out.println("We Found "+flag +" similar Employe name for : "+name);
	}
	//search Employe by Employe Id
	public void searchEmployeById(String id){
		int flag=0;
		System.out.println("-----------------Search Result('s)-----------------");
		for(int i=0;i<employes.length;i++){
			if(employes[i]!=null && employes[i].getInfo().getId().equals(id)){
				System.out.println("\n\n-----------------"+(i+1)+"----------------\n\n");
				employes[i].showDetails();
				flag++;
				
			}
		}
		if(flag!=0){
			System.out.println("\n---------found--------");
		}else{
			System.out.println("\n---------Not found--------");
		}
		System.out.println("We Found "+flag +" similar Employe Id for : "+id);
	}
	
	
	
	
	//(2)........Car...............
	
	//add car to the Workshop
	public void addCar(Car c){
		int flag=0;
		for(int i=0;i<cars.length;i++){
			if(cars[i]==null){
				cars[i]=c;
				System.out.println("Car ID :"+cars[i].getCarId()+" (Added)");
				flag=1;
				break;
			}
		}
		if(flag == 1){
			C_count++;
			System.out.println("----Car Added----");
			}
		else {System.out.println("----Car CanNot Added----");}
		System.out.println("Cars in garage : "+C_count);
	}
	//show all car details
	public void showCDetails(){
		for(int i=0;i<cars.length;i++){
			if(cars[i]!=null){
				System.out.println("------"+(i+1)+"--------");
				cars[i].showDetails();
				System.out.println();
				
			}
		}
	}
	//Search car by car id
	public void searchCarByCarId(String id){
		int flag=0;
		System.out.println("-----------------Search Result('s)-----------------");
		for(int i=0;i<cars.length;i++){
			if(cars[i]!=null && cars[i].getCarId().equals(id)){
				System.out.println("\n\n-----------------"+(i+1)+"----------------\n\n");
				cars[i].showDetails();
				flag++;
				
			}
		}
		if(flag!=0){
			System.out.println("\n---------found--------");
		}else{
			System.out.println("\n---------Not found--------");
		}
		System.out.println("We Found "+flag +" similar Car Id for : "+id);
		
	}
	
	//delete/Removed Car from Workshop
	public void removeCar(Car c,boolean paymentCheck){
		if(paymentCheck==true){
			int flag=0;
		for(int i=0;i<cars.length;i++){
			if(cars[i]==c){
				System.out.println("\n.....................Delivery operation........................\n");
				System.out.println("Payment Check Status : "+paymentCheck);
				System.out.println("Car ID :"+cars[i].getCarId()+" (Removed)");
				cars[i]=null;
				flag=1;
				break;
			}
		}
		if(flag==1){
			C_count--;
			System.out.println("----Car Removed----");
		}else{
			System.out.println("----Car CanNot Added----");
		}
		System.out.println("Car in garage : "+C_count);	
		}else{
			System.out.println("Paymaent Is not Clear Yet\nWE Cant Delivery the car");
		}
		
	}
	
	
	//(3)..............customer...............
	
	//add customer to workshop
	public void addCustomer(Customer cu){
		int flag=0;
		for(int i=0;i<customers.length;i++){
			
			if(customers[i]==null){
				customers[i]=cu;
				System.out.println("\n"+customers[i].getName()+"'s car Added to Work shop..");
				flag=1;
				System.out.println("\n..............................................");
				break;
			}
		}
		if(flag == 1){
			Cu_count++;
			System.out.println("----Customer  Added----");
			}
		else {System.out.println("----Customer CanNot Added----");}
		System.out.println("Customer count : "+Cu_count+"\n");
	}
	
	//customer details
	public void showCuDetails(){
		for(int i=0;i<customers.length;i++){
			
			if(customers[i]!=null){
				System.out.println("------"+(i+1)+"--------");
				customers[i].showDetails();
				System.out.println("\n..............................................\n");
				System.out.println();
			}
		}
	}
	//delete/Removed Customer from Workshop by phn number
	public void removeCusmoter(String mobile){
		int flag=0;
		for(int i=0;i<customers.length;i++){
			if(customers[i]!=null && customers[i].getPhnNumber().equals(mobile)){
				System.out.println("\n"+customers[i].getName()+"'s car Removed from Work shop..");
				customers[i]=null;
				flag=1;
				break;
			}
		}
		if(flag==1){
			Cu_count--;
			System.out.println("----Customer's information Removed----");
		}else{
			System.out.println("----Customer's information CanNot Removed----");
		}
		System.out.println("Customer count : "+Cu_count+"\n");	
	}
	//Search customer by his/her name
	public void searchCoustomerByName(String name){
		int flag=0;
		System.out.println("-----------------Search Result('s)-----------------");
		for(int i=0;i<customers.length;i++){
			if(customers[i]!=null && customers[i].getName().equals(name)){
				System.out.println("\n\n-----------------"+(i+1)+"----------------\n\n");
				customers[i].showDetails();
				flag++;
			}
		}
		if(flag!=0){
			System.out.println("\n---------found--------");
		}else{
			System.out.println("\n---------Not found--------");
		}
		System.out.println("We Found "+flag +" similar name for : "+name);
	}
	//Search customer by his/her number
	public void searchCoustomerByPhnNumber(String number){
		int flag=0;
		System.out.println("-----------------Search Result('s)-----------------");
		for(int i=0;i<customers.length;i++){
			if(customers[i]!=null && customers[i].getPhnNumber().equals(number)){
				System.out.println("\n\n-----------------"+(i+1)+"----------------\n\n");
				customers[i].showDetails();
				flag++;
				break;
			}
		}
		if(flag!=0){
			System.out.println("\n---------found--------");
		}else{
			System.out.println("\n---------Not found--------");
		}
		System.out.println("We Found "+flag +" similar Number for : "+number);
	}
	
	//for file Write and create
	public void writeInFile(String s,String fName){
		
		try{
			File file =new File(fName);
			file.createNewFile();
			writer=new FileWriter(file,true);
			writer.write(s+"\r"+"\n");
			writer.flush();
			writer.close();
			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	
	//for Read from file
	public void FileReader(String fName){
		try{
			File file=new File(fName);
		reader =new FileReader(file);
		bfr=new BufferedReader(reader);
		String fullText="",singleLine;
		
		while((singleLine=bfr.readLine())!=null){
			
			fullText=fullText+singleLine+"\r\n";
			
		}
		System.out.println(fullText);
		reader.close();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}
	
	
}