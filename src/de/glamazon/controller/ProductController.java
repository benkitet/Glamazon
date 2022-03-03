package de.glamazon.controller;

import java.util.ArrayList;

import de.glamazon.models.Product;
import de.glamazon.models.Product_Category;
import de.glamazon.services.ProductService;

public class ProductController {
	public static void main(String[] args) {
		
// Product Abfrage Hinzufügen
//	ProductService ps = new ProductService();
//	Product pro = ps.addProduct(new Product(0, "Smartwatch", "tolle smarte Uhr", 150, "Bild1"));
//	
//	System.out.println(pro);
//	System.out.println("--------------------------");
//	ArrayList<Product> products = ps.getProducts();
//
//		for(Product p : products) {
//			System.out.println(p);
//			}
//	}		
//}

//Product Abfrage Category Hinzufügen
	ProductService ps = new ProductService();
	Product pro = ps.addCategory(1, 2);
	
	System.out.println(pro);
	System.out.println("--------------------------");
	ArrayList<Product> products = ps.getProducts();

		for(Product p : products) {
			System.out.println(p);
			}
	}		
}
