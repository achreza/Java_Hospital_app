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
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import GUI.Summa;
public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(183, 17, 134, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblPerformAnOperation = new JLabel("Profile page");
		lblPerformAnOperation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPerformAnOperation.setBounds(183, 53, 202, 25);
		contentPane.add(lblPerformAnOperation);
		
		JButton btnNewButton = new JButton("Update your Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UpdateFrame uf = new UpdateFrame();
				uf.setVisible(true);
				setEnabled(false);
			}
		});
		btnNewButton.setBounds(342, 286, 174, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete your account");
		btnNewButton_1.setBounds(342, 341, 174, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblYouCanDelete = new JLabel("You can delete your account by clicking here ->");
		lblYouCanDelete.setBounds(45, 345, 243, 14);
		contentPane.add(lblYouCanDelete);
		
		JLabel lblYouCanUpdate = new JLabel("You can update your details by clicking here->");
		lblYouCanUpdate.setBounds(45, 290, 273, 14);
		contentPane.add(lblYouCanUpdate);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(69, 125, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email id");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(69, 168, 99, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("User Id");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(69, 215, 99, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			dispose();
			}
			
		});
		btnLogout.setBounds(427, 0, 89, 23);
		contentPane.add(btnLogout);
		
		JLabel lblusername = new JLabel("*username*");
		lblusername.setBounds(192, 127, 216, 14);
		contentPane.add(lblusername);
		
		JLabel lblemail = new JLabel("*email*");
		lblemail.setBounds(192, 170, 284, 14);
		contentPane.add(lblemail);
		
		JLabel lbluserid = new JLabel("*userid*");
		lbluserid.setBounds(192, 217, 225, 14);
		contentPane.add(lbluserid);
		
		//Pass the values to these variables
		String username= "123";
		////String email ="ab@gmail.com";
		//String userid="123";
		
		lblusername.setText(username);
		
		lblemail.setText("email");		
		lbluserid.setText("userid");
		
		
	}

}
