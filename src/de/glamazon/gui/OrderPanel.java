package de.glamazon.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class OrderPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField Versanddaten;

	public OrderPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnBackToShoppingCart = new JButton("Zurück zum Warenkorb");
		btnBackToShoppingCart.setForeground(Color.WHITE);
		btnBackToShoppingCart.setBackground(Color.LIGHT_GRAY);
		panel.add(btnBackToShoppingCart, BorderLayout.SOUTH);
		
		JButton btnOrderNow = new JButton("Jetzt Bestellen");
		btnOrderNow.setForeground(Color.WHITE);
		btnOrderNow.setBackground(Color.LIGHT_GRAY);
		panel.add(btnOrderNow, BorderLayout.EAST);
		
		Versanddaten = new JTextField();
		Versanddaten.setText("Hier Ihre Versanddaten eingeben:");
		Versanddaten.setToolTipText("Versanddaten genau hier eingeben");
		panel.add(Versanddaten, BorderLayout.CENTER);
		Versanddaten.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Versanddaten eingeben:");
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel OrderList = new JLabel("Zusammenfassung des \r\nbestellten Krempels \r\n(Bestelliste)");
		panel.add(OrderList, BorderLayout.WEST);
		
		
		
	}

}
