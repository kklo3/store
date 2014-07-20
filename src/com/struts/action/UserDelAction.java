package com.struts.action;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.service.IUserInfoService;
import com.store.user.UserInfo;
import com.util.ContextUtil;

@SuppressWarnings("serial")
public class UserDelAction extends ActionSupport{
	public String execute() throws IOException {
		HttpServletRequest req;
		req = ServletActionContext.getRequest();
		String UserID = req.getParameter("UserId");
		IUserInfoService service = (IUserInfoService) ContextUtil
		.getContext("UserInfoService");
		UserInfo user = service.getUserById(Integer.parseInt(UserID));
		service.delete(user);
		result = new HashMap<String, String>();
		result.put("result", "É¾³ý³É¹¦£¡");
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
