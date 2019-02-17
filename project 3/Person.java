package same;
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
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	// toString method
	public String toString() {
		String output = "";
		output += " \nName:" + name + "  \nIs alive: " + alive + "\nAge:"+ age + "\nSSN:" + SSN ;
		return output;
		}
}
