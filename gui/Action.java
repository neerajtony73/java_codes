import java.awt.*;  
import javax.swing.*; 
import java.awt.event.*;  
public class Action {
	public static void main(String[] args){
		JFrame f=new JFrame("Action");
		f.setSize(500,200);
		JButton t1=new JButton("Click Here");
		t1.setBounds(100,175,20,20);
		JTextField txt=new JTextField(8);
		txt.setBounds(100,100,100,200);

		t1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txt.setText("welcome");
			}
		});
		f.add(t1);f.add(txt);
		f.setVisible(true);
		f.setLayout(new FlowLayout(1,20,20));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
		
				
