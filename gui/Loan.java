/*
 * NEERAJ TONY
 * ID:1234083
 * LAB:11
 * */
 
import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*;  
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.text.*;

 public class Loan{
	 public static void main(String[] args){
		 JFrame f=new JFrame();
		 f.setSize(300,200);
		 JLabel l1=new JLabel("Emter loan amount,interest rate and year");
		 JPanel p1=new JPanel();
		  JPanel p2=new JPanel();
		   JPanel p3=new JPanel();
		   p1.add(l1);
		   JLabel l2=new JLabel("Annual Interest Rate");
		   JTextField t1=new JTextField(8);
		   JLabel l3=new JLabel("Number of Years");
		   JTextField t2=new JTextField(8);
		   JLabel l4=new JLabel("Loan Amount");
		   JTextField t3=new JTextField(8);
		   JLabel l5=new JLabel("Monthly Payment");
		   JTextField t4=new JTextField(8);
		   JLabel l6=new JLabel("Total Payment");
		   JTextField t5=new JTextField(8);
		
		   p2.setLayout(new GridLayout(5,1,2,2));
		   
		   p2.add(l2);p2.add(t1);p2.add(l3);p2.add(t2);
		    p2.add(l4);p2.add(t3);p2.add(l5);p2.add(t4);
		     p2.add(l6);p2.add(t5);
		   
		   JButton b1=new JButton("Calculate");
		   
		   p3.add(b1);
		   f.add(p1,BorderLayout.NORTH);
		  f.add(p2,BorderLayout.CENTER);
		  f.add(p3,BorderLayout.SOUTH);
		  t4.setEditable(false);
		  t5.setEditable(false);
		  b1.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e){
				  float rate=Float.parseFloat(t1.getText());
				   int years=Integer.parseInt(t2.getText());
				    float amount=Float.parseFloat(t3.getText());
				  float total=amount*(1+(rate*years));
				  float monthly=total/12;
				  t4.setText(String.valueOf(monthly));
				  t5.setText(String.valueOf(total));
				 
			 
			 
	}});
		  		
		  		
		  
		  f.setVisible(true);
		  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }
  }

		   
		   
		   
		 
		 
