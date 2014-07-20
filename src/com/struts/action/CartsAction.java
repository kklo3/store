package com.struts.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IProductInfoService;
import com.store.product.ProductInfo;
import com.util.ContextUtil;

@SuppressWarnings("serial")
public class CartsAction extends ActionSupport{
	@SuppressWarnings("unchecked")
	public String cartAdd() throws IOException {
		HttpServletRequest req;
		req = ServletActionContext.getRequest();
		String ProductName = req.getParameter("ProductName");
		IProductInfoService ProductService = (IProductInfoService) ContextUtil
		.getContext("ProductInfoService");
		ProductInfo product = ProductService.getProductByName(ProductName);
		Map<String, Object> session = ActionContext.getContext().getSession();
		ArrayList<ProductInfo> ordersList = null;
		ordersList = ( ArrayList<ProductInfo>) session.get("product");
		if (ordersList == null || ordersList.isEmpty()) {
			ordersList = new ArrayList<ProductInfo>();
			ordersList.add(product);
			session.put("product", ordersList);
		}
		else {
			ordersList.add(product);
			session.put("product", ordersList);
		}
		result = new HashMap<String, String>();
		return SUCCESS;
	}
	
	@SuppressWarnings({ "unchecked", "null" })
	public String cartDel() throws IOException {
		HttpServletRequest req;
		req = ServletActionContext.getRequest();
		String ProductName = req.getParameter("ProductName");
		IProductInfoService ProductService = (IProductInfoService) ContextUtil
		.getContext("ProductInfoService");
		ProductInfo product = ProductService.getProductByName(ProductName);
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		ArrayList<ProductInfo> ordersList = (ArrayList<ProductInfo>) session.get("product");
		if(ordersList != null || !(ordersList.isEmpty())){
			for(int i=0;i<ordersList.size();i++){
				if((ordersList.get(i).getProductName()).equals(ProductName))
					ordersList.remove(i--);
			}
			session.put("product", ordersList);
		}
		result = new HashMap<String, String>();
		return SUCCESS;
	}
	
	private HashMap<String, String> result;
	
	public HashMap<String, String> getResult() {
		return result;
	}

	public void setResult(HashMap<String, String> result) {
		this.result = result;
	}
}
