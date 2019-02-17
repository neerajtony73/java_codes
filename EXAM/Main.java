
import java.lang.reflect.Method;

public class Main{
	public static void main(String[] args) throws Exception{
		New n=new New();
		Class clazz=n.getClass();
		Method m=clazz.getDeclaredMethod("meth");
		m.setAccessible(true);
		m.invoke(n);
	}
}
