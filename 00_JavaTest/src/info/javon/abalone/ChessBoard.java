package info.javon.abalone;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessBoard {
	
	private static JFrame frame;
	
	public static void main(String[] args) {
		frame =new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 640, 440);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		JPanel jPanel = new JPanel();
		frame.add(jPanel);
		
		System.out.println("哈哈");
		System.out.println("研究中哈");
	}
}
