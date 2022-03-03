package de.glamazon.gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel{
	private static final long serialVersionUID = 1L;

	private JPanel pnlNorth;
	private JPanel pnlCenter;
	
	public MainPanel() {
		this.setLayout(new BorderLayout());
		
		pnlNorth = new NavigationPanel();
		this.add(pnlNorth, BorderLayout.NORTH);
		
//		pnlCenter = new ProductsPanel();
//		this.add(pnlCenter, BorderLayout.CENTER);
		
//		pnlCenter = new ShoppingCartPanel();
//		this.add(pnlCenter, BorderLayout.CENTER);
		
		pnlCenter = new OrderPanel();
		this.add(pnlCenter, BorderLayout.CENTER);

	
	}
}
