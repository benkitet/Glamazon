package de.glamazon.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import de.glamazon.models.Category;
import de.glamazon.models.Product;

public final class ProductService extends Services {

	public Product addProduct(Product product) {
				
		try {
			if(super.dbm.insert(
					"Product",
					new String[] {"productName", "description", "price", "picture"},
// Was mache ich mit int price?? -> String.valueOf
					new String[] {product.getProductName(), product.getDescription(), String.valueOf(product.getPrice()), product.getPicture()}
					)) {
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return product;
	}
	
public Product addCategory(Product product, Category category) {
	try {
		super.dbm.insert(
			"Product_Category", 
			new String[] {"ProductItemID", "CategoryID"}, 
			new String[] {String.valueOf(product.getProductItemID()), String.valueOf(category.getCategoryID())}
		);
		
		product.getCategories().add(category);
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	return product;
}

public Product deleteCategory(Product product, Category category) {
	try {
		super.dbm.delete(
			"Product_Category", 
			new String[] {String.valueOf(product.getProductItemID()), String.valueOf(category.getCategoryID())}
		);
		product.getCategories().remove(category);
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	return product;
}

public boolean updateProduct(Product product) throws SQLException {
	return super.dbm.update(
			"Product",
			new String[] {"productName", "description", "price", "picture"},
			new String[] {product.getProductName(), product.getDescription(), String.valueOf(product.getPrice()), product.getPicture()},
			new String [] {"productItemID", "=", String.valueOf(product.getProductItemID())}
			);
}

public boolean deleteProduct(Product product) throws SQLException {
	return super.dbm.delete(
			"Product", 
			new String[] {"productItemID", "=", String.valueOf(product.getProductItemID())}
	);
}

public ArrayList<Product> getProducts() {
	ArrayList<Product> products = new ArrayList<Product>();
	
	try {
		ResultSet rs = super.dbm.select(
				"Product",
				new String[] {"productItemID", "productName", "description", "price", "picture"}, 
				null
		);
		
		if(!rs.next()) {
		} else {
			do {
				products.add(new Product(
						rs.getInt("productItemID"),
						rs.getString("productName"),
						rs.getString("description"),
						rs.getInt("price"),
						rs.getString("picture")
				));
//				CategoryService cs = new CategoryService();
//				p.setCategories(cs.getCategoriesByProduct(p));
				
		
				
			} while(rs.next());
		}
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	return products;
}

public ArrayList<Product> getProducts(Category category) {
	ArrayList<Product> products = new ArrayList<Product>();
	try {
		ResultSet rs = super.dbm.select(
			"Product_Category", 
			new String[] {"CategoryId", "ProductId"}, 
			new String[] {"CategoryId", "=", String.valueOf(category.getCategoryID())}
		);
		ProductService ps = new ProductService();
		
		while(rs.next()) {
			products.add((Product) ps.getProductById(rs.getInt("ProductItemID")));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return products;
}

//könnte man auch anders schreiben, z.B wie getProductByName
public ResultSet getProductById(int productItemID) throws SQLException {
	return super.dbm.select(
			"Product",
			new String[] {"productItemID", "productName", "description", "price", "picture"},
			new String[] {"productItemID", "=", "" +productItemID} 
	);
}

public Product getProductByName(String productName) {
	Product product = new Product();
	
	try {
		ResultSet rs = super.dbm.select(
				"Product",
				new String[] {"productItemID", "productName", "description", "price", "picture"},
				new String[] {"productName", "=", productName} 
		);
		
		if(!rs.next()) {
		} else {
			do {
				product = new Product(
						rs.getInt("productItemID"), 
						rs.getString("productName"), 
						rs.getString("description"), 
						rs.getInt("price"), 
						rs.getString("picture"));
			} while(rs.next());
		}
	} catch(SQLException e) {
		System.out.println(e.getMessage());
	}
	
	return product;
}
}