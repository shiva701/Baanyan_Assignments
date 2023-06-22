package com.baanyan.pms.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * The Class Product.
 */
@Entity
@Table(name = "product")
public class Product {

	/** The product id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;

	/** The product name. */
	@Column(name = "ProductName")
	String pname;

	/** The quantity. */
	@Column(name = "Quantity")
	int qty;

	/** The price. */
	@Column(name = "Price")
	int price;

	/** The date. */
	@Column(name = "Date")
	Date date;

	/**
	 * Gets the pid.
	 *
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * Sets the pid.
	 *
	 * @param pid the new pid
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

	/**
	 * Gets the pname.
	 *
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * Sets the pname.
	 *
	 * @param pname the new pname
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * Gets the qty.
	 *
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}

	/**
	 * Sets the qty.
	 *
	 * @param qty the new qty
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Instantiates a new product.
	 *
	 * @param pid   the pid
	 * @param pname the pname
	 * @param qty   the qty
	 * @param price the price
	 * @param date  the date
	 */
	public Product(int pid, String pname, int qty, int price, Date date) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.date = date;
	}

	/**
	 * Instantiates a new product.
	 */
	public Product() {
		super();
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", date=" + date
				+ "]";
	}

}
