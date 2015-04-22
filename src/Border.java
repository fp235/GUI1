import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JFrame;

public class Border extends JFrame {

	
	private JFrame frame;
	private JPanel panel;
	private JTextField [] TextField= new JTextField[4];
	public Border()
	{	frame=new JFrame();
		frame.setSize(new Dimension (500,100));
		TextField[0]= new JTextField(10);
		TextField[1]= new JTextField(10);
		TextField[2]= new JTextField(10);
		TextField[3]= new JTextField(10);
		panel=new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.red);
		panel.add(TextField[0],BorderLayout.PAGE_START);
		panel.add(TextField[1],BorderLayout.LINE_START);
		panel.add(TextField[2],BorderLayout.LINE_END);
		panel.add(TextField[3],BorderLayout.PAGE_END);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
