public class Dealer{
	public String Make;
	public double Annual_Revenue;
	public Car[] Stocklist;
	
		public void setAccessMake(String m){
		this.Make=m;
	}
	public String getaccessmake(){
		 return Make;
	 }
	  
	public void setAccessAnnual(String a){
		this.Annual_Revenue=a;
	}
	public String getaccessannual(){
		 return Annual_Revenue;
	 }
	 
	 public void SetAccessStock(String x,String y,int z){
	 
		 this.Stocklist.Vin=x;
		 this.Stocklist.Model=y;
		 this.Stocklist.num_doors=z;
	 }
	 
	 public String toString(){
	   return "make :" + Make + "Annual_Revenue :" + Annual_Revenue +" Stocklist:" + Stocklist.Vin+ "/n"
	   + Stocklist.Model +"/n" + Stocklist.num_doors;
   }
   
	 
	 
	 public static void main(String[] args){
		 Dealer deal1=new Dealer("xyz",100000,("honda", "camry",1));
		 Dealer deal2=new Dealer("xdyzsd",300000,("honadhgd", "camrdgfdy",2));
		 Dealer deal3=new Dealer("xycz",200000,("hondaasdsa", "cadffsdmry",3));
		 
		deal1.toString();
		deal2.toString();
		deal3.toString();
	 }
 }
