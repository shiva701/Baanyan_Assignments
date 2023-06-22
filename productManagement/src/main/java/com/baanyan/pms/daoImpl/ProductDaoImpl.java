package com.baanyan.pms.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baanyan.pms.dao.ProductDAO;
import com.baanyan.pms.model.Product;
import com.baanyan.pms.utils.SessionUtil;

/**
 * The Class ProductDaoImpl.
 */
public class ProductDaoImpl implements ProductDAO {

	/** The log. */
	private static Logger log = LoggerFactory.getLogger(ProductDaoImpl.class);

	/** The session. */
	static Session session = null;

	/** The transaction. */
	static Transaction tran = null;

	/**
	 * Instantiates a new product dao impl.
	 */
	public ProductDaoImpl() {
	}

	/**
	 * Adds the product.
	 *
	 * @param product the product
	 */
	@Override
	public void addProduct(Product product) {
		log.info("\n\n ***** Adding the product: ***** \n" + product);
		try {
			session = SessionUtil.getSession();
			tran = session.beginTransaction();
			session.persist(product);
			tran.commit();
		} catch (Exception e) {
			log.info("\n\n >>>>>> Cannot add the product: " + product + " because: " + e);
			tran.rollback();
		} finally {
			session.close();
		}
	}

	/**
	 * View product.
	 *
	 * @param id the id
	 * @return the product
	 */
	@Override
	public Product viewProduct(int id) {
		log.info("\n\n ***** Retrieve the product with id: ***** \n" + id);
		Product p = null;
		try {
			session = SessionUtil.getSession();
			p = session.get(Product.class, id);
			if (p == null) {
				throw new NullPointerException();
			}
		} catch (Exception e) {
			log.info("\n\n >>>>>> Object not found, id: " + id + " ,error: " + e);
		} finally {
			session.close();
		}
		return p;
	}

	/**
	 * Update product.
	 *
	 * @param product the product
	 */
	@Override
	public void updateProduct(int id, Product product) {
		log.info("\\n\\n ***** Updating the product: ***** \n" + product.toString());
		try {
			session = SessionUtil.getSession();
			tran = session.beginTransaction();
			session.merge(product);
			tran.commit();
		} catch (Exception e) {
			log.info("\n\n >>>>>> Cannot update the product: " + product + " because: " + e);
			tran.rollback();
		} finally {
			session.close();
		}
	}

	/**
	 * Delete product.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteProduct(int id) {
		log.info("\\n\\n ***** Delete the product with id: ***** \n" + id);
		try {
			session = SessionUtil.getSession();
			tran = session.beginTransaction();
			Product p = session.get(Product.class, id);
			session.remove(p);
			tran.commit();
		} catch (Exception e) {
			log.info("\n\n >>>>>> Cannot delete the product with id: " + id + " because: " + e);
			tran.rollback();
		} finally {
			session.close();
		}
	}

}
