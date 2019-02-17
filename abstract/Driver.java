// Driver class
public class Driver{
	public static void main(String[] args){
		Professor p=new Professor("neeraj","gdsjfgj",new java.util.Date(System.currentTimeMillis()),12000,3);
		Professor p1=new Professor("tony","ueuruweir",new java.util.Date(System.currentTimeMillis()),22000,2);
		p.samePay(p1);
		p.sameDaysOff(p1);
		Ta T=new Ta("brilendra","dhufe",new java.util.Date(System.currentTimeMillis()),2000,1);
		Ta T1=new Ta("anant","mcv,mn",new java.util.Date(System.currentTimeMillis()),1500,2);
		//p.samePay(p1);
		//p.sameDaysOff(p1);
		p.samePay(T1);
		p.sameDaysOff(T);
	}
}
