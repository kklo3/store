package com.service;

import java.util.List;

import com.dao.IOrderInfoDAO;
import com.store.order.OrderInfo;

public interface IOrderInfoService {

	public abstract IOrderInfoDAO getOrderInfoDAO();

	public abstract void addOrder(OrderInfo Order);

	public abstract OrderInfo getOrderById(java.lang.Integer id);

	public abstract List getOrderByUserId(java.lang.Integer UserId);
	
	public abstract void deleteOrderById(java.lang.Integer id);
	
	public abstract List findAll();
}