public class Department{
	Professor chair;
	Professor[] faculty;
	Course[] courses;
	
	// constructors
	public Department(Professor p,Professor[] fac,Course[] cou){
		this.chair=new Professor(p);
		faculty=new Professor[fac.length];
		for(int i=0;i<fac.length;i++){
			this.faculty[i]=fac[i];
		}
		courses=new Course[cou.length];
		for(int i=0;i<courses.length;i++){
			this.courses[i]=cou[i];
		}
	}
	
	
	public Professor getChair() {
		return chair;
	}


	public void setChair(Professor chair) {
		this.chair = chair;
	}


	public Professor[] getFaculty() {
		return faculty;
	}


	public void setFaculty(Professor[] faculty) {
		this.faculty = faculty;
	}


	public Course[] getCourses() {
		return courses;
	}


	public void setCourses(Course[] courses) {
		this.courses = courses;
	}


	//toString method
	public String toString(){
		String output="";
		output+="\nHOD :\n---"+this.chair+"\n\nFaculties :\n---------";
		for(int i=0;i<faculty.length;i++){
			output+=faculty[i];
			output+="\n";
		}
		output+="\nCourses:\n-------";
		for(int i=0;i<courses.length;i++){
			output+=this.courses[i];
			output+="\n";
		}
		return output;
	}
}
			

