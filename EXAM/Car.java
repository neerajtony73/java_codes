public class Car{
	private String vin;
	private  String model;
	private int num_doors;
	
	//constructors
	public Car(String v,String m,int n){
		if(! isvalid(v,m,n)){
			//System.out.println("fatal error");
			System.out.println("fatal error");
			System.exit(0);
		}
	this.vin=v;
	this.model=m;
	this.num_doors=n;
	}
	public Car(Car oth){
		this.vin=oth.vin;
		this.model=oth.model;
		this.num_doors=oth.num_doors;
	}
	
	public boolean isvalid(String vi,String mo,int nu){
		return vi!=null && !vi.equals("")
					&& mo!= null && !mo.equals("")&&
					nu>1;
				}
	
	//accessors and mutators
	
	public String getvin(){
		String temp="";
		temp=new String (this.vin);
		return temp;
	}
	
	public void setvin(String v){
		this.vin=v;
	}
	public String getmodel(){
		String temp1="";
		temp1=new String (this.model);
		return temp1;
	}
	
	public void setmodel(String m){
		this.model=m;
	}
	public int getnum_doors(){
		return this.num_doors;
	}
	public void setnum_doors(int n){
		this.num_doors=n;
	}
	
	//tostring method
	public String tostring(){
		String output="";
		output+="vin: "+vin+"\nmodel: "+model+"\nnumdoors: "+num_doors;
		return output;
	}
}
	
	
