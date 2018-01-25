import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Temperature extends JFrame {
	private JLabel label1;
	private JTextField textfield1;
	private JButton button1;
	private JLabel label2;
	private JLabel label3;
	
	private JLabel label4;
	private JTextField textfield2;
	private JButton button2;
	private JLabel label5;
	private JLabel label6;
	
	private JLabel label7;
	private JTextField textfield3;
	private JButton button3;
	private JLabel label8;
	private JLabel label9;
	
	private JPanel panel;
	
	public Temperature(){
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(2,10,2,10);
		
		//Celsius
		
		label1 = new JLabel("Temperature in C");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(label1, gbc);
		
		textfield1 = new JTextField(8);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(textfield1, gbc);
		
		button1 = new JButton("Convert C");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 2;
		gbc.gridy = 0;
		add(button1, gbc);
		
		label2 = new JLabel("result F");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(label2, gbc);
		
		label3 = new JLabel("result K");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 2;
		gbc.gridy = 1;
		add(label3, gbc);
		
		//Fahrenheit
		
		label4 = new JLabel("Temperature in F"); 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(label4, gbc);
		
		textfield2 = new JTextField(8);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 2;
		add(textfield2, gbc);
		
		button2 = new JButton("Convert F");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 2;
		gbc.gridy = 2;
		add(button2, gbc);
		
		label5 = new JLabel("result C");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(label5, gbc);
		
		label6 = new JLabel("result K");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 2;
		gbc.gridy = 3;
		add(label6, gbc);
		
		//Kelvin
		
		label7 = new JLabel("Temperature in K"); 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(label7, gbc);
		
		textfield3 = new JTextField(8);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 4;
		add(textfield3, gbc);
		
		button3 = new JButton("Convert K");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 2;
		gbc.gridy = 4;
		add(button3, gbc);
		
		label8 = new JLabel("result C");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 5;
		add(label8, gbc);
		
		label9 = new JLabel("result F");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 2;
		gbc.gridy = 5;
		add(label9, gbc);
		
		//event
		
		event e1 = new event();
		button1.addActionListener(e1);
		
		event2 e2 = new event2();
		button2.addActionListener(e2);
		
		event3 e3 = new event3();
		button3.addActionListener(e3);
	}
	
	public class event implements ActionListener {
		
		public void actionPerformed(ActionEvent e1){
			
			try {
				double cTemp = (double) Double.parseDouble(textfield1.getText());
				
				double cfTemp = (cTemp-32.0)*(5.0/9.0);
				cfTemp = (double) Math.round(cfTemp*100d)/100d;
				
				double ckTemp = cTemp + 273.15;
				ckTemp = (double) Math.round(ckTemp*100d)/100d;
				
				if (cTemp>=-273.15){
					label2.setText(cfTemp+"F");
					label2.setForeground(Color.black);
					label3.setText(ckTemp+"K");
					label3.setForeground(Color.black);
				} else {
					label2.setText("Not < -273.15");
					label2.setForeground(Color.red);
					label3.setText("");
				}
				
			} catch (Exception ex){
				label2.setText("Number only");
				label2.setForeground(Color.red);
				label3.setText("");
			}
			
		}
		
	}
	
	public class event2 implements ActionListener {
		
		public void actionPerformed(ActionEvent e2){
			
			try {
				double fTemp = (double) Double.parseDouble(textfield2.getText());
				
				double fcTemp = (fTemp*9.0/5.0+32.0);
				fcTemp = (double) Math.round(fcTemp*100d)/100d;
				
				double fkTemp = (fTemp + 459.67)*5.0/9.0;
				fkTemp = (double) Math.round(fkTemp*100d)/100d;
				
				if (fTemp>=-459.67){
					label5.setText(fcTemp+"C");
					label5.setForeground(Color.black);
					label6.setText(fkTemp+"K");
					label6.setForeground(Color.black);
				} else {
					label5.setText("Not < -459.67");
					label5.setForeground(Color.red);
					label6.setText("");
				}
				
			} catch (Exception ex){
				label5.setText("Number only");
				label5.setForeground(Color.red);
				label6.setText("");
			}
			
		}
		
	}
	
	public class event3 implements ActionListener {
		
		public void actionPerformed(ActionEvent e3){
			
			try {
				double kTemp = (double) Double.parseDouble(textfield3.getText());
				
				double kcTemp = kTemp - 273.15;
				kcTemp = (double) Math.round(kcTemp*100d)/100d;
				
				double kfTemp = (kTemp*9.0/5.0)-459.67; 
				kfTemp = (double) Math.round(kfTemp*100d)/100d;
				
				if (kTemp>=0){
					label8.setText(kcTemp+"C");
					label8.setForeground(Color.black);
					label9.setText(kfTemp+"F");
					label9.setForeground(Color.black);
				} else {
					label8.setText("Not < 0");
					label8.setForeground(Color.red);
					label9.setText("");
				}
				
			} catch (Exception ex){
				label8.setText("Number only");
				label8.setForeground(Color.red);
				label9.setText("");
			}
			
		}
		
	}
	
	public static void main(String[] agrs){
		Temperature gui = new Temperature();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(400,400);
		gui.setTitle("Converter");
		gui.pack();
		gui.setVisible(true);
		gui.setResizable(false);
		
		
	}
		
		
}