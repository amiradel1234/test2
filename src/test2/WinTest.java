package test2;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WinTest extends JFrame {

	public WinTest() {
		add(new JButton("AAA"));
		add(new JButton("BBB"), BorderLayout.SOUTH);
		pack();
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new WinTest().setVisible(true);
	}

}
