package de.glamazon.gui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ProductsPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private JTextField txtSuchergebnisse;
	private JTextField productName;
	private JTextField price;
	
	public ProductsPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		txtSuchergebnisse = new JTextField();
		txtSuchergebnisse.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtSuchergebnisse.setText("Suchergebnisse");
		panel.add(txtSuchergebnisse, BorderLayout.NORTH);
		txtSuchergebnisse.setColumns(10);
// Product
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
		
		JButton btnAddToShoppingCart = new JButton("Add to Shoppingcart");
		panel.add(btnAddToShoppingCart, BorderLayout.SOUTH);
		
	}

}
