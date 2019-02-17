public class Teacher extends Person{
	String id;
	int salary;
	int years;
	
Teacher(){
	super();
}
Teacher(String i,int s,int y){
	if (!isValidstate(i,s,y)){
		System.out.print("fatal error");
	    System.exit(0);
	}
		
	this.setaccessid(i);
	this.setaccesssal(s);
	this.setaccessyears(y);
}


public boolean isValidstate(String id,int salary,int years){
		return id!=null && !id.equals(" ")&& 
         (salary!=0)&& 
		 (years!=0);
	
	}
	
	
	public void setaccessid(String a){
	this.id=a;
}
public String getaccessid(){
	return this.id;
}	

public void setaccesssal(int s){
	this.salary=s;
}
public int getaccesssal(){
	return this.salary;
}	

public void setaccessyears(int d){
	this.years=d;
}
public int getaccessyears(){
	return this.years;
	
}	
public String toString(){
			String output= " ";
			output+=  "id : " + id + "\n salary:" + salary + " \n years : " + years + "\n"   ;

return output;
}
Person p=new Person("sasi",50,"sfggr55s",true);
}
