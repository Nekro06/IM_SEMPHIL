package com.semphil.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MainUI extends JFrame {

	private JPanel jpnlContentPane;

	public MainUI() {
		setTitle("SEMPHIL AGREEMENT SYSTEM");
		setMinimumSize(new Dimension(1300, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		jpnlContentPane = new JPanel();
		jpnlContentPane.setBorder(null);
		setContentPane(jpnlContentPane);
		jpnlContentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel jpnlSidebar = new JPanel();
		jpnlSidebar.setBackground(new Color(72, 61, 139));
		jpnlSidebar.setPreferredSize(new Dimension(230, 10));
		jpnlSidebar.setMinimumSize(new Dimension(230, 10));
		jpnlContentPane.add(jpnlSidebar, BorderLayout.WEST);
		jpnlSidebar.setLayout(new BoxLayout(jpnlSidebar, BoxLayout.Y_AXIS));
		
		JLabel lblHeader1 = new JLabel("<html> Samsung Electro Mechanics Philippines Corporation </html>");
		lblHeader1.setForeground(Color.WHITE);
		lblHeader1.setFont(new Font("Helvetica LT Std Cond", Font.ITALIC, 15));
		lblHeader1.setBorder(new EmptyBorder(10, 10, 5, 10));
		lblHeader1.setAlignmentY(0.0f);
		jpnlSidebar.add(lblHeader1);
		
		JLabel lblHeader2 = new JLabel("<html> VENDOR / CUSTOMER REGISTRATION AGREEMENT SYSTEM </html>");
		lblHeader2.setForeground(new Color(255, 215, 0));
		lblHeader2.setBorder(new EmptyBorder(0, 10, 20, 10));
		lblHeader2.setFont(new Font("Helvetica LT Std", Font.BOLD, 18));
		lblHeader2.setAlignmentY(0.0f);
		jpnlSidebar.add(lblHeader2);
		
		/*if(currentShownPanel != null && currentShownPanel != welcomePanel)
			remove(currentShownPanel);
		currentShownPanel = welcomePanel;
		getContentPane().add(welcomePanel, BorderLayout.CENTER);*/
		
		// JButton for Entity "Medical Staff" - when clicked, will display its Management Panel
		JButton btnStaffPanel = new JButton("MANAGEMENT PANEL");
		/*btnStaffPanel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(currentShownPanel != null && currentShownPanel != staffMgmtPanel)
					remove(currentShownPanel);
				currentShownPanel = staffMgmtPanel;
				getContentPane().add(staffMgmtPanel, BorderLayout.CENTER);
				revalidate();
				repaint();
			}
		});*/
		btnStaffPanel.setForeground(new Color(255, 255, 255));
		btnStaffPanel.setBackground(new Color(128, 0, 0));
		btnStaffPanel.setMinimumSize(new Dimension(75, 35));
		btnStaffPanel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnStaffPanel.setHorizontalAlignment(SwingConstants.LEFT);
		btnStaffPanel.setMaximumSize(new Dimension(32767, 35));
		btnStaffPanel.setBorderPainted(false);
		btnStaffPanel.setFocusPainted(false);
		jpnlSidebar.add(btnStaffPanel);
	}

}
