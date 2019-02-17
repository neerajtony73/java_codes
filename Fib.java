NEERAJ TONY
ID:1234083
HW_12

public class Fib { 
	public static void main(String args[]){    
		int c0=0,c1=1,c2,i;
		int count=12;    
		System.out.print(c0+" "+c1);  
		for(i=2;i<count;i++){    
			c2=c0+c1;    
			System.out.print(" "+c2);    
			c0=c1;    
			c1=c2;    
			}    
	}

} 
