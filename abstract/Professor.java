//Professor class
import java.util.Date;
public class Professor extends Employee{
	public int salary;
	public int num_vac;
	
	//Constructors
	public Professor(String n,String ssn,Date d,int s,int vac){
		super(n,ssn,d);
		this.salary=s;
		this.num_vac=vac;
	}
	
	public int getPay(){
		return (salary*0)+1;
		}
	
	public int getDaysOff(){
		 return (num_vac*0)+1;
		}
	
}
