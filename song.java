import java.util.Scanner;
public class song{
public static void main(String[] argv){
	int n,count=0;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter n");
	n=scan.nextInt();
	int[] a=new int[n];
	System.out.println("enter the song durations");
	for(int i=0;i<n;i++){
		a[i]=scan.nextInt();
		System.out.println("\t");
	}
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			System.out.println(a[i] +"+" +a[j]);
			if((a[i]+a[j])%60==0){
				count++;
			}
		}
	}
	System.out.println(count);
}
}
