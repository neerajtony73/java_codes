public class Car{
	private String make;
	private String model;
	private double weight;
	
	public Car(){
	}
	public Car(String m,String mo,double w){
		if(! isValidstate(m,mo,w)){
			System.out.println("Fatal error");
			System.exit(0);
		}
		this.setaccessmake(m);
		this.setaccessmodel(mo);
		this.setaccessweight(w);
	}
	
	public boolean isValidstate(String ma,String mod,double we){
		return ma!=null && !ma.equals(" ")&& 
         (we!=0)&& mod!=null && !mod.equals(" ");
	}	 
		 
	
	public void setaccessmake(String ma){
		this.make=ma;
	}
	public void setaccessmodel(String mo){
		this.model=mo;
	}
public void setaccessweight(double we){
		this.weight=we;
	}
	public String toString(){
			String output= " ";
			output+=  "make : " + make + "\n model:" + model + " \n weight : " + weight + "\n"   ;

return output;
}
}

