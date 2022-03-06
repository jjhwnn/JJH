package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField strNum1;
	private JTextField strNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("Button Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				showMessage();
			}
		});
		btnNewButton.setBounds(172, 158, 117, 29);
		contentPane.add(btnNewButton);
		
		strNum1 = new JTextField();
		strNum1.setText("2");
		strNum1.setBounds(68, 60, 130, 26);
		contentPane.add(strNum1);
		strNum1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(160, 112, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(161, 204, 128, 23);
		contentPane.add(chckbxNewCheckBox);
		
		strNum2 = new JTextField();
		strNum2.setText("3");
		strNum2.setColumns(10);
		strNum2.setBounds(229, 60, 130, 26);
		contentPane.add(strNum2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(37, 6, 85, 16);
		contentPane.add(lblNewLabel);
		
		
	}
	
	public void showMessage() {
		// text필드에 값을 각각 넣어준 후, parse메소드로 String 을 int로 바꿔줌
		//String str = strNum1.getText();
		String str = Integer.toString(Integer.parseInt(strNum1.getText()) + Integer.parseInt(strNum2.getText()));
		
		// ok박스 커서 대고 오른쪽 - > event handler -> action ->
		JOptionPane.showMessageDialog(null, str);
		
		
	}
}
