public class Person {
	public String name;
	public boolean alive;
	public int age;
	public String SSN;

	// constructors
	public Person(String n,boolean al,int a,String ssn){
		this.name=n;
		this.alive=al;
		this.age=a;
		this.SSN=ssn;
		}
		
	// toString method
	public String toString() {
		String output = "";
		output += " \nName:" + name + "  \nIs alive: " + alive + "\nAge:"+ age + "\nSSN:" + SSN ;
		return output;
		}
}
