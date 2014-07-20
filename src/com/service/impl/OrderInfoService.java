package com.service.impl;

import java.util.List;

import com.dao.IOrderInfoDAO;
import com.service.IOrderInfoService;
import com.store.order.OrderInfo;

public class OrderInfoService implements IOrderInfoService{
	private IOrderInfoDAO OrderInfoDAO;

	public IOrderInfoDAO getOrderInfoDAO() {
		return OrderInfoDAO;
	}

	public void setOrderInfoDAO(IOrderInfoDAO OrderInfoDAO) {
		this.OrderInfoDAO = OrderInfoDAO;
	}
	
	public void addOrder(OrderInfo Order) {
		OrderInfoDAO.save(Order);
	}

	public OrderInfo getOrderById(Integer id) {
		return OrderInfoDAO.findById(id);
	}

	public List getOrderByUserId(Integer UserId) {
		return OrderInfoDAO.findByUserId(UserId);
	}
	
	public void deleteOrderById(Integer id) {
		OrderInfoDAO.delete(OrderInfoDAO.findById(id));
	}

	public List findAll(){
		return OrderInfoDAO.findAll();
	}
}
