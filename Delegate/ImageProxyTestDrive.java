package Delegate;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.JFrame;

public class ImageProxyTestDrive {
	
	public static void main(String[] args) throws Exception
	{
		JFrame frame = new JFrame("CD Cover Viewer");
		
		Icon icon = new ImageProxy(new URL("file://\\Tulips.jpg"));
		
		ImageComponent imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
	}
}
