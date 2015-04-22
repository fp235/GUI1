
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JTextField;
import javax.swing.JFrame;

public class Flow extends JFrame{


		//initializing instance variables
		private JTextField [] textField = new JTextField[4];
		/**
		 * constructor for creating the GUI
		 */
		public Flow() {
			textField[0] = new JTextField(5);
			textField[1] = new JTextField(5);
			textField[2] = new JTextField(5);
			textField[3] = new JTextField(5);
			setLayout(new FlowLayout());
			add(textField[0]);
			add(textField[1]);
			add(textField[2]);
			add(textField[3]);
			setVisible(true);
			setSize(new Dimension(250, 250));
		}
	}
