/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62852
 */
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import GUI.Summa;
public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField unameField;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel PasswordMismatch = new JLabel("");
		PasswordMismatch.setBounds(379, 142, 140, 14);
		contentPane.add(PasswordMismatch);
		
		JLabel lblSignUpHere = new JLabel("Sign Up Here !");
		lblSignUpHere.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSignUpHere.setBounds(178, 22, 140, 22);
		contentPane.add(lblSignUpHere);
		
		JLabel lblNewLabel = new JLabel("Enter Username:");
		lblNewLabel.setBounds(65, 69, 116, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterPassword = new JLabel("Enter Password:");
		lblEnterPassword.setBounds(65, 105, 116, 14);
		contentPane.add(lblEnterPassword);
		
		JLabel lblEnterEmail = new JLabel("Enter Email :");
		lblEnterEmail.setBounds(65, 167, 116, 22);
		contentPane.add(lblEnterEmail);
		
		unameField = new JTextField();
		unameField.setBounds(204, 66, 165, 20);
		contentPane.add(unameField);
		unameField.setColumns(10);
		
		emailField = new JTextField();
		emailField.setBounds(204, 168, 165, 20);
		contentPane.add(emailField);
		emailField.setColumns(10);
		
		JButton btnSignUp = new JButton("  Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p1 = passwordField.getText();
				
				String p2 = passwordField_1.getText();
				
				
				
				if (p1.equals(p2))
				{
					//if logged in 
					JOptionPane.showMessageDialog(frame, "Your account has been created!");
					//creatign object
					HomePage homepage = new HomePage();
					userAddition();
					 homepage.setVisible(true);
					 dispose();
					
					
				
					
				}
				else
				{
					//if log in fails
					//JOptionPane.showMessageDialog(frame, "Passwords dont match");
					 
					PasswordMismatch.setText("Passwords Mismatch!");
				
					
				passwordField.setText("");
				passwordField_1.setText("");
				}
				
				
				
				
			}

			private void userAddition() {
				// TODO Auto-generated method stub
				
				String password1 = passwordField.getText();
				String email1=emailField.getText();
				String username1=unameField.getText();
			}
		});
		btnSignUp.setBounds(178, 239, 89, 23);
		contentPane.add(btnSignUp);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(204, 102, 165, 20);
		contentPane.add(passwordField);
		
		JLabel lblReenterPassword = new JLabel("ReEnter Password:");
		lblReenterPassword.setBounds(65, 142, 116, 14);
		contentPane.add(lblReenterPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(204, 137, 165, 20);
		contentPane.add(passwordField_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(298, 239, 89, 23);
		contentPane.add(btnCancel);
		
	}

}
