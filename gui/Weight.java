import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*;  
import java.awt.FlowLayout;
 import java.awt.BorderLayout;
 import java.text.*;

 public class Weight{
	 public static void main(String[] args){
		 JFrame f=new JFrame();
		 f.setSize(300,200);
		 JLabel l1=new JLabel("Measurement Unit Converter");
		 JPanel p1=new JPanel();
		  JPanel p2=new JPanel();
		   JPanel p3=new JPanel();
		   p1.add(l1);
		   JLabel l2=new JLabel("Pound");
		   JTextField t1=new JTextField(8);
		   JLabel l3=new JLabel("Kilogram");
		   JTextField t2=new JTextField(8);
		   p2.setLayout(new GridLayout(2,2,2,2));
		   
		   p2.add(l2);p2.add(t1);p2.add(l3);p2.add(t2);
		   
		   JButton b1=new JButton("Convert");
		   JButton b2=new JButton("Clear");
		   p3.add(b1);p3.add(b2);
		   f.add(p1,BorderLayout.NORTH);
		  f.add(p2,BorderLayout.CENTER);
		  f.add(p3,BorderLayout.SOUTH);
		  
		  b1.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e){
				  if((t2.getText()).equals("")){
					double kilo=((Double.parseDouble(t1.getText()))/2.20462);
					DecimalFormat df=new DecimalFormat("#.#####");
					String formated=df.format(kilo);
				   t2.setText(formated);
				    b1.setBackground(Color.red);
				}
				if((t1.getText()).equals("")){
				 double pound=((Double.parseDouble(t2.getText()))*2.20462);
				DecimalFormat df=new DecimalFormat("#.#####");
				String formated=df.format(pound);
				  t1.setText(formated);
				   b1.setBackground(Color.red);
			 }
			 
	}});
		  		
		  		 b2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent r){
				  t1.setText("");
				  t2.setText("");
				  b1.setBackground(null);
			
				  
			  }
		  });
		  
		  f.setVisible(true);
		  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }
  }

		   
		   
		   
		 
		 
