package interfaces;
import java.lang.*;
import classes.*;


public interface IWorkshopSearchOparetion{
	
	void searchEmployeByName(String name);
	void searchEmployeById(String id);
	void searchCarByCarId(String id);
	void searchCoustomerByName(String name);
	void searchCoustomerByPhnNumber(String number);
}