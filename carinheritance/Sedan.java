public class Sedan extends Car{
	private int num_door;
	private double engine_cap;
	private int num_pass;
	
	
	public Sedan(String m,String mo,double w,int nu,double en,int num){
		super(m,mo,w);
		if(! isValidstate(m,mo,w,nu,en,num)){
			System.out.println("Fatal error");
			System.exit(0);
		}
		this.num_door=nu;
		this.engine_cap=en;
		this.num_pass=num;
	}
	
	public boolean isValidstate(String ma,String mod,double we,int nu,double en,int num){
		return ma!=null && !ma.equals(" ")&& 
         (we!=0)&& mod!=null && !mod.equals(" ")
         &&nu!=0&&en!=0&&num!=0;
	}	 
		 
		 
	public String toString(){
			String output= " ";
			output+= super.toString()+ "num of doors : " + num_door + "\n engine_capacity:" + engine_cap + " \n num of passangers : " + num_pass + "\n"   ;

return output;
}
	
	public static void main(String[] args){
		Sedan s=new Sedan("toyota","outlander",45645,4,856.5,4);
		System.out.println(s.toString());
}
}
