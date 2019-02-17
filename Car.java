public class Car{
	private String Vin;
	private String Model;
	private int num_doors;
	
	
	public void setAccess(String v){
		this.Vin=v;
	}
	public String getaccess(){
		 return Vin;
	 }
	 
	public void setAccessModel(String m){
		this.Model=m;
	}
	public String getaccessmodel(){
		 return Model;
	 }
	 
	 	public void setAccessNum(int n){
		this.num_doors=n;
	}
	public int getaccessnum(){
		 return num_doors;
	 }
	 
 }
	 
