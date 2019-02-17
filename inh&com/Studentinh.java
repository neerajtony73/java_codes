public class Studentinh extends Person{
	String id;
	double gpa;
	String grade;
	
	//constructors

	public Studentinh(String n,int a,String s,boolean al,String id,double gpa,String grade){
		super(n,a,s,al);
		this.setaccessid(id);
		this.setaccessgpa(gpa);
		this.setaccessgrade(grade);
	}

	public Studentinh(Studentinh ano){
		super(ano.getaccessname(),ano.getaccessage(),ano.getaccessssn(),ano.getaccessalive());
		this.id=ano.id;
		this.gpa=ano.gpa;
		this.grade=ano.grade;
	}

	public Studentinh(String id){
		if (! isValidstate(id)){
				System.out.print("fatal error");
				System.exit(0);
		}
		this.setaccessid(id);
		this.setaccessgpa(gpa);
		this.setaccessgrade(grade);
	}

	public Studentinh(String id,double gpa,String grade){
		if (! isValidstate(id)){
				System.out.print("fatal error");
				System.exit(0);
		}
		this.setaccessid(id);
		this.setaccessgpa(gpa);
		this.setaccessgrade(grade);
	}
	
	//invariance checking
	
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
	
	//tostring method
	
	public String tostring(){
				String output= " ";
				output+=super.tostring()+"\n";
				output+=  " id : " + id + "\n gpa : " + gpa + " \n grade : " + grade + "\n"   ;

	return output;
	}
}
