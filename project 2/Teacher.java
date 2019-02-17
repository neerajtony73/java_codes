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
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getMonth_salary() {
		return month_salary;
	}


	public void setMonth_salary(int month_salary) {
		this.month_salary = month_salary;
	}


	public int getN_yr_prof() {
		return N_yr_prof;
	}


	public void setN_yr_prof(int n_yr_prof) {
		N_yr_prof = n_yr_prof;
	}


	// toString method
	public String toString(){
		String output="";
		output+=super.toString();
		output+="\nId :"+id+"\nMonth salary :"+month_salary+"\nNumber of Years:"+N_yr_prof;
		return output;
	}
}
