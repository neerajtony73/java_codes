import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Reverse {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int[] b=new int[a.length];

//~ for(int i=0;i<4;i++){
	 //~ System.out.print(a[i]);
 //~ }
 //System.out.print(a.length);

for(int i=(a.length)-1,j=0;i>=0;i--){
  //  System.out.print(a[i]+"/t");
  
  b[j]=a[i];
  //System.out.println(b[j]);
  j++;
 
  }
return b;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

   
			Scanner scan=new Scanner(System.in);
			int[] a=new int[4];
			int[] b=new int[4];
			for(int i=0;i<4;i++){
				a[i]=scan.nextInt();
			}
			//System.out.println(a);
			b=reverseArray(a);
			for(int i=0;i<4;i++){
				System.out.println(b[i]);
			}
}
}

