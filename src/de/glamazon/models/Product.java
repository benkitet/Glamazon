package de.glamazon.models;

 import java.util.ArrayList;

public class Product {
	private int productItemID;
	private String productName;
	private String description;
	private int price;
	private String picture;
	private ArrayList<Category> categories;

// setter/getter
	private void setProductItemID(int productItemID) {
		this.productItemID = productItemID;
	}
	public int getProductItemID() {
		return this.productItemID;
	}
	
	private void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName() {
		return this.productName;
	}
	
	private void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return this.description;
	}
	
	private void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	
	private void setPicture(String picture) {
		this.picture = picture;
	}
	public String getPicture() {
		return this.picture;
	}
	
	public void setCategories(ArrayList<Category> categories) {
		this.categories = categories; 
	}
	public ArrayList<Category> getCategories() {
		return this.categories; 
	}

//Konstruktoren
	public Product(int productItemID, String productName, String description, int price, String picture) {
		this.setProductItemID(productItemID);
		this.setProductName(productName);
		this.setDescription(description);
		this.setPrice(price);
		this.setPicture(picture);
		this.setCategories(new ArrayList<Category>());
	}
	
	public Product() {
		this(0, "", "", 0, "");
	}
	
	@Override
	public String toString() {
		return "ProductItemID: " + this.getProductItemID() +
				", ProductName: " + this.getProductName() +
				", Description: " + this.getDescription() +
				", Price: " + this.getPrice() +
				", Picture " + this.getPicture();
	}
}
