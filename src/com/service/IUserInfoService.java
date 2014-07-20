package com.service;

import java.util.List;

import com.dao.IUserInfoDAO;
import com.store.user.UserInfo;

public interface IUserInfoService {

	public abstract IUserInfoDAO getUserInfoDAO();

	public abstract void addUser(UserInfo user);

	public abstract UserInfo getUserById(java.lang.Integer id);

	public abstract UserInfo findByUsername(Object username);

	public abstract UserInfo findByPhone(Object phone);

	public abstract UserInfo findByAddress(Object address);

	public abstract UserInfo findByPostcard(Object postcard);

	public abstract UserInfo findByName(Object name);

	public abstract UserInfo findByEmail(Object email);
	
	public abstract List findAll();
	
	public abstract void delete(UserInfo user);
	
	public abstract void update(UserInfo user);

}