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

public class Reflex {
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
		int score=0;
	int lives=3;
	//~ for(int i=0;i<2000;i++){
		//~ t1.setBackground(null);
		//~ t2.setBackground(null);
		//~ t3.setBackground(null);
		//~ t4.setBackground(null);
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
			
				f.setVisible(true);
		
	Calendar c=Calendar.getInstance();
		         
		          
	//int  count=0;
	int init=0;
	//do{
						
				
	int button_X_Pos1 = t1.getLocationOnScreen().x;
	int button_Y_Pos1 = t1.getLocationOnScreen().y;
	System.out.println(button_X_Pos1);
		System.out.println(button_Y_Pos1);
		
		PointerInfo a = MouseInfo.getPointerInfo();
	Point b = a.getLocation();
	int x = (int) b.getX();
	int y = (int) b.getY();
	System.out.print(y + "jjjjjjjjj");
	System.out.print(x);
	System.out.print(score);
	if( (x<(button_X_Pos1+11500))||(y<(button_Y_Pos1+11500))){
	
		System.out.print(score);
	}
	else {
		System.out.print(score);
	}

		//~ Point pt = new Point(t1.getLocation()); 
//~ SwingUtilities.convertPointToScreen(pt, t1); 

		
		//~ int button_X_Pos2 = t2.getLocation().x;
	//~ int button_Y_Pos2 = t2.getLocation().y;
	//~ System.out.println(button_X_Pos2);
		//~ System.out.println(button_Y_Pos2);
		
		//~ int button_X_Pos3 = t3.getLocation().x;
	//~ int button_Y_Pos3 = t3.getLocation().y;
	//~ System.out.println(button_X_Pos3);
		//~ System.out.println(button_Y_Pos3);
		
		//~ int button_X_Pos4 = t4.getLocation().x;
	//~ int button_Y_Pos4 = t4.getLocation().y;
	//~ System.out.println(button_X_Pos4);
		//~ System.out.println(button_Y_Pos4);
		
		//if(sum==1){
			
			//~ t1.addActionListener(new ActionListener(){
			//~ public void actionPerformed(ActionEvent e){
			//~ Calendar d=Calendar.getInstance();
			//~ int fin=d.get(Calendar.MILLISECOND);
			//~ System.out.println(fin);
			//~ long elapsedTime = Math.abs(fin - init);
			//~ score++;
			//~ if(600>elapsedTime){
				//~ System.out.println(elapsedTime);
				//~ t1.setBackground(null);
				//final int  count 
			//	System.out.println(count);
				
				//~ }
		//~ else{
			//~ System.out.println("you missed");
		//~ //	score--;
			//~ }
		
		//~ }
		//~ });
		//}
			
          
        
				
			
	    
		
		//~ else if(sum==2){
			//~ t2.addActionListener(new ActionListener(){
			//~ public void actionPerformed(ActionEvent e){
			//~ Calendar d=Calendar.getInstance();
			//~ int fin=d.get(Calendar.MILLISECOND);
            //~ System.out.println(fin);
			//~ long  elapsedTime = Math.abs(fin - init);
			//~ if(600>elapsedTime){
				//~ System.out.println(elapsedTime);
				//~ t2.setBackground(null);
				//~ final int  count =1;
				//~ System.out.println(count);
				
         //~ //   score++;
				//~ }
			//~ else{
				//~ System.out.println("you missed");
				//~ }
  
       
      //~ }
		//~ });
		//~ }
		//~ else if(sum==3){
			//~ t3.addActionListener(new ActionListener(){
			//~ public void actionPerformed(ActionEvent e){
			//~ Calendar d=Calendar.getInstance();
			//~ int fin=d.get(Calendar.MILLISECOND);
            //~ System.out.println(fin);
			//~ long   elapsedTime = Math.abs(fin - init);
			//~ if(600>elapsedTime){
				//~ System.out.println(elapsedTime);
				//~ t3.setBackground(null);
          //~ //  score++;
				//~ final int  count =1;
				//~ System.out.println(count);
				//~ }
			//~ else{
				//~ System.out.println("you missed");
				//~ }
   
   
		//~ }
		//~ });
		//~ }
		//~ else if(sum==4) {
			//~ t4.addActionListener(new ActionListener(){
			//~ public void actionPerformed(ActionEvent e){
			//~ Calendar d=Calendar.getInstance();
			//~ int fin=d.get(Calendar.MILLISECOND);
            //~ System.out.println(fin);
			//~ long   elapsedTime = Math.abs(fin - init);
			//~ if(600>elapsedTime){
				//~ System.out.println(elapsedTime);
				//~ t4.setBackground(null);
				//~ final int  count =1;
          //~ //  score++;
				//~ System.out.println(count);
			//~ }
			//~ else{
				//~ System.out.println("you missed");
			//~ }
       
      
		//~ }
		//~ });
		//~ }
		
	//~ }while(lives==1);
	//~ if(count==1){
		//~ score++;
		//~ System.out.println("score:"+score);
		//~ }  

	

	}
}
