package com.store.brand;

/**
 * BrandInfo entity. @author MyEclipse Persistence Tools
 */
public class BrandInfo extends AbstractBrandInfo implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public BrandInfo() {
	}

	/** full constructor */
	public BrandInfo(String brandName, String memo) {
		super(brandName, memo);
	}

}
