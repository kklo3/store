package com.struts.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IOrderInfoService;
import com.service.IUserInfoService;
import com.store.user.UserInfo;
import com.util.ContextUtil;

public class DetailAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		String UserNameSession= (String) session.get("UserID");
		IUserInfoService userinfoService = (IUserInfoService) ContextUtil
		.getContext("UserInfoService");
		UserInfo userinfo = userinfoService.findByName(UserName);
		if(UserNameSession==null || UserNameSession==""){
			if(userinfo!=null)
				session.put("UserID", userinfo.getId()+"");
			else{
				session.put("UserID", "-1");
			}
		}
		return SUCCESS;
	}

	private String productId;
	private String UserName;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;
	}
}
