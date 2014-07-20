package com.store.order;

/**
 * AbstractOrderInfo entity provides the base persistence definition of the
 * OrderInfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrderInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer productId;
	private String doneDate;
	private Integer userId;
	private Integer quantity;

	// Constructors

	/** default constructor */
	public AbstractOrderInfo() {
	}

	/** full constructor */
	public AbstractOrderInfo(Integer productId, String doneDate,
			Integer userId, Integer quantity) {
		this.productId = productId;
		this.doneDate = doneDate;
		this.userId = userId;
		this.quantity = quantity;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getDoneDate() {
		return this.doneDate;
	}

	public void setDoneDate(String doneDate) {
		this.doneDate = doneDate;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}