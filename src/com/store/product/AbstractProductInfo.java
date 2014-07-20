package com.store.product;

/**
 * AbstractProductInfo entity provides the base persistence definition of the
 * ProductInfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProductInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Long price;
	private String color;
	private String productName;
	private Integer brandId;
	private Integer opId;
	private Short gsmEdit;
	private String memo;

	// Constructors

	/** default constructor */
	public AbstractProductInfo() {
	}

	/** full constructor */
	public AbstractProductInfo(Long price, String color, String productName,
			Integer brandId, Integer opId, Short gsmEdit, String memo) {
		this.price = price;
		this.color = color;
		this.productName = productName;
		this.brandId = brandId;
		this.opId = opId;
		this.gsmEdit = gsmEdit;
		this.memo = memo;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getPrice() {
		return this.price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getOpId() {
		return this.opId;
	}

	public void setOpId(Integer opId) {
		this.opId = opId;
	}

	public Short getGsmEdit() {
		return this.gsmEdit;
	}

	public void setGsmEdit(Short gsmEdit) {
		this.gsmEdit = gsmEdit;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}