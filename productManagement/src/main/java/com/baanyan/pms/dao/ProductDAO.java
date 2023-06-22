package com.baanyan.pms.dao;

import com.baanyan.pms.model.Product;

/**
 * The Interface ProductDAO.
 */
public interface ProductDAO {

	/**
	 * Adds the product.
	 *
	 * @param product the product
	 */
	void addProduct(Product product);

	/**
	 * View product.
	 *
	 * @param id the id
	 * @return the product
	 */
	Product viewProduct(int id);

	/**
	 * Update product.
	 *
	 * @param product the product
	 */
	void updateProduct(int id, Product p);

	/**
	 * Delete product.
	 *
	 * @param id the id
	 */
	void deleteProduct(int id);

}
