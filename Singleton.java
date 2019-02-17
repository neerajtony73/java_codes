public class Singleton{
	private static Singleton singleton=new Singleton();
	
	private Singleton(){
	}
	
	public static Singleton getinstance(){
		return singleton;
	}
	
	protected  static  void DoThis(){
		System.out.print("this is singleton class");
	}
}

