/*
 * PROGRAMMING LANGUAGE 2
 * PROFESSOR-WENJIA LI
 * STUDENT NAME-NEERAJ TONY
 * ID-1234083
 * SEMESTER-SPRING
 * HOME WORK 1:COMPOSITION
*/


public class Star{
	public String name;
	public double diameter;
	public int age;
	public double surfacetemp;

// constructors

	public Star(){
		}
	
public Star(String n,double d,int a,double t){
	if (! isValidstate(n,d,a,t)){
		System.out.print("fatal error");
		System.exit(0);
	}
		
	this.setaccessname(n);
	this.setaccessdia(d);
	this.setaccessage(a);
	this.setaccesstemp(t);
}

public Star(Star another){
	this.name=another.name;
	this.diameter=another.diameter;
	this.age=another.age;
	this.surfacetemp=another.surfacetemp;
	}
	
	//invariance checking
	
public boolean isValidstate(String name,double diameter,int age,double surfacetemp){
		return name!=null && !name.equals(" ")&& 
       (diameter!=0)&& (age!=0)&& (surfacetemp!=0); 
	
	}
		
// accessors and mutators

	public void setaccessname(String q){
		this.name=q;
	}
	public String getaccessname(){
		return this.name;
	}
	
	public void setaccessdia(double w){
		this.diameter=w;
	}
	public double getaccessdia(){
		return this.diameter;
	}
	
	public void setaccessage(int e){
		this.age=e;
	}
	public int getaccessage(){
		return this.age;
	}
	public void setaccesstemp(double r){
		this.surfacetemp=r;
	}
    public double getaccesstemp(){
	    return this.surfacetemp;
    }	

//toString method
	public String toString(){
		String output=" ";
		output += "name: " + name + "\n diameter: " + diameter +" km"+" \n age: " +age+" years"+"\n surface temprature: "+ surfacetemp+" celcius";
		return output;
	}
}
