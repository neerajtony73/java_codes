import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Array_rot {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
int len=a.length;
        for(int i=1;i<=d;i++){
			 int temp=0;
            for(int j=0;j<=a.length-1;j++ ){
               
                if(j==0){
					temp=a[len-1];
                    a[len-1]=a[j];
                    //temp=a[j];
           // a[j]=a[j+1];
            System.out.println(Arrays.toString(a));
                System.out.println(temp);    
                }
               else  if(j==(a.length-1)){
					a[j-1]=temp;
					System.out.println(Arrays.toString(a));
				}
                
                else  {
					//temp=a[j];
            a[j-1]=a[j];
            System.out.println(Arrays.toString(a));
                }
                
                //~ else{
                    //~ a[j]=temp;
//~ System.out.println(Arrays.toString(a));
                //~ }
                
        }
        }
        return (a);


    }
    //for(int i=0;i<a.length;i++)
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
Scanner scan=new Scanner(System.in);
        //String[] nd = scanner.nextLine().split(" ");
int n=scan.nextInt();
int d=scan.nextInt();
int[] a=new int[n];
      

        for (int i = 0; i < n; i++) {
          
            a[i] = scan.nextInt();
        }

        int[] result = rotLeft(a, d);
System.out.println(Arrays.toString(a));
        
    }
}
