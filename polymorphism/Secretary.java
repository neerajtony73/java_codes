public class Secretary extends Person{	
	public String fac_id;
	public String res_area;
	public int salary;
	public int num_vac;
	
	//construtor	
	public Secretary(String n,int a,String s,boolean al,String f,String r,int sa,int nu){
		super(n,a,s,al);
		this.fac_id=f;
		this.res_area=r;
		this.salary=sa;
		this.num_vac=nu;
	}
	//tostring method
	public String toString1(){
		System.out.println(super.toString1());
		return ("\n");
	}
	public void getPaid(){
		System.out.println(" The weekly income is:" + salary);
	}
	public void getVac(){
		System.out.println(" This person is eligible for "+num_vac+" month vacation");
	}
}
	
