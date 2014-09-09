package test2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WinTest extends JFrame {

	public WinTest() {
		add(new JButton("AAA"));
		pack();
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new WinTest().setVisible(true);
	}

}
