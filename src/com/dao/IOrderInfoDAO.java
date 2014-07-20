package com.dao;

import java.util.List;

import com.store.order.OrderInfo;

public interface IOrderInfoDAO {

	public abstract void save(OrderInfo transientInstance);

	public abstract void delete(OrderInfo persistentInstance);

	public abstract OrderInfo findById(java.lang.Integer id);

	public abstract List findByExample(OrderInfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByProductId(Object productId);

	public abstract List findByDoneDate(Object doneDate);

	public abstract List findByUserId(Object userId);

	public abstract List findByQuantity(Object quantity);

	public abstract List findAll();

}