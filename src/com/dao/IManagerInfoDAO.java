package com.dao;

import java.util.List;

import com.store.manager.ManagerInfo;

public interface IManagerInfoDAO {

	public abstract void save(ManagerInfo transientInstance);

	public abstract void delete(ManagerInfo persistentInstance);

	public abstract ManagerInfo findById(java.lang.Integer id);

	public abstract List findByExample(ManagerInfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByUsername(Object username);

	public abstract List findByPassword(Object password);

	public abstract List findByOpType(Object opType);

	public abstract List findAll();

}