package classes;

import java.lang.*;
import interfaces.*;
public class Info{
	private int join_date;
	private int join_month;
	private int join_year;
	private String employe_id;
	
	public Info(){
	}
	public Info(int join_date,int join_month,int join_year,String employe_id){
		if(join_date>=1 && join_date<=31){this.join_date=join_date;}else{System.out.println("Error");}
		if(join_month>=1 && join_month<=12){this.join_month=join_month;}else{System.out.println("Error");}
		if(join_year>=2000){this.join_year=join_year;}else{System.out.println("Error");}
		
		this.employe_id=employe_id;
	}
	public void setJoin_date(int join_date){
		if(join_date>=1 && join_date<=31){this.join_date=join_date;}else{System.out.println("Error");}
	}
	public void setJoin_month(int join_month){
		if(join_month>=1 && join_month<=12){this.join_month=join_month;}else{System.out.println("Error");}
	}
	public void setJoin_year(int join_year){
		if(join_year>=2000){this.join_year=join_year;}else{System.out.println("Error");}
	}
	public void setEmploye_id(String employe_id){
		this.employe_id=employe_id;
	}
	public String getJoindate_info(){
		return join_date+"/"+join_month+"/"+join_year;
	}
	public String getId(){
		return employe_id;
	}
	public void showDetails(){
		System.out.println("Employe Id : "+employe_id);
		System.out.println("Join Date (DD/MM/YYYY): " +getJoindate_info());
	}
	
}