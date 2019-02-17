public class Dealer{
	public String make;
	public double annual_revenue;
	private Car[] stocklist;
	
	//constructors
	
	public Dealer(String m,double a,Car[] s){
		if(!isvalid(m,a,s)){
			//System.out.println("fatal error");
			System.out.println("fatal error");
			System.exit(0);
		}
		this.make=m;
		this.annual_revenue=a;
		stocklist=new Car[s.length];
		for(int i=0;i<s.length;i++){
			this.stocklist[i]=s[i];
		//	System.out.println(stocklist[i].tostring());
		}
	}
	
	//variance checking
	
	public boolean isvalid(String ma,double an,Car[] st){
		return ma!=null &&!ma.equals("")&&
		an>0 && st!=null;
		
	}
	
	//accessors and mutators
	
	public String getmake(){
		String temp="";
		temp=this.make;
		return temp;
	}
	public double getannual_revenue(){
		double temp1=0;
		temp1=this.annual_revenue;
		return temp1;
	}
	
	public void setmake( String m){
		this.make=m;
	}
	
	public void setannual_revenue(double r){
		this.annual_revenue=r;
	}
	public Car[] getstocklist(){
		Car[] temp2=new Car[stocklist.length];
		for(int i=0;i<stocklist.length;i++){
			temp2[i]=new Car(stocklist[i]);
		}
		return temp2;
	}
	
	
	public void setstocklist(Car[] st){
		for(int i=0;i<st.length;i++){
			this.stocklist[i]=st[i];
		}
	}
	
	//tostring method
	
	public String tostring(){
		String output="";
		output+= "make: "+make+"\nannual_revenue: "+annual_revenue+"\n";
		for(int i=0;i<stocklist.length;i++){
			output+=stocklist[i].tostring();
			output+="\n";
		}
		return output;
	}
	public static void main(String[] args){
		Car[] ca=new Car[3];
		ca[0]=new Car("abc","corolla",4);
		ca[1]=new Car("def","outlander",4);
		ca[2]=new Car("xyz","altis",4);
		Dealer d=new Dealer("toyota",64585348,ca);
		System.out.println(d.tostring());
	}
}
