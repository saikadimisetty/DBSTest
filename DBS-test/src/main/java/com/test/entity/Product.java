package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	private String productId;
	private String productName;
	private String userName;
	private String emailId;

	public Product() {

	}

	public Product(String productId, String productName, String userName, String emailId) {

		this.productId = productId;
		this.productName = productName;
		this.emailId = emailId;
	}

	@Id
	public String getId() {

		return productId;
	}

	public String getproductName() {
		return productName;
	}

	public void setproductNameName(String firstName) {
		this.productName = firstName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setProductId(String id) {
		this.productId = id;
	}

}
