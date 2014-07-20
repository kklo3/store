package com.dao;

import java.util.List;

import com.store.product.ProductInfo;

public interface IProductInfoDAO {

	public static final String PRODUCT_NAME = "productName";

	public abstract void save(ProductInfo transientInstance);

	public abstract void delete(ProductInfo persistentInstance);

	public abstract ProductInfo findById(java.lang.Integer id);

	public abstract List findByExample(ProductInfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByPrice(Object price);

	public abstract List findByColor(Object color);

	public abstract List findByProductName(Object productName);

	public abstract List findByBrandId(Object brandId);

	public abstract List findByOpId(Object opId);

	public abstract List findByGsmEdit(Object gsmEdit);

	public abstract List findByMemo(Object memo);

	public abstract List findAll();

	public abstract ProductInfo merge(ProductInfo detachedInstance);

	public abstract void attachDirty(ProductInfo instance);

	public abstract void attachClean(ProductInfo instance);

}