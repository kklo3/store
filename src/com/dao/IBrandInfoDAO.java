package com.dao;

import java.util.List;

import com.store.brand.BrandInfo;

public interface IBrandInfoDAO {

	public abstract void save(BrandInfo transientInstance);

	public abstract void delete(BrandInfo persistentInstance);

	public abstract BrandInfo findById(java.lang.Integer id);

	public abstract List findByExample(BrandInfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByBrandName(Object brandName);

	public abstract List findByMemo(Object memo);

	public abstract List findAll();

}