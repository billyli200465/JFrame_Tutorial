package view.player;
import java.awt.*;
import javax.swing.*;

public class tuna extends JFrame{
	private JLabel lab;
	
	public tuna() {
		super("The title bar");
		setLayout(new FlowLayout());
		
		lab = new JLabel("This is a sentence");
		lab.setToolTipText("This is gonna show up on hover");
		add(lab);
	}
}
