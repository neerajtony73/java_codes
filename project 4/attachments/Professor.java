package Same;
public class Professor extends Teacher{
	String speciality;
	String research_area;
	String rank;
	boolean tenured;
	
	// constructors
	public Professor (String na,boolean al,int ag,String ssn,String i,int m,int n,String sp,String re,String ra,boolean te){
		super(na,al,ag,ssn,i,m,n);
		this.speciality=sp;
		this.research_area=re;
		this.rank=ra;
		this.tenured=te;
	}
	public Professor(Professor p){
		super(p.getname(),p.isalive(),p.getage(),p.getssn(),p.getid(),p.getsalary(),p.getnumyears());
		this.speciality=p.speciality;
		this.research_area=p.research_area;
		this.rank=p.rank;
		this.tenured=p.tenured;

	}
	
	//accessors
	public String getname(){
		return this.name;
	}
	public boolean isalive(){
		return this.alive;
	}
	public int getage(){
		return this.age;
	}
	public String getssn(){
		return this.SSN;
	}
	public int getsalary(){
		return this.month_salary;
	}
	public String getid(){
		return this.id;
	}
	public int getnumyears(){
		return this.N_yr_prof;
	}

		
	//toString method
	public String toString(){
		String output="";
		output+=super.toString();
		output+="\nSpeciality :"+speciality+"\nResearch_Area :"+research_area+"\nRank:"+rank+"\nTenured : "+tenured;
		return output;
	}
}

