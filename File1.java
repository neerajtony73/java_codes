/*
 * NEERAJ TONY
 * LAB 13
 * ID:1234083
 * */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1{
	public static void main(String[] args){
		try{
			File file=new File("text.txt");
			String num="";
			for(int i=0;i<10;i++){
				num+=((int)(Math.random()*10))+" ";
			}
			FileOutputStream out=new FileOutputStream(file);
			byte[] numBytes=num.getBytes();
			out.write(numBytes);
			out.close();
			
			FileInputStream input=new FileInputStream(file);
			int readop;
			while((readop=input.read())!=-1){
				System.out.print((char)readop);
			}
			input.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
