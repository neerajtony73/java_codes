
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.JOptionPane;
 
import javax.swing.*; 

import java.awt.Color;

 
public class NewClass1 implements MouseListener{
public static void main(String[] args){


 

   JFrame frame1= new JFrame();
frame1.setSize(400,300);

 JPanel panel1 = new JPanel();
               panel1.setLayout(new GridLayout(2,2,2,2));
        JButton t1=new JButton("1");
	JButton t2=new JButton("2");
	JButton t3=new JButton("3");
	JButton t4=new JButton("4");
	panel1.add(t1);panel1.add(t2);panel1.add(t3);panel1.add(t4);
	frame1.setLocationRelativeTo(null);
	frame1.add(panel1);
	
	frame1.setVisible(true);


        //~ JFrame frame = new buildGui();
 //~ //frame.getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
//~ //frame.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));	
        //~ frame.setSize(400,300);

        //~ frame.setVisible(true);
        int button_X_Pos1 = t1.getLocationOnScreen().x;
	int button_Y_Pos1 = t1.getLocationOnScreen().y;
	System.out.println(button_X_Pos1);
		System.out.println(button_Y_Pos1);
		int score=0;
     // public bb(){
		 int sum=(int)(Math.random() * 4);
	if(sum==1){
		t1.setBackground(Color.red);
		}
	else if(sum==2){
		t2.setBackground(Color.red);
		}
	else if(sum==3){
		t3.setBackground(Color.red);
		}
	else{
		t4.setBackground(Color.red);
		}
	//}
        this.addMouseListener();
           public void mouseClicked(MouseEvent e) {

    //  String textx=lblx.getText();

    System.out.print("X="+e.getX());

	System.out.print("Y="+e.getY());
	

    }



    public void mousePressed(MouseEvent e) {

 
    }

 

    public void mouseReleased(MouseEvent e) {

 

    }

 

    public void mouseEntered(MouseEvent e) {

    }

 

    public void mouseExited(MouseEvent e) {

 

    }

  }
  }



 
