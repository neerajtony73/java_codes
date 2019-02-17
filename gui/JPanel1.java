import javax.swing.*; 
import java.awt.*;  
import java.awt.FlowLayout;
 import java.awt.BorderLayout;
 public class JPanel1{
	 public static void main(String[] args){
		 JFrame f=new JFrame();
		 JPanel p=new JPanel();
		  JPanel p2=new JPanel();
		 JButton b1=new JButton("b1");
		 b1.setBackground(Color.yellow);
		 b1.setForeground(Color.red);


		 JButton b2=new JButton("b2");
		 JButton b3=new JButton("b3");
		 JButton b4=new JButton("b4");
		 JButton b5=new JButton("b5");
		 JButton b6=new JButton("b6");
		 JButton b7=new JButton("b7");
		 JButton b8=new JButton("b8");
		 JButton b9=new JButton("b9");
		 JButton b10=new JButton("b10");
		 p.add(b1);p.add(b2);p.add(b3);
		 p.add(b4);p.add(b5);
		 p2.add(b6);p2.add(b7);p2.add(b8);p2.add(b9);p2.add(b10);
		 f.add((p),BorderLayout.NORTH);f.add((p2),BorderLayout.SOUTH);
		 f.setSize(300,400);
		 f.setVisible(true);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
 }
		 
		 
		 
