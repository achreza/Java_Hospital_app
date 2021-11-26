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
import javax.swing.JTextField;
import javax.swing.JButton;

public class UpdateFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateFrame frame = new UpdateFrame();
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
	public UpdateFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUpdate = new JLabel("Update");
		lblUpdate.setBounds(171, 11, 46, 14);
		contentPane.add(lblUpdate);
		
		JLabel lblPassword = new JLabel("Change Password:");
		lblPassword.setBounds(41, 68, 148, 14);
		contentPane.add(lblPassword);
		
		JLabel lblNewLabel = new JLabel("Change Email:");
		lblNewLabel.setBounds(41, 106, 148, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(199, 65, 137, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 103, 137, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(151, 188, 89, 23);
		contentPane.add(btnUpdate);
		
		
	}

}
