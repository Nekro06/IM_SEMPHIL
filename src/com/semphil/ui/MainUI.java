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

import com.semphil.bean.*;
import com.semphil.repo.*;

public class MainUI extends JFrame {
	
	// Declaration of Objects
	private JPanel jpnlContentPane;
	private com.semphil.ui.InputMgmtPanel inputMgmtPanel;
	private com.semphil.ui.WelcomePanel welcomePanel = new WelcomePanel();
	private JPanel currentShownPanel;
	
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
		lblHeader1.setFont(new Font("Helvetica LT Std Cond", Font.ITALIC, 16));
		lblHeader1.setBorder(new EmptyBorder(10, 10, 5, 10));
		lblHeader1.setAlignmentY(0.0f);
		jpnlSidebar.add(lblHeader1);
		
		JLabel lblHeader2 = new JLabel("<html> VENDOR / CUSTOMER REGISTRATION AGREEMENT SYSTEM </html>");
		lblHeader2.setForeground(new Color(255, 215, 0));
		lblHeader2.setBorder(new EmptyBorder(0, 10, 20, 10));
		lblHeader2.setFont(new Font("Helvetica LT Std", Font.BOLD, 18));
		lblHeader2.setAlignmentY(0.0f);
		jpnlSidebar.add(lblHeader2);
		
		if(currentShownPanel != null && currentShownPanel != welcomePanel)
			remove(currentShownPanel);
		currentShownPanel = welcomePanel;
		getContentPane().add(welcomePanel, BorderLayout.CENTER);
		
		// JButton for the InputMgmtPanel when clicked, will display its Management Panel
		JButton btnMgmtPanel = new JButton("MANAGEMENT PANEL");
		btnMgmtPanel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(currentShownPanel != null && currentShownPanel != inputMgmtPanel)
					remove(currentShownPanel);
				currentShownPanel = inputMgmtPanel;
				getContentPane().add(inputMgmtPanel, BorderLayout.CENTER);
				revalidate();
				repaint();
			}
		});
		btnMgmtPanel.setForeground(new Color(255, 255, 255));
		btnMgmtPanel.setBackground(new Color(72, 61, 139));
		btnMgmtPanel.setMinimumSize(new Dimension(75, 35));
		btnMgmtPanel.setFont(new Font("Helvetica LT Std", Font.PLAIN, 15));
		btnMgmtPanel.setHorizontalAlignment(SwingConstants.LEFT);
		btnMgmtPanel.setMaximumSize(new Dimension(32767, 35));
		btnMgmtPanel.setBorderPainted(false);
		btnMgmtPanel.setFocusPainted(false);
		jpnlSidebar.add(btnMgmtPanel);
	}

	public void setInputMgmtPanel(com.semphil.ui.InputMgmtPanel inputMgmtPanel) {
		this.inputMgmtPanel = inputMgmtPanel;
	}
}
