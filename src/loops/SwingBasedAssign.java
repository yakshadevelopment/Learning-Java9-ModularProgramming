package loops;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class SwingBasedAssign {
	
	
	public static void main(String args[])
	{
		JFrame frame=new JFrame();
		JButton btnCenter=new JButton("Center");
		frame.add(btnCenter);
		JButton btnEast=new JButton("East");
		frame.add(btnEast,BorderLayout.EAST);
		JButton btnWest=new JButton("West");
		frame.add(btnWest,BorderLayout.WEST);
		JButton btnSouth=new JButton("South");
		frame.add(btnSouth,BorderLayout.SOUTH);
		
		JPanel northPanel=new JPanel();
		northPanel.setLayout(new GridLayout(1,2));
		JButton btnNorth=new JButton("North1");
		northPanel.add(btnNorth);
		JButton btnNorth2=new JButton("North2");
		northPanel.add(btnNorth2);
		frame.add(northPanel,BorderLayout.NORTH);
		
		frame.setLocation(200, 200);
		frame.setSize(200, 200);
		frame.setVisible(true);
		
	}

}
