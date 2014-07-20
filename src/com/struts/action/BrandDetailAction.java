package com.struts.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IProductInfoService;
import com.store.product.ProductInfo;
import com.util.ContextUtil;

public class BrandDetailAction extends ActionSupport{
	public String execute() throws Exception {
		IProductInfoService service = (IProductInfoService) ContextUtil
		.getContext("ProductInfoService");
		List<ProductInfo> productList = service.findByBrandId(Integer.parseInt(BrandId));
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("ProductList", productList);
		return SUCCESS;
	}
	private String BrandId;
	public String getBrandId() {
		return BrandId;
	}
	public void setBrandId(String brandId) {
		BrandId = brandId;
	}
}
