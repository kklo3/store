package com.service;

import java.util.List;

import com.dao.IBrandInfoDAO;
import com.store.brand.BrandInfo;

public interface IBrandInfoService {

	public abstract IBrandInfoDAO getBrandInfoDAO();
	
	public abstract List findAll();

	public abstract void addBrand(BrandInfo Brand);

	public abstract BrandInfo getBrandInfoById(java.lang.Integer id);

	public abstract BrandInfo getBrandByName(String BrandName);

	public abstract void deleteBrandInfoById(java.lang.Integer id);
}