public class Teacher extends Person{
	String id;
	int month_salary;
	int N_yr_prof;
	
	// constructors
	public Teacher(String na,boolean al,int ag,String ssn,String i,int m,int n) {
		super(na,al,ag,ssn);
		this.id=i;
		this.month_salary=m;
		this.N_yr_prof=n;
	}
	
	// toString method
	public String toString(){
		String output="";
		output+=super.toString();
		output+="\nId :"+id+"\nMonth salary :"+month_salary+"\nNumber of Years:"+N_yr_prof;
		return output;
	}
}
