public class Driver{
	public static void main(String[] args){
	Teacher[] t1= new Teacher[3];
	Studentinh[] s1=new Studentinh[5];
	 	
	 t1[0]=new Teacher("rini",35,"ryfgy6562f",true,"tea1",55000,5);
	 t1[1]=new Teacher("lata",55,"rydfd6562f",true,"tea2",88000,3);
	 t1[2]=new Teacher("mary",50,"wuiuy6562f",true,"tea3",559000,9);
	 s1[0]=new Studentinh("sasi",22,"sdfsdfsf656fd",true,"stu1",3.5,"A");
	 s1[1]=new Studentinh("leon",24,"sdfsdfsiuiuoi",true,"stu2",3,"B");
	 s1[2]=new Studentinh("sam",21,"sdfsdfsxxxxxfd",true,"stu3",3.5,"A+");
	 s1[3]=new Studentinh("rita",22,"sdfsdfqweqe66",true,"stu5",3.7,"A");
	 s1[4]=new Studentinh("sima",22,"sdfsdfsuoyiyo",true,"stu5",3.5,"A");

	Dept d1=new Dept("ec",3,t1,s1);
	System.out.println(d1.tostring());
	
	}
}
