package view.player;
import javax.swing.*;
import java.awt.*;


public class Test extends JFrame {
	
	private JFrame f;
	private JPanel p;
	private JButton b1;
	private JLabel lab;
	
	public Test(){
		gui();
	}
	
	public void gui() {
		f = new JFrame("Creativity tuts");
		f.setVisible(true);
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel(new GridBagLayout());
		p.setBackground(Color.BLUE);
		
		b1 = new JButton("TEST");
		lab = new JLabel("This is test label");
		lab.setToolTipText("This shows up on hover");
		
		p.add(b1);
		p.add(lab);
		GridBagConstraints c = new GridBagConstraints();
		
		
		f.add(p,BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
