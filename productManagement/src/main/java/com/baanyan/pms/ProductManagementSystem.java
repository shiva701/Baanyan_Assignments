package com.baanyan.pms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baanyan.pms.dao.ProductDAO;
import com.baanyan.pms.daoImpl.ProductDaoImpl;
import com.baanyan.pms.model.Product;

/**
 * The Class ProductManagementSystem.
 */
public class ProductManagementSystem {

	/** The log. */
	private static Logger log = LoggerFactory.getLogger(ProductManagementSystem.class);

	/** The product dao object for database operations. */
	static ProductDAO pdi = new ProductDaoImpl();

	/** The product variable for input from user. */
	static Product p;

	/** The date string. */
	static String dateString;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		log.info("****** The application starts here ******");

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("ddmmyy");

		System.out.println("\n\n ******** Welcome to the Product Management System ******** \n\n");
		while (true) {
			System.out.println("Please choose from the options below:\n");
			System.out.println("1. Add Product");
			System.out.println("2. View Product");
			System.out.println("3. Update Product");
			System.out.println("4. Delete Product");
			System.out.println("5. Exit");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("\n\n ***** Enter the product details to save: ***** \n");
				p = new Product();
				System.out.println("Enter the product name: ");
				p.setPname(sc.next());
				System.out.println("Enter the product price: ");
				p.setPrice(sc.nextInt());
				System.out.println("Enter the product quantity: ");
				p.setQty(sc.nextInt());
				System.out.println("Enter the product date in ddmmyy: ");
				dateString = sc.next();
				try {
					Date date = format.parse(dateString);
					p.setDate(date);
				} catch (Exception e) {
					System.out.println(">>>>>> Date format wrong: " + e);
				}
				pdi.addProduct(p);
				break;
			case 2:
				System.out.println("\n\n***** Enter the product ID to view: ***** \n");
				p = pdi.viewProduct(sc.nextInt());
				if (p == null) {
					System.out.println("\n >>>>>> Object does not exist. Please enter a correct ID \n");
				} else {
					System.out.println("\n\n ***** The product is: ***** \n" + p.toString() + " \n\n");
				}
				break;
			case 3:
				System.out.println("\n\n ***** Enter the new product details to update: ***** \n");
				p = new Product();
				System.out.println("Enter the product id: ");
				p.setPid(sc.nextInt());
				System.out.println("Enter the product name: ");
				p.setPname(sc.next());
				System.out.println("Enter the product price: ");
				p.setPrice(sc.nextInt());
				System.out.println("Enter the product quantity: ");
				p.setQty(sc.nextInt());
				System.out.println("Enter the product date in ddmmyy: ");
				dateString = sc.next();
				try {
					Date date = format.parse(dateString);
					p.setDate(date);
				} catch (Exception e) {
					System.out.println("\n\n >>>>>> Date format wrong: " + e);
				}
				pdi.updateProduct(p.getPid(), p);
				break;
			case 4:
				System.out.println(" \n\n ***** Enter the id to delete: ***** \n");
				int id = sc.nextInt();
				pdi.deleteProduct(id);
				break;
			case 5:
				sc.close();
				System.out.println("\n\n ***** Thank you for using our system!! *****");
				System.exit(1);
			default:
				System.out.println("\n\n>>>>>> Please select a valid option!!");
			}
		}

	}

}
