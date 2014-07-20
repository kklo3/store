package com.util;

import com.service.IBrandInfoService;
import com.service.IProductInfoService;
import com.service.IUserInfoService;
import com.store.brand.BrandInfo;
import com.store.product.ProductInfo;
import com.store.user.UserInfo;

public class DetailInfo {
	//�����û�ID��ȡ�û�����
	public static String getUserNameById(int UserId) {
		if (UserId == -1) {
			return "Ĭ���û�";
		}
		IUserInfoService service = (IUserInfoService) ContextUtil
				.getContext("UserInfoService");
		UserInfo userinfo = service.getUserById(UserId);
		if(userinfo==null){
			return "Ĭ���û�";
		}
		return userinfo.getUsername();
	}
	//�����û�ID��ȡ�û���ַ
	public static String getAddressByUserId(int UserId) {
		if (UserId == -1) {
			return "Ĭ�ϵ�ַ";
		}
		IUserInfoService service = (IUserInfoService) ContextUtil
				.getContext("UserInfoService");
		UserInfo userinfo = service.getUserById(UserId);
		if(userinfo==null){
			return "Ĭ�ϵ�ַ";
		}
		return userinfo.getAddress();
	}
	//����ID��ȡ��Ʒ����
	public static String getProductNameById(int ProductId) {
		IProductInfoService service = (IProductInfoService) ContextUtil
				.getContext("ProductInfoService");
		ProductInfo productinfo = service.getProductInfoById(ProductId);
		if(productinfo==null){
			return "Ĭ�ϲ�Ʒ";
		}
		return productinfo.getProductName();
	}
	//����ID��ȡ��Ʒ�۸�
	public static String getPriceById(int ProductId) {
		IProductInfoService service = (IProductInfoService) ContextUtil
				.getContext("ProductInfoService");
		ProductInfo productinfo = service.getProductInfoById(ProductId);
		if(productinfo==null){
			return "Ĭ�ϼ۸�";
		}
		return (productinfo.getPrice()+"");
	}
	//����ID��ȡƷ������
	public static String getBrandNameById(int BrandId) {
		if (BrandId == -1) {
			return "Ĭ�ϳ���";
		}
		IBrandInfoService service = (IBrandInfoService) ContextUtil
				.getContext("BrandInfoService");
		BrandInfo brandinfo = service.getBrandInfoById(BrandId);
		if(brandinfo==null){
			return "Ĭ�ϳ���";
		}
		return brandinfo.getBrandName();
	}
	//����������ʽ
	public static String getGsmEditName(int GsmEdit) {
		String result = "";
		switch (GsmEdit) {
		case 1:
			result = "�ƶ�2G(GSM)";
			break;
		case 2:
			result = "����2G(CDMA)������3G(CDMA2000)";
			break;
		case 3:
			result = "�ƶ� ��ͨ3G(WCDMA)���ƶ�2G/��ͨ2G(GSM)";
			break;
		default:
			result = "����ͨ��";
		}
		return result;
	}
}
