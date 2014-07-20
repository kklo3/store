package com.service;

import java.util.List;

import com.dao.IProductInfoDAO;
import com.store.product.ProductInfo;

public interface IProductInfoService {

	public abstract IProductInfoDAO getProductInfoDAO();
	
	public abstract List findAll();

	public abstract void addProduct(ProductInfo Product);

	public abstract ProductInfo getProductInfoById(java.lang.Integer id);

	public abstract ProductInfo getProductByName(String ProductName);

	public abstract List findByBrandId(Integer BrandId);

	public abstract List findByOpId(Integer OpId);

	public abstract List findByGsmEdit(Short GsmEdit);

	public abstract List findByColor(String color);
	
	public abstract void deleteProductById(Integer id);

}