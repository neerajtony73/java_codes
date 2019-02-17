public class Student extends Person{
	String stu_id;
	double gpa;
	
	// constructors
	public Student(String n,boolean al,int a,String ssn,String stu, double GPA) {
		super(n,al,a,ssn);
		this.stu_id=stu;
		this.gpa=GPA;
	}
		
	// toString method
	public String toString(){
		String output="";
		output+=super.toString();
		output+="\nId :"+stu_id + " \nGPA" + gpa;
		return output;
		}


}

