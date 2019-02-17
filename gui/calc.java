import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class calc implements ActionListener{
	JFrame guiFrame;
	JPanel buttonPanel;
	JTextField numberCalc;
	float calcOperation = 0;
	float currentCalc;
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable(){
		public void run(){
			new calc();
			}
		});

	}

	public calc(){
	guiFrame = new JFrame();
	guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	guiFrame.setTitle("Simple Calculator");
	guiFrame.setSize(300,300);
	guiFrame.setLocationRelativeTo(null);
	numberCalc = new JTextField();
	JLabel j=new JLabel("Created by:Neeraj & Brilendra");
	j.setHorizontalAlignment(JTextField.CENTER);
	guiFrame.add(j,BorderLayout.SOUTH);
	numberCalc.setHorizontalAlignment(JTextField.RIGHT);
	numberCalc.setEditable(false);
	guiFrame.add(numberCalc, BorderLayout.NORTH);
	buttonPanel = new JPanel();
	buttonPanel.setLayout(new GridLayout(5,3));
	guiFrame.add(buttonPanel, BorderLayout.CENTER);

				
	JRadioButton  onButton=new JRadioButton ("on/off");
	for (int i=1;i<10;i++){
		addButton(buttonPanel, String.valueOf(i));
		}
			
	JButton mulButton = new JButton("*");
	mulButton.setActionCommand("*");
	OperatorAction mulAction = new OperatorAction(3);

	JButton divButton = new JButton("/");
	mulButton.setActionCommand("/");
	OperatorAction divAction = new OperatorAction(4);

				
	JButton addButton = new JButton("+");
	addButton.setActionCommand("+");
	OperatorAction subAction = new OperatorAction(1);

				
	JButton subButton = new JButton("-");
	subButton.setActionCommand("-");
	OperatorAction addAction = new OperatorAction(2);

				
	JButton equalsButton = new JButton("=");
	equalsButton.setActionCommand("=");
	onButton.addItemListener(new ItemListener() {
		@Override
		public void itemStateChanged(ItemEvent event) {
		int state = event.getStateChange();
		if (state == ItemEvent.SELECTED) {
			mulButton.addActionListener(mulAction);
			subButton.addActionListener(addAction);
			addButton.addActionListener(subAction);
			divButton.addActionListener(divAction);
			}
		else{
			mulButton.removeActionListener(mulAction);
			subButton.removeActionListener(addAction);
			addButton.removeActionListener(subAction);
			divButton.removeActionListener(divAction);
			}
		}});

	equalsButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event){
			if (!numberCalc.getText().isEmpty()){
				int number = Integer.parseInt(numberCalc.getText());
					
			if (calcOperation == 1){
				int calculate = (int)currentCalc + (int)number;
				numberCalc.setText(Integer.toString(calculate));
				}
			else if (calcOperation == 2){
				int calculate = (int)currentCalc -(int)number;
				numberCalc.setText(Integer.toString(calculate));
				}
			else if (calcOperation == 3){
				int calculate = (int)currentCalc * (int)number;
				numberCalc.setText(Integer.toString(calculate));
				}
			else if (calcOperation == 4){
				float calculate1 = (currentCalc / number);
				numberCalc.setText(Float.toString(calculate1));
				}
			}
			}
			});

			buttonPanel.add(addButton);
			buttonPanel.add(subButton);
			buttonPanel.add(mulButton);
			buttonPanel.add(divButton);
			buttonPanel.add(equalsButton);
			buttonPanel.add(onButton);
				
				
		guiFrame.setVisible(true);

		}
				
		private void addButton(Container parent, String name){
			JButton but = new JButton(name);
			but.setActionCommand(name);
			but.addActionListener(this);
			parent.add(but);
			}


		public void actionPerformed(ActionEvent event){
			String action = event.getActionCommand();
			numberCalc.setText(action);
			}

		private class OperatorAction implements ActionListener{
			private float operator;
			public OperatorAction(float operation){
			operator = operation;
			}
		public void actionPerformed(ActionEvent event){
			currentCalc = Integer.parseInt(numberCalc.getText());
			calcOperation = operator;
			}
		}
				
}



