//Ta class
import java.util.Date;
public class Ta extends Employee{
	public int salary;
	public int num_vac;
	
	//constructors
	public Ta(String n,String ssn,Date d,int s,int vac){
		super(n,ssn,d);
		this.salary=s;
		this.num_vac=vac;
	}
	
	public int getPay(){
			return salary*0;
	}
	
	public int getDaysOff(){
		 return num_vac*0;
	}
}
