public class Person{
	public String name;
	public int age;
	public String ssn;
    public boolean alive;
	
	//constructors
	
	public Person(){
	}

	public Person(String n,int a,String s,boolean al)
	{
		if (! isValidstate(n,a,al)){
				System.out.print("fatal error");
				System.exit(0);
			}
		
		
		this.setaccessname(n);
		this.setaccessage(a);
		this.setaccessssn(s);
		this.setaccessalive(al);

	}

	Person(String n,int a,boolean al)
	{
		if (! isValidstate(n,a,al)){
				System.out.print("fatal error");
				System.exit(0);
		}
	
		this.setaccessname(n);
		this.setaccessage(a);
		
	}
	//invariance checking
	
	public boolean isValidstate(String name,int age,boolean alive){
			return name!=null && !name.equals(" ")&& 
	        (age!=0)&& (alive!=false);
		
		}
	
	//accessors and mutators	
		
    public void setaccessname(String t){
		this.name=t;
	           }
	public String getaccessname(){
		return this.name;
	}	
	public void setaccessage(int y){
		this.age=y;
	}
	public int getaccessage(){
		return this.age;
	}	
	public void setaccessssn(String y){
		this.ssn=y;
	}
	public String getaccessssn(){
		return this.ssn;
	}
	public boolean getaccessalive(){
		return this.alive;
	}
	public void setaccessalive(boolean al){
		this.alive=al;
	}
	
	//tostring method
	
	public String tostring(){
				String output="";
				output+=  "name : " + name + "\n age:" + age + " \n ssn : " + ssn + "\n is alive "   ;

	return output;
	}
}
