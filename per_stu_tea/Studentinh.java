public class Studentinh extends Person{
String id;
double gpa;
String grade;

Studentinh(){
	super();
}

Studentinh(String id){
	if (! isValidstate(id)){
			System.out.print("fatal error");
			System.exit(0);
	}
	this.setaccessid(id);
	this.setaccessgpa(gpa);
	this.setaccessgrade(grade);
}

Studentinh(String id,double gpa,String grade){
	if (! isValidstate(id)){
			System.out.print("fatal error");
			System.exit(0);
	}
	this.setaccessid(id);
	this.setaccessgpa(gpa);
	this.setaccessgrade(grade);
}
public boolean isValidstate(String i){
		return i!=null && !i.equals(" "); 

	}
	
	
	public void setaccessid(String z){
	this.id=z;
}
public String getaccessid(){
	return this.id;
}	

public void setaccessgpa(double x){
	this.gpa=x;
}
public double getaccessgpa(){
	return this.gpa;
}	

public void setaccessgrade(String c){
	this.grade=c;
}
public String getaccessgrade(){
	return this.grade;
	
}	
public String toString(){
			String output= " ";
			output+=  "id : " + id + "\n gpa:" + gpa + " \n grade : " + grade + "\n"   ;

return output;
}
Person p=new Person("neeraj",23,"6dsfs661",true);
}
