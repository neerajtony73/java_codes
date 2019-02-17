import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Bank_Not {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
int len=expenditure.length;
         int median=0;
      int not =0;
        for(int i=0;i<len-d;i++){
            int[] sor=new int[d];
            System.arraycopy( expenditure, i, sor, 0, d );
              System.out.println(Arrays.toString(sor));
        Arrays.sort(sor);
          // System.out.println(d);
            System.out.println(Arrays.toString(sor));
       
            //for(int j=0;j<d;j++)
        if(d%2!=0){
            median=sor[(d/2)];
            System.out.println(median);
            
        }
        else{
            median=(sor[(d/2)]+sor[(d/2)+1])/2;
             System.out.println(median);
        }
             System.out.println("check:"+(i+d+1) );
             if( (i+d+1)<len){
				  System.out.println((2*median)+" " + expenditure[d+i] );
               if(  (2*median) <expenditure[d+i+1] ){
				  System.out.println((2*median)+" " + expenditure[d+i] );
            not++;
             System.out.println( not);
        }
             }
        
        }
        return not;
       
    }
       

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //~ BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //~ String[] nd = scanner.nextLine().split(" ");

        //~ int n = Integer.parseInt(nd[0]);

        //~ int d = Integer.parseInt(nd[1]);
         int n=0,d=0;
        Scanner scan=new Scanner(System.in);
       
System.out.println("enter the number of elements");
n=scan.nextInt();
System.out.println("enter the trailing");
d=scan.nextInt();
        int[] expenditure = new int[n];

        //~ String[] expenditureItems = scanner.nextLine().split(" ");
        //~ scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
           // int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = scan.nextInt();
        }

        int result = activityNotifications(expenditure, d);

        //~ bufferedWriter.write(String.valueOf(result));
        //~ bufferedWriter.newLine();

        //~ bufferedWriter.close();

        //~ scanner.close();
        System.out.println(result);
    }
}

