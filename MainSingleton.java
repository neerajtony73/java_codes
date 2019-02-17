public class MainSingleton{
	public static void main(String[] args){
		Singleton tmp;
		tmp = Singleton.getinstance();
		//Singleton tmp = Singleton.getinstance( );
		tmp.DoThis();
	}
}
