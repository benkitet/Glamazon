package de.glamazon.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import de.glamazon.models.Category;
import de.glamazon.models.Product;

public final class CategoryService extends Services{

public Category addCategory(Category category) {
	
	try {
		if(super.dbm.insert(
				"Category",
				new String[] {"category", "description"},
				new String[] {category.getCategory(), category.getDescription()}
			)) {
		category = this.getCategoryByName(category.getCategory());
		}
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	return category;
}

public void addProduct(Product product, Category category) {
	try {
		super.dbm.insert(
			"Product_Category", 
			new String[] {"ProductItemID", "CategoryID"}, 
			new String[] {String.valueOf(product.getProductItemID()), String.valueOf(category.getCategoryID())}
		);
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
}

public void deleteProduct(Product product, Category category) {
	try {
		super.dbm.delete(
			"Product_Category", 
			new String[] {String.valueOf(product.getProductItemID()), String.valueOf(category.getCategoryID())}
		);
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
}

public boolean updateCategory(Category category) throws SQLException {
	try {
			return super.dbm.update(
			"Category", 
			new String[] {"category", "description"},
			new String[] {category.getCategory(), category.getDescription()},
			new String[] {"categoryID", "=", String.valueOf(category.getCategoryID())}
			);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
}
	
public boolean deleteCategory(Category category) throws SQLException {
	try {
		return super.dbm.delete(
			"Category", 
			new String[] {"categoryID", "=", String.valueOf(category.getCategoryID())}
			);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
}	

public ArrayList<Category> getCategories() {
	ArrayList<Category> category = new ArrayList<Category>();
	
	try {
		ResultSet rs = super.dbm.select(
				"Category",
				new String[] {"categoryID", "category", "description"}, 
				null
		);
		
		if(!rs.next()) {
		} else {
			do {
				category.add(
						new Category(
								rs.getInt("categoryID"),
								rs.getString("category"),
								rs.getString("description")
								)
						);
			} while (rs.next());
		}
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	return category;
}

public ResultSet getCategoryById(int categoryID) throws SQLException {
	return super.dbm.select(
			"Category",
			new String[] {"categoryID", "category", "description"},
			new String[] {"categoryID", "=", "" + String.valueOf(categoryID)}
			);
}

public Category getCategoryByName(String category) {
	Category cat = new Category();
	try {
		ResultSet rs = super.dbm.select(
				"Category",
				new String[] {"CategoryID", "category", "description"},
				new String[] {"category", "=", category}
		);
		if(!rs.next()) {
		} else {
			do {
				cat = new Category(
						rs.getInt("categoryID"), 
						rs.getString("category"),
						rs.getString("description")
					);
			} while(rs.next());
		}
	} catch(SQLException e) {
		System.out.println(e.getMessage());
	}
	return cat;
}

public ArrayList<Category> getCategoryByProduct(Product product) {
	ArrayList<Category> categories = new ArrayList<Category>();
	
	try {
		ResultSet rs = super.dbm.select(
			"Product_Category",
			new String[] {"ProductId", "CategoryId"},
			new String[] {"ProductId", "=", String.valueOf(product.getProductItemID())} 
		);
		
		if(!rs.next()) {
		} else {
			do {
				categories.add((Category) this.getCategoryById(rs.getInt("CategoryId")));
			} while(rs.next());
		}
	} catch(SQLException e) {
		System.out.println(e.getMessage());
	}
		
	return categories;
}
}