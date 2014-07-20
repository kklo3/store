package com.dao;

import java.util.List;

import com.store.user.UserInfo;

public interface IUserInfoDAO {

	public abstract void save(UserInfo transientInstance);
	
	public abstract void delete(UserInfo persistentInstance);
	
	public abstract void attachDirty(UserInfo persistentInstance);

	public abstract UserInfo findById(java.lang.Integer id);

	public abstract List findByExample(UserInfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByUsername(Object username);

	public abstract List findByPassword(Object password);

	public abstract List findByPhone(Object phone);

	public abstract List findByAddress(Object address);

	public abstract List findByPostcard(Object postcard);

	public abstract List findByName(Object name);

	public abstract List findByEmail(Object email);

	public abstract List findAll();

}