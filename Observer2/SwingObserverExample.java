package Observer2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class SwingObserverExample {
	JFrame frame;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingObserverExample examle = new SwingObserverExample();
		examle.go();
	}
	
	public SwingObserverExample() {
		// TODO Auto-generated constructor stub
	}
	
	public void go()
	{
		frame = new JFrame();
		
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER,button);
		frame.setTitle("ActionTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			System.out.println("Dont't do it,you might regret it!");
		}
	}
	
	class DevilListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Come on, do it");
		}

	}
}
