public class Rectangle{
	public double width=1;
	public double height=1;
	
	Rectangle(){
	}
	Rectangle(double a, double b){
		this.width=a;
		this.height=b;
	}
	
public double getarea(){
	return width*height;
}
public double getperimeter(){
	return (2*(width+height));
}

public static void main(String[] args){
	Rectangle rec1=new Rectangle();
	Rectangle rec2=new Rectangle(4,40);
	System.out.println("the area of default rectangle  is :" + rec1.getarea());
	System.out.println("the perimeter of default rectangle is :" +rec1.getperimeter()); 
    System.out.println("the area of second rectangle is :" +rec2.getarea()); 
	System.out.println("the perimeter of second rectangle is :" +rec2.getperimeter());
}
}
