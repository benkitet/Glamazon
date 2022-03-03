package de.glamazon.models;

public class Category {
	private int categoryID;
	private String category;	//name
	private String description;
	
// getter/setter
	public int getCategoryID() {
		return this.categoryID;
	}
	private void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategory() {
		return this.category;
	}
	private void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return this.description;
	}
	private void setDescription(String description) {
		this.description = description;
	}
	
	
//Konstruktoren
	public Category() {
		this(0, "", "");
	}
	
	public Category(int CategoryID, String category, String description) {
		this.setCategoryID(categoryID);
		this.setCategory(category);
		this.setDescription(description);
	}
	
	
	
//alles wird in einen String geschrieben
	@Override
	public String toString() {
		return "CategoryID: " + this.getCategoryID() + 
			   ", Description: " + this.getDescription()+ 
			   ", Category: " + this.getCategory() ;
	}
	
}
