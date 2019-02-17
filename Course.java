public class Course{
	public String coursename;
	public String coursenumber;
	public String instructorname;
	public Student[] liststudents;
	
	public Course(){
	}
	
	public Course(String c,String n,String i, Student[] st){

if((c==" " || c== null ) ||(n==" " || n == null) || (i== " " || i== null)){
	System.out.print("fatal error");
	System.exit(0);
}
this.setaccessname(c);
this.setaccessnumber(n);
this.setaccessinstructor(i);

		this.liststudents=new Student[st.length];
		for(int j=0;j<st.length;j++){
			this.liststudents[j]= st[j];
		}
		
		}
		
		public void setaccessname(String q){
		this.coursename=q;
	}
	public String getaccessname(){
		return coursename;
	}
	
	public void setaccessnumber(String w){
			this.coursenumber=w;
		}
		public String getaccessnumber(){
			return coursenumber;
		}
		
		public void setaccessinstructor(String e){
		this.instructorname=e;
	}
	public String getaccessinstructor(){
		return instructorname;
	}
		
		public String toString(){
			String output= " ";
			output+=  "course name : " + coursename + "\n course number:" + coursenumber + " \n instructor name : " + instructorname + "\n Student details:\n"   ;
	for (int j=0;j<this.liststudents.length;j++){
		output+= this.liststudents[j].toString();
	}
	return output;
	
		}
		
		public static void main(String[] args){
			Student[] stu= new Student[3];
			stu[0]=new Student("neeraj","gdsf5",3.5);
             stu[1]=new Student("tony","ghfgf5",3);
             stu[2]=new Student("sasi","qwee",2.5);
            
            Course cour1=new Course("english","dgtd5","li",stu);
            System.out.println(cour1.toString());
            
	}
}

