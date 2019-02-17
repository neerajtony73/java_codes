import javax.swing.*; 
import java.awt.FlowLayout;
//import java.awt.event;
public class MyFrame extends JFrame{
	
  public static void main(String[] args) {
    JFrame frame = new JFrame("Test Frame");
    frame.setSize(400, 300);
  JTextField t1;
   frame.setLayout(new FlowLayout(2,20,30));
   frame.add(new JButton("hi"));
      frame.add(new JLabel("North"));
       t1=new JTextField("hello");
       t1.setBounds(50,100,20,20);
       frame.add(t1);
      frame.add(new JLabel("South"));
     // frame.add(new JTtextField(8));
      frame.add(new JLabel("East"));
     // frame.add(new JTtextField(8));
     
       frame.setVisible(true);
     //  frame.BorderLayout(5,5);
    // setHgap(5);
       frame.setDefaultCloseOperation(
      JFrame.EXIT_ON_CLOSE);
  }
   }
