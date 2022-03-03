package de.glamazon.models;

public class Product_Category {
	private int productItemID;
	private int categoryID;

// getter / setter
	public int getProductItemID() {
		return productItemID;
	}
	public void setProductItemID(int productItemID) {
		this.productItemID = productItemID;
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

// Konstruktoren

	public Product_Category(int productItemID, int categoryID) {
		this.setProductItemID(productItemID);
		this.setCategoryID(categoryID);
	}
	public Product_Category() {
		this(0,0);
	}
}