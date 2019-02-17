public class Driver{
	
	public void getinfo(Person p){
		p.toString1();	
		p.getPaid();
		p.getVac();
		
	}
	//main method
	public static void main(String[] args){
		Proff p1=new Proff("neeraj",62,"qrwy12",true,"prof1","R&d",5000,3);
		Secretary p2=new Secretary("tony",32,"hjghjgh657",true,"sec1","office",1000,1);
		Student p3=new Student("sasi",22,"olmnn756",true,"stud1","R&d",50,1);
		Driver p=new Driver();
		
		p.getinfo(p1);
		p.getinfo(p2);
		p.getinfo(p3);	
	}
}

