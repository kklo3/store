package com.store.order;

/**
 * OrderInfo entity. @author MyEclipse Persistence Tools
 */
public class OrderInfo extends AbstractOrderInfo implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public OrderInfo() {
	}

	/** full constructor */
	public OrderInfo(Integer productId, String doneDate, Integer userId, Integer quantity) {
		super(productId, doneDate, userId, quantity);
	}

}
