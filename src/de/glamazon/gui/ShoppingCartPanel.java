package de.glamazon.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShoppingCartPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JTextField productName;
	private JTextField price;
	
	public ShoppingCartPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
//ShoppingCartPanel
		JLabel PanelName = new JLabel();
		PanelName.setText("Warenkorb");
		PanelName.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(PanelName, BorderLayout.PAGE_START);
		
		JLabel picture = new JLabel(new ImageIcon("./assets/pictures/buch.jpg"));
		picture.setText("picture");
		picture.setForeground(Color.ORANGE);
		picture.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel.add(picture, BorderLayout.WEST);
		
		productName = new JTextField();
		productName.setText("productName");
		panel.add(productName, BorderLayout.CENTER);
		productName.setColumns(10);
		
		price = new JTextField();
		price.setText("price");
		panel.add(price, BorderLayout.EAST);
		price.setColumns(10);

// Leider kein Platz im BorderLayout:
//		JButton btnDelete = new JButton("entfernen");
//		btnDelete.setForeground(Color.WHITE);
//		btnDelete.setBackground(Color.RED);
//		panel.add(btnDelete, BorderLayout.LINE_END);
		
//Globale Navigation	
		JButton btnZurKasse = new JButton("Zur Kasse");
		btnZurKasse.setForeground(Color.WHITE);
		btnZurKasse.setBackground(Color.LIGHT_GRAY);
		panel.add(btnZurKasse, BorderLayout.EAST);
		
		JButton btnWeiterEinkaufen = new JButton("Weiter einkaufen");
		btnWeiterEinkaufen.setForeground(Color.WHITE);
		btnWeiterEinkaufen.setBackground(Color.LIGHT_GRAY);
		panel.add(btnWeiterEinkaufen, BorderLayout.PAGE_END);
	}
}
