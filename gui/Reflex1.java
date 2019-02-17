import javax.swing.JOptionPane;
import java.awt.*;  
import javax.swing.*; 
import java.awt.event.*;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.Calendar;
import java.text.*;


public class Reflex1 {
public static void main(String args[]){
	
	
	JFrame f=new JFrame("convertor");
	f.setSize(400,300);
	f.setLayout(new GridLayout(2,2,2,2));
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton t1=new JButton("1");
	JButton t2=new JButton("2");
	JButton t3=new JButton("3");
	JButton t4=new JButton("4");
	f.add(t1);f.add(t2);f.add(t3);f.add(t4);
	f.setVisible(true);
		int score=0;
	int button_X_Pos1 = t1.getLocationOnScreen().x;
	int button_Y_Pos1 = t1.getLocationOnScreen().y;
	button_X_Pos1+=button_X_Pos1+11500;
	button_Y_Pos1 =button_Y_Pos1+11500;
	System.out.println(button_X_Pos1);
		System.out.println(button_Y_Pos1);
		
		PointerInfo a = MouseInfo.getPointerInfo();
	Point b = a.getLocation();
	int x = (int) b.getX();
	int y = (int) b.getY();
	System.out.print(y + "jjjjjjjjj");
	System.out.print(x);
	//System.out.print("score:");
	if( (x<button_X_Pos1)||(y<button_Y_Pos1)){
	score++;
		System.out.print("\n"+score);
	}
	else {
		System.out.print("missed");
	}
}
}
