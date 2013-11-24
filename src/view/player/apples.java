package view.player;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class apples {
	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("Enter First Number");
		String sn = JOptionPane.showInputDialog("Input second number");
		Dimension d = new Dimension(275, 180);
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The answer is " +sum, "the title", JOptionPane.PLAIN_MESSAGE);
		
		potpie bucky = new potpie();
		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bucky.setSize(d);
		bucky.setVisible(true);
	}
}
