package com.service;

import com.dao.IManagerInfoDAO;
import com.store.manager.ManagerInfo;

public interface IManagerInfoService {

	public abstract IManagerInfoDAO getManagerInfoDAO();

	public abstract void addManager(ManagerInfo manager);

	public abstract ManagerInfo getUserById(java.lang.Integer id);

	public abstract ManagerInfo getManagerByName(String username);

}