/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62852
 */
import java.awt.EventQueue;
import GUI.Summa;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Welcome extends JFrame {

	private JFrame frame;
	private JTextField IDENTITY_ID;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome !");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWelcome.setBounds(199, 11, 107, 20);
		frame.getContentPane().add(lblWelcome);
		
		JLabel lblNewLabel = new JLabel("User ID   :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(79, 56, 92, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(79, 107, 92, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		IDENTITY_ID = new JTextField();
		IDENTITY_ID.setBounds(181, 68, 163, 20);
		frame.getContentPane().add(IDENTITY_ID);
		IDENTITY_ID.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			String ID = IDENTITY_ID.getText();
			
			String psd = password.getText();
			//set as username value
			String uname="name";
			//pass the username password value
			String pass = "password";
			
			if (ID.equals(uname) && psd.equals(pass))
			{
				//if logged in 
				JOptionPane.showMessageDialog(frame, "you are logged in");
				//creatign object
				HomePage homepage = new HomePage();
			
				 homepage.setVisible(true);
				 //dispose();
				
				
			
				
			}
			else
			{
				//if log in fails
				JOptionPane.showMessageDialog(frame, "Username or Password is Invalid. Try Again..");
			}
			
			}
			
			
		});
		
		
		
		btnNewButton.setBounds(134, 184, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SignUp su = new SignUp();
				su.setVisible(true);
			}
		});
		btnSignUp.setBounds(254, 184, 89, 23);
		frame.getContentPane().add(btnSignUp);
		
		JLabel lblLoginIfAlready = new JLabel("Login if already a member! Sign up if new user");
		lblLoginIfAlready.setBounds(134, 159, 298, 14);
		frame.getContentPane().add(lblLoginIfAlready);
		
		password = new JPasswordField();
		password.setBounds(181, 115, 163, 20);
		frame.getContentPane().add(password);
	}

	
}
