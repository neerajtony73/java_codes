import javax.swing.*; 
import java.awt.GridLayout;
public class Grid{
	public static void main(String[] args){
		JFrame f=new JFrame("frame");
		f.setLayout(new GridLayout(2,2,2,2));
		f.add(new JButton("1"));
				f.add(new JButton("2"));
						f.add(new JButton("3"));
								f.add(new JButton("4"));
								
							f.setSize(200,200);
							f.setVisible(true);
							 f.setDefaultCloseOperation(
      JFrame.EXIT_ON_CLOSE);
  }
}	
