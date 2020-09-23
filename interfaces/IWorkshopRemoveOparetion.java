package interfaces;
import java.lang.*;
import classes.*;

public interface IWorkshopRemoveOparetion{
	
	void removeEmploye(String id);
	void removeCar(Car c,boolean paymentCheck);
	void removeCusmoter(String mobile);
	
}