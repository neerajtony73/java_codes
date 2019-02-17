public class Person{
	String name;
	int age;
	String ssn;
	boolean alive;
	
	
public Person(){
}
public Person(String n,int a,String s,boolean al)
{
	if (! isValidstate(n,a,al)){
			System.out.print("fatal error");
			System.exit(0);
	}
	
	
	this.setaccessname(n);
	this.setaccessage(a);
	this.setaccessssn(s);

}

Person(String n,int a,boolean al)
{
	if (! isValidstate(n,a,al)){
			System.out.print("fatal error");
			System.exit(0);
	}
	
	this.setaccessname(n);
	this.setaccessage(a);
	
}

public boolean isValidstate(String name,int age,boolean alive){
		return name!=null && !name.equals(" ")&& 
 (age!=0)&& 
		 (alive!=false);
	
	}
	
	public void print(){
		System.out.print("jfhdhg");
	}
	
	public void setaccessname(String t){
	this.name=t;
}
public String getaccessname(){
	return this.name;
}	
	public void setaccessage(int y){
	this.age=y;
}
public int getaccessage(){
	return this.age;
}	
	public void setaccessssn(String y){
	this.ssn=y;
}
public String getaccessssn(){
	return this.ssn;
}
public String toString1(){
			String output= " ";
			output+=  "name : " + name + "\n age:" + age + " \n ssn : " + ssn + "\n is alive \n"   ;

return output;
}
}
