public class Course{
	Professor instructor;
	College_Student[] students;
	String course_name;
	
	// constructors
	public Course(Professor p,College_Student[] stu,String cou){
		this.instructor=p;
		this.course_name=cou;
		students=new College_Student[stu.length];
		for(int i=0;i<stu.length;i++){
			 this.students[i]=stu[i];
		}
	}
	
	public Course(Course cc){
		this.instructor=cc.instructor;
		//	College_Student students=new College_Student[c.length];
		for(int i=0;i<2;i++){
			this.students=cc.students;
		}
			this.course_name=cc.course_name;
		}
		
		//toString method
		public String toString(){
			String output="";
			output+="\nCourse Name:"+course_name;
			output+="\n\nInstructor :\n----------"+this.instructor+"\n\nStudents :\n--------\n";
			for(int i=0;i<students.length;i++){
				output+=students[i];
				output+="\n";
			}
			return output;
		}
}
		
		 

	
