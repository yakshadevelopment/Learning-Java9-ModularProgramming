package loops;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{
	
	JLabel lblUserName,lblPassword;
	JTextField txtUserName,txtPassword;
	JButton btnSubmit,btnReset;
	
	public LoginFrame()
	{
		lblUserName=new JLabel("UserName");
		lblPassword=new JLabel("Password");
		txtUserName=new JTextField();
		txtPassword=new JPasswordField();		
		btnSubmit=new JButton("Submit");
		btnReset=new JButton("Reset");
		setLayout(new GridLayout(3,2));
		add(lblUserName);
		add(txtUserName);
		add(lblPassword);
		add(txtPassword);
		add(btnSubmit);
		add(btnReset);
		
	
		
		
		
		btnSubmit.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {//Call Back Methd
				// TODO Auto-generated method stub
				
				String userName=txtUserName.getText();
				String psssword=txtPassword.getText();
				if(userName.isEmpty() ||  psssword.isEmpty())
				{
					JOptionPane.showMessageDialog(LoginFrame.this, "Please Enter Username And Password");
				}
				else if(userName.equals("admin") && psssword.equals("admin123"))
				{
					System.out.println("Valid User");
				}
				else
				{
					System.out.println("InValid User");
				}
				
			}
		});
		
		
		btnReset.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {//Call Back Methd
				// TODO Auto-generated method stub
				System.out.println("Reset Button Clicked");
				
			}
		});
		
		
		
		
	}
	
	public static void main(String args[])
	{
		LoginFrame frame=new LoginFrame();
		frame.setLocation(200, 200);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

}
