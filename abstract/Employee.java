//Employee class
import java.util.Date;
public abstract class Employee{
	public String ssn;
	public String name;
	public Date hireDate;
	
	
	//constructors
	public Employee(String n,String s,Date d){
		this.name=n;
		this.ssn=s;
		this.hireDate=d;
	}
	
	public abstract int getPay( );
	public abstract int getDaysOff( );
	
	public void samePay(Employee e){
		if( this.getPay( )==e.getPay( )){
			System.out.println("\nBoth employees have same pay\n");
		}
		else{
			System.out.println("\nBoth employees do not have same pay\n");
		}
		
	}
	public void sameDaysOff(Employee e){
		if(this.getDaysOff( )==e.getDaysOff( )){
			System.out.println("\nBoth employees have same daysoff\n");
		}
		else{
			System.out.println("\nBoth employees do not have same days off\n");
		}
		
	}
	
}

