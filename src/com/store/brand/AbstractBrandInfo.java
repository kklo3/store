package com.store.brand;

/**
 * AbstractBrandInfo entity provides the base persistence definition of the
 * BrandInfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBrandInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String brandName;
	private String memo;

	// Constructors

	/** default constructor */
	public AbstractBrandInfo() {
	}

	/** full constructor */
	public AbstractBrandInfo(String brandName, String memo) {
		this.brandName = brandName;
		this.memo = memo;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}