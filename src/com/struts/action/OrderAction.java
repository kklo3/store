package com.struts.action;

import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IOrderInfoService;
import com.store.order.OrderInfo;
import com.store.product.ProductInfo;
import com.util.ContextUtil;
import com.util.TimeUtil;

@SuppressWarnings("serial")
public class OrderAction extends ActionSupport {
	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		ArrayList<ProductInfo> ordersList = (ArrayList<ProductInfo>) session
				.get("product");
		String UserID = (String) session.get("UserID");
		IOrderInfoService orderInfoService = (IOrderInfoService) ContextUtil
				.getContext("OrderInfoService");
		int totalCount = orderInfoService.findAll().size();
		OrderInfo orderinfo;
		if (ordersList != null) {
			for (int i = 0; i < ordersList.size(); i++) {
				orderinfo = new OrderInfo();
				orderinfo.setQuantity(1);
				orderinfo.setDoneDate(TimeUtil.getStringDateShort());
				orderinfo.setId(++totalCount);
				orderinfo.setProductId(ordersList.get(i).getId());
				orderinfo.setUserId(Integer.parseInt(UserID));
				System.out.println("¶©µ¥Â¼Èë£º" + " id:" + totalCount + " UserID:"
						+ UserID + " ProductId:" + ordersList.get(i).getId()
						+ " DoneDate:" + TimeUtil.getStringDateShort());
				orderInfoService.addOrder(orderinfo);
			}
		}
		session.clear();
		return SUCCESS;
	}

}
