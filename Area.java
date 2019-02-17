public class Area{
	
	public Area(double r){
		this.r=r;
	}
	public Area(){
		this(2.0);
	}
	public static double area(){
		return r*r*3.14;
	}
	public static void main(String[] args){
		 double r=0;
		double a=0;
		a=Area(r);
		System.out.println(area());
	}
}
