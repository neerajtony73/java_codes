public class Teacher extends Person{
	String id;
	int salary;
	int years;
	
	//constructors
	
	public Teacher(String n,int a,String s,boolean al,String id,int salary,int years){
		super(n,a,s,al);
		this.id=id;
		//this.setaccessid(id);
		this.setaccesssal(salary);
		this.setaccessyears(years);
	}
	public Teacher(Teacher ano){
		super(ano.getaccessname(),ano.getaccessage(),ano.getaccessssn(),ano.getaccessalive());
		this.id=ano.id;
		this.salary=ano.salary;
		this.years=ano.years;
		
	}
	public Teacher(String i,int s,int y){
		if (!isValidstate(i,s,y)){
			System.out.print("fatal error");
			System.exit(0);
		}
		this.setaccessid(i);
		this.setaccesssal(s);
		this.setaccessyears(y);
	}
	
	//invariance checking
 
	public boolean isValidstate(String id,int salary,int years){
			return id!=null && !id.equals(" ")&& 
			 (salary!=0)&& (years!=0);
		
		}
		
	//accessors and mutators
		
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
	public String tostring(){
		String output= " ";
		output+=super.tostring()+"\n";
		output+=  " id : " + id + "\n salary : " + salary + " \n years : " + years + "\n"   ;

	return output;
	}
}
