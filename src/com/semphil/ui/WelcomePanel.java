package com.semphil.ui;

/*
 *	Name of Class: WelcomePanel.java
 *		This serves as the panel when the system starts to run.
 *		It contains the "Welcome to the UCMS" message. 
 */

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class WelcomePanel extends JPanel {

	public WelcomePanel() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel pnlWelcomeMessage = new JPanel();
		add(pnlWelcomeMessage);
		GridBagLayout gbl_pnlWelcomeMessage = new GridBagLayout();
		gbl_pnlWelcomeMessage.columnWidths = new int[]{0, 0};
		gbl_pnlWelcomeMessage.rowHeights = new int[]{234, 0, 0, 0};
		gbl_pnlWelcomeMessage.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pnlWelcomeMessage.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlWelcomeMessage.setLayout(gbl_pnlWelcomeMessage);
		
		JLabel lblHeader1 = new JLabel("Welcome to the SEMPHIL Registration Agreement System!");
		lblHeader1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblHeader1.setFont(new Font("Helvetica LT Std", Font.PLAIN, 38));
		GridBagConstraints gbc_lblHeader1 = new GridBagConstraints();
		gbc_lblHeader1.anchor = GridBagConstraints.SOUTH;
		gbc_lblHeader1.insets = new Insets(0, 0, 5, 0);
		gbc_lblHeader1.gridx = 0;
		gbc_lblHeader1.gridy = 0;
		pnlWelcomeMessage.add(lblHeader1, gbc_lblHeader1);
		
		JLabel lblHeader2 = new JLabel("Proceed at the side panel to start");
		lblHeader2.setForeground(Color.GRAY);
		lblHeader2.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 22));
		GridBagConstraints gbc_lblHeader2 = new GridBagConstraints();
		gbc_lblHeader2.insets = new Insets(0, 0, 5, 0);
		gbc_lblHeader2.gridx = 0;
		gbc_lblHeader2.gridy = 1;
		pnlWelcomeMessage.add(lblHeader2, gbc_lblHeader2);
		
		JLabel lblHeader3 = new JLabel("ALL RIGHTS RESERVED 2021 (C)");
		lblHeader3.setForeground(Color.GRAY);
		lblHeader3.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblHeader3 = new GridBagConstraints();
		gbc_lblHeader3.gridx = 0;
		gbc_lblHeader3.gridy = 2;
		pnlWelcomeMessage.add(lblHeader3, gbc_lblHeader3);

	}

}
