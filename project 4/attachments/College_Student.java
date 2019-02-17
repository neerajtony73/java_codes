package Same;
import Different.Student;
public class College_Student extends Student{
	String major;
	String grade;
	
	// constructors
	public College_Student(String n,boolean al,int a,String ssn,String stu, double GPA,String maj,String gra){
		super(n,al,a,ssn,stu,GPA);
		this.major=maj;
		this.grade=gra;
	}
	
	public College_Student(College_Student co){
		super(co.getname(),co.isalive(),co.getage(),co.getssn(),co.getstu_id(),co.getgpa());
		this.major=co.major;
		this.grade=co.grade;
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
		public String getstu_id(){
			return this.stu_id;
		}
		public double getgpa(){
			return this.gpa;
		}

	//toString method
	public String toString(){
		String output="";
		output+=super.toString();
		output+="\nMajor :"+major + " \nGrade" + grade;
		return output;
	}
}
