import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Collections; 

public class Word_Count {

    // Complete the isValid function below.
    public static int clac(int q,int w){
    if (q>w){
        return q;
    }
    else {
        return w;

    }
}
    static String isValid(String s) {
int maxcount=0;
char c;
String r;

int[] count=new int[26];
for(int i=0;i<26;i++){
	count[i]=0;
}
System.out.println(Arrays.toString(count));

for(int i=0;i<s.length();i++){
    c=s.charAt(i);
    switch(c){

    case('a'):count[0]++;
            maxcount=clac(count[0],maxcount);
            break;
    case('b'):count[1]++;
            maxcount=clac(count[1],maxcount);
             break;
    case('c'):count[2]=count[2]+1;
            maxcount=clac(count[2],maxcount);
             break;
    case('d'):count[3]++;
            maxcount=clac(count[3],maxcount);
             break;
    case('e'):count[4]++;
            maxcount=clac(count[4],maxcount);
             break;

    case('f'):count[5]++;
            maxcount=clac(count[5],maxcount);
             break;

    case('g'):count[6]++;
            maxcount=clac(count[6],maxcount);
             break;
    case('h'):count[7]++;
            maxcount=clac(count[7],maxcount);
             break;
    case('i'):count[8]++;
            maxcount=clac(count[8],maxcount);
             break;
    case('j'):count[9]++;
            maxcount=clac(count[9],maxcount);
             break;
    case('k'):count[10]++;
            maxcount=clac(count[10],maxcount);
             break;
    case('l'):count[11]++;
            maxcount=clac(count[11],maxcount);
             break;

    case('m'):count[12]++;
            maxcount=clac(count[13],maxcount);
             break;

    case('n'):count[13]++;
            maxcount=clac(count[13],maxcount);
             break;
    case('o'):count[14]++;
            maxcount=clac(count[14],maxcount);
             break;
    case('p'):count[15]++;
            maxcount=clac(count[15],maxcount);
             break;
    case('q'):count[16]++;
            maxcount=clac(count[16],maxcount);
             break;

    case('r'):count[17]++;
            maxcount=clac(count[17],maxcount);
             break;
    case('s'):count[18]++;
            maxcount=clac(count[18],maxcount);
             break;

    case('t'):count[19]++;
            maxcount=clac(count[19],maxcount);
             break;
    case('u'):count[20]++;
            maxcount=clac(count[20],maxcount);
             break;
    case('v'):count[21]++;
            maxcount=clac(count[21],maxcount);
             break;
    case('w'):count[22]++;
            maxcount=clac(count[22],maxcount);
             break;
    case('x'):count[23]++;
            maxcount=clac(count[23],maxcount);
             break;
    case('y'):count[24]++;
            maxcount=clac(count[24],maxcount);
             break;
    case('z'):count[25]++;
            maxcount=clac(count[25],maxcount);
             break;
    
    
    // case(g):count[6]++;
    //         maxcount=clac(count[6],maxcount);
    // case(g):count[6]++;
    //         maxcount=clac(count[6],maxcount);
    // case(g):count[6]++;
    //         maxcount=clac(count[6],maxcount);
    // case(g):count[6]++;
    //         maxcount=clac(count[6],maxcount);
    // case(g):count[6]++;
    //         maxcount=clac(count[6],maxcount);

    
    }
}
//Comparator<Integer> cmp = ;
//Arrays.sort(count);
//sort(T[] a, Comparator<? super T> c) ;
Arrays.sort(count, Collections.reverseOrder());
//Collections.reverseOrder(count);

System.out.println(Arrays.toString(count));

for(int i=0;i<25;i++){
    if (maxcount-count[i]>1){
       s="NO";
        break;
    }
    else if(count[i] ==count[i+1] && maxcount-count[i]>0){
        s="NO";
        break;
    }
    else{
         s="YES";
    }
    }
    return s;
}


    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();
        System.out.println(isValid(s));

        //~ String result = isValid(s);

        //~ bufferedWriter.write(result);
        //~ bufferedWriter.newLine();

        //~ bufferedWriter.close();

        //~ scanner.close();
    }
}
