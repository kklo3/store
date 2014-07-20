package com.util;

import com.service.IBrandInfoService;
import com.service.IProductInfoService;
import com.service.IUserInfoService;
import com.store.brand.BrandInfo;
import com.store.product.ProductInfo;
import com.store.user.UserInfo;

public class DetailInfo {
	//根据用户ID获取用户名称
	public static String getUserNameById(int UserId) {
		if (UserId == -1) {
			return "默认用户";
		}
		IUserInfoService service = (IUserInfoService) ContextUtil
				.getContext("UserInfoService");
		UserInfo userinfo = service.getUserById(UserId);
		if(userinfo==null){
			return "默认用户";
		}
		return userinfo.getUsername();
	}
	//根据用户ID获取用户地址
	public static String getAddressByUserId(int UserId) {
		if (UserId == -1) {
			return "默认地址";
		}
		IUserInfoService service = (IUserInfoService) ContextUtil
				.getContext("UserInfoService");
		UserInfo userinfo = service.getUserById(UserId);
		if(userinfo==null){
			return "默认地址";
		}
		return userinfo.getAddress();
	}
	//根据ID获取产品名称
	public static String getProductNameById(int ProductId) {
		IProductInfoService service = (IProductInfoService) ContextUtil
				.getContext("ProductInfoService");
		ProductInfo productinfo = service.getProductInfoById(ProductId);
		if(productinfo==null){
			return "默认产品";
		}
		return productinfo.getProductName();
	}
	//根据ID获取产品价格
	public static String getPriceById(int ProductId) {
		IProductInfoService service = (IProductInfoService) ContextUtil
				.getContext("ProductInfoService");
		ProductInfo productinfo = service.getProductInfoById(ProductId);
		if(productinfo==null){
			return "默认价格";
		}
		return (productinfo.getPrice()+"");
	}
	//根据ID获取品牌名称
	public static String getBrandNameById(int BrandId) {
		if (BrandId == -1) {
			return "默认厂商";
		}
		IBrandInfoService service = (IBrandInfoService) ContextUtil
				.getContext("BrandInfoService");
		BrandInfo brandinfo = service.getBrandInfoById(BrandId);
		if(brandinfo==null){
			return "默认厂商";
		}
		return brandinfo.getBrandName();
	}
	//翻译网络制式
	public static String getGsmEditName(int GsmEdit) {
		String result = "";
		switch (GsmEdit) {
		case 1:
			result = "移动2G(GSM)";
			break;
		case 2:
			result = "电信2G(CDMA)，电信3G(CDMA2000)";
			break;
		case 3:
			result = "移动 联通3G(WCDMA)，移动2G/联通2G(GSM)";
			break;
		default:
			result = "三网通用";
		}
		return result;
	}
}
