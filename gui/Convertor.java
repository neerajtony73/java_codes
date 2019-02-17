import java.awt.*;  
import javax.swing.*; 
import java.awt.event.*;
public class Convertor{
	public static void main(String[] args){
		JFrame f=new JFrame("convertor");
		f.setSize(400,300);
		
		f.setLayout(new FlowLayout(1,20,10));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton t1=new JButton("toUpper");
		JButton t2=new JButton("toLower");
		JButton t3=new JButton("clear");
		JTextArea txt=new JTextArea("enter text here",10,25);
		f.add(t1);f.add(t2);f.add(t3);f.add(txt);
		t1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String upper=txt.getText();
				String converted=upper.toUpperCase();
				txt.setText(converted);
			}
		});
		t2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent r){
				String lower=txt.getText();
				String converted=lower.toLowerCase();
				txt.setText(converted);
			}
		});
		t3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent r){
				txt.setText("");
			}
		});
		f.setVisible(true);
	}
}
				
		
