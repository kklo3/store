package com.service.impl;

import java.util.List;

import com.dao.IBrandInfoDAO;
import com.service.IBrandInfoService;
import com.store.brand.BrandInfo;

public class BrandInfoService implements IBrandInfoService{
	private IBrandInfoDAO BrandInfoDAO;

	public IBrandInfoDAO getBrandInfoDAO() {
		return BrandInfoDAO;
	}

	public void setBrandInfoDAO(IBrandInfoDAO BrandInfoDAO) {
		this.BrandInfoDAO = BrandInfoDAO;
	}
	
	public void addBrand(BrandInfo Brand){
		BrandInfoDAO.save(Brand);
	}
	
	public BrandInfo getBrandInfoById(java.lang.Integer id){
		return BrandInfoDAO.findById(id);
	}
	
	public BrandInfo getBrandByName(String username){
		List list = BrandInfoDAO.findByBrandName(username);
		if(list.size()==0){
			return null;
		}else{
			return (BrandInfo) list.get(0);
		}
	}
	
	public void deleteBrandInfoById(java.lang.Integer id){
		BrandInfoDAO.delete(BrandInfoDAO.findById(id));
	}

	public List findAll() {
		return BrandInfoDAO.findAll();
	}
}