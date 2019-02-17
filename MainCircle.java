public class MainCircle{
	public static void main(String[] args){
		Circle cir1=new Circle();
		Circle cir2=new Circle(5.5);
		
		System.out.println("area of default circle is :" + cir1.getArea());
        System.out.println("area of default circle is :" + cir2.getArea());
	}
}
