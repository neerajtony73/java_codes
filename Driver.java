public class Driver{
	public static void main(String[] args){
	Teacher[] t= new Teacher[3];
	Studentinh[] s=new Studentinh[5];
	 	
	 t[0]=new Teacher("rini",35,"ryfgy6562f",true,"tea12",55000,5);
	 t[1]=new Teacher("rini",35,"ryfgy6562f",true,"tea12",55000,5);
	 t[2]=new Teacher("rini",35,"ryfgy6562f",true,"tea12",55000,5);
	 s[0]=new Studentinh("sasi",22,"sdfsdfsf656fd",true,"stu5",3.5,"A");
	 s[1]=new Studentinh("sasi",22,"sdfsdfsf656fd",true,"stu5",3.5,"A");
	 s[2]=new Studentinh("sasi",22,"sdfsdfsf656fd",true,"stu5",3.5,"A");

	Dept d1=new Dept("ec",3,t,s);
	//System.out.println("details of teacher \n\n" + t.p.toString1());
	System.out.println(d1.toString());
	//System.out.println("details of student \n\n"+ s.p.toString1());  
	//System.out.println(s.toString());
	
}
}
