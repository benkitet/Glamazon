package de.glamazon.gui;

public class MainWindowController {
	private MainWindowModel model;
	private MainWindowView view;
	
	public MainWindowModel getModel() {	return model; }
	public void setModel(MainWindowModel model) { this.model = model; }
	
	public MainWindowView getView() { return view; }
	public void setView(MainWindowView view) { this.view = view; }
	
	public MainWindowController(MainWindowModel model, MainWindowView view) {
		this.setModel(model);
		this.setView(view);

		System.out.println("Controller wird gestartet");		
	}
}
