																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
public class Driver {

	//The Main Method.
	public static void main(String[] args) {
		College_Student[] c=new College_Student[2];
		c[0]=new College_Student("Neeraj" ,true,20,"223-445-233","129p",3.5,"computer science","A");
		c[1]=new College_Student("Tony",true,18,"200-489-569","896u",3.8,"computer science","A");
			
		College_Student[] c1=new College_Student[2];
		c1[0]=new College_Student("Brilendra",true,19,"888-465-784","789e9",3.7,"computer engineering","A");
		c1[1]=new College_Student("Menon",true,22,"247-123-965","65r6t",3.4,"computer engineering","B");
			
			
		Professor[] p = new Professor[2];
		p[0] = new Professor("Wenjia",true,44,"115-417-782", "897rt", 8900, 5,"Programming","Artificial Intelligence","First",true);
		p[1] = new Professor("Li",true,55 ,"278-423-789", "123bc", 12200, 6,"Networking","SDN","second",true);
		
		Professor[] q = new Professor[2];
		q[0] = new Professor("Jeff",true,40 ,"223-259-2388", "987ty", 12000, 8,"Computer Networks","Architecture","Third",true);
		q[1] = new Professor("Ting",true,52 ,"898-400-8978", "148ti", 15000, 10,"Networking","INCS","Fourth",true);
		
		Course[] co=new Course[2];
		co[0]=new Course(p[0],c,"Programing Language 1");
		co[1]=new Course(p[1],c,"Computer Networking");
		
		Course[] co1=new Course[2];
		co1[0]=new Course(q[0],c1,"Computer Architecture");
		co1[1]=new Course(q[1],c1,"Artificial Intelligence");
	
		Department d=new Department(p[0],p,co);
		Department d1=new Department(q[1],q,co1);

		System.out.println("Department:Computer Science\n---------------------------\n"+d.toString());
		System.out.println("Department:Computer Engineering\n------------------------------\n"+d1.toString());
	}
}

