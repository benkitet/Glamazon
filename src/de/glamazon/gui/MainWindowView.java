package de.glamazon.gui;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class MainWindowView extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
//	public void startGui() {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainWindowView window = new MainWindowView();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	/**
	 * Create the application.
	 */
	public MainWindowView() {
		initialize();
		System.out.println("MainWindowView wird gestartet");		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		setTitle("Glamazon");
		this.setBounds(100, 100, 1200, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new MainPanel());
		this.setVisible(true);
		
	}
}
