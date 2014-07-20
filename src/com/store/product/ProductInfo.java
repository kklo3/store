package com.store.product;

import java.math.BigDecimal;

/**
 * ProductInfo entity. @author MyEclipse Persistence Tools
 */
public class ProductInfo extends AbstractProductInfo implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ProductInfo() {
	}

	/** full constructor */
	public ProductInfo(Long price, String color, String productName,
			Integer brandId, Integer opId, Short gsmEdit, String memo) {
		super(price, color, productName, brandId, opId, gsmEdit, memo);
	}

}
