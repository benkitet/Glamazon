package de.glamazon.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;

public class NavigationPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JTextField Suchfeld;

	public NavigationPanel() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{85, 260, 0, 0};
		gridBagLayout.rowHeights = new int[] {60};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0};
		this.setLayout(gridBagLayout);
		
		JButton btnGlamazonLogo = new JButton(new ImageIcon("./assets/pictures/glamazon.jpg"));
		GridBagConstraints gbc_btnGlamazonLogo = new GridBagConstraints();
		gbc_btnGlamazonLogo.insets = new Insets(0, 0, 0, 5);
		gbc_btnGlamazonLogo.anchor = GridBagConstraints.WEST;
		gbc_btnGlamazonLogo.fill = GridBagConstraints.VERTICAL;
		gbc_btnGlamazonLogo.gridx = 0;
		gbc_btnGlamazonLogo.gridy = 0;
		this.add(btnGlamazonLogo, gbc_btnGlamazonLogo);
		
		Suchfeld = new JTextField();
		GridBagConstraints gbc_Suchfeld = new GridBagConstraints();
		gbc_Suchfeld.fill = GridBagConstraints.HORIZONTAL;
		gbc_Suchfeld.insets = new Insets(0, 0, 5, 5);
		gbc_Suchfeld.gridx = 1;
		gbc_Suchfeld.gridy = 0;
		this.add(Suchfeld, gbc_Suchfeld);
		Suchfeld.setColumns(10);
		
		JButton Suchbutton = new JButton("Suchen");
		Suchbutton.setForeground(Color.WHITE);
		Suchbutton.setBackground(Color.ORANGE);
		Suchbutton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_Suchbutton = new GridBagConstraints();
		gbc_Suchbutton.anchor = GridBagConstraints.WEST;
		gbc_Suchbutton.fill = GridBagConstraints.VERTICAL;
		gbc_Suchbutton.insets = new Insets(0, 0, 5, 5);
		gbc_Suchbutton.gridx = 2;
		this.add(Suchbutton, gbc_Suchbutton);
	
		JButton Warenkorbbutton = new JButton("Warenkorb");
		GridBagConstraints gbc_Warenkorbbutton = new GridBagConstraints();
		gbc_Warenkorbbutton.fill = GridBagConstraints.BOTH;
		gbc_Warenkorbbutton.insets = new Insets(0, 0, 5, 0);
		gbc_Warenkorbbutton.gridx = 3;
		gbc_Warenkorbbutton.gridy = 0;
		this.add(Warenkorbbutton, gbc_Warenkorbbutton);
		
		JToolBar kategorien = new JToolBar();
		GridBagConstraints gbc_kategorien = new GridBagConstraints();
		gbc_kategorien.fill = GridBagConstraints.BOTH;
		gbc_kategorien.gridwidth = 4;
		gbc_kategorien.gridx = 0;
		gbc_kategorien.gridy = 1;
		this.add(kategorien, gbc_kategorien);

		JButton btnNewButton_2 = new JButton("Menü");
		kategorien.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Bücher");
		kategorien.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Filme");
		kategorien.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Computer");
		kategorien.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Sport");
		kategorien.add(btnNewButton_6);
		
	}
}
