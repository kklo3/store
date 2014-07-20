package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.IProductInfoService;
import com.store.product.ProductInfo;
import com.util.ContextUtil;
import com.util.GenerateIdUtil;

@SuppressWarnings("serial")
public class NewProductAction extends ActionSupport {

	public String execute() throws Exception {
		IProductInfoService service = (IProductInfoService) ContextUtil
				.getContext("ProductInfoService");
		ProductInfo product = new ProductInfo();
		int id = GenerateIdUtil.GenerateId();
		product.setId(id);
		product.setBrandId(Integer.parseInt(BrandId));
		product.setColor(Color);
		product.setGsmEdit(Short.parseShort(GsmEdit));
		product.setMemo(Memo);
		product.setOpId(Integer.parseInt(OpId));
		product.setPrice(Long.parseLong(Price));
		product.setProductName(ProductName);
		service.addProduct(product);
		message = "新增成功！";
		return SUCCESS;
	}

	private String message;
	private String ProductName;
	private String Memo;
	private String Price;
	private String GsmEdit;
	private String Color;
	private String BrandId;
	private String OpId;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getMemo() {
		return Memo;
	}

	public void setMemo(String memo) {
		Memo = memo;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getGsmEdit() {
		return GsmEdit;
	}

	public void setGsmEdit(String gsmEdit) {
		GsmEdit = gsmEdit;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getBrandId() {
		return BrandId;
	}

	public void setBrandId(String brandId) {
		BrandId = brandId;
	}

	public String getOpId() {
		return OpId;
	}

	public void setOpId(String opId) {
		OpId = opId;
	}

}