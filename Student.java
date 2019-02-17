public class Student{
	public String name;
	public String id;
	private double gpa;
	
	public Student(String n,String i){
		
		
		if((n== null || n== " ") || (i== null || i== " "))
		{
			System.out.println("fatal error");
			System.exit(0);
		}
				this.setaccess(n);	
			this.setaccessid(i);
		}
	
	
	public Student(String a,String b,double c){
		
		if((a== null || a== " ") || (b== null || b== " "))
		{
			System.out.println("fatal error");
			System.exit(0);
		}
	
			this.setaccess(a);
			this.setaccessid(b);
			this.setaccessgpa(c);
		
}
	
public void setaccess(String str){
	this.name=str;
}
public String getaccess(){
	return this.name;
}


public  void setaccessid(String str){
	this.id=str;
}
public String getaccessid(){
	return this.id;
}

public  void setaccessgpa(double  str){
	this.gpa=str;
}
public double getaccessgpa(){
	return this.gpa;
}


public String toString(){
	return "name : " + this.name + "\t" +  
	"id   : "  +  this.id    + "\t" + 
	"gpa   : "  + this.gpa  +  "\n";

}
/*public static void main(String[] args){
	Student stu1=new Student("neeraj","1324d");
   Student stu2=new Student("tony", "55f",3.8);

System.out.println(stu1.toString());
System.out.println(stu2.toString());
}
*/

}
