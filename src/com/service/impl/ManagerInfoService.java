package com.service.impl;

import java.util.List;

import com.dao.IManagerInfoDAO;
import com.service.IManagerInfoService;
import com.store.manager.ManagerInfo;

public class ManagerInfoService implements IManagerInfoService{
	private IManagerInfoDAO ManagerInfoDAO;

	public IManagerInfoDAO getManagerInfoDAO() {
		return ManagerInfoDAO;
	}

	public void setManagerInfoDAO(IManagerInfoDAO ManagerInfoDAO) {
		this.ManagerInfoDAO = ManagerInfoDAO;
	}
	
	public void addManager(ManagerInfo manager){
		ManagerInfoDAO.save(manager);
	}
	
	public ManagerInfo getUserById(java.lang.Integer id){
		return ManagerInfoDAO.findById(id);
	}
	
	public ManagerInfo getManagerByName(String username){
		List list = ManagerInfoDAO.findByUsername(username);
		if(list.size()==0){
			return null;
		}else{
			return (ManagerInfo) list.get(0);
		}
	}
}