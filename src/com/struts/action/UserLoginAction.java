package com.struts.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IUserInfoService;
import com.store.user.UserInfo;
import com.util.ContextUtil;

@SuppressWarnings("serial")
public class UserLoginAction extends ActionSupport {
	public String doUserLogin() throws IOException {
		HttpServletRequest req;
		req = ServletActionContext.getRequest();
		String UserName = req.getParameter("username");
		String PassWord = req.getParameter("password");
		IUserInfoService service = (IUserInfoService) ContextUtil
				.getContext("UserInfoService");
		UserInfo user = service.findByUsername(UserName);
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("UserID", user.getId()+"");
		session.put("Name", user.getName());
		
		result = new HashMap<String, String>();
		if (user != null && (user.getPassword()).equals(PassWord)) {
			result.put("result", user.getName());
			return SUCCESS;
		} else {
			result.put("result", "用户名或者密码错误！");
			return INPUT;
		}
	}

	public HashMap<String, String> getResult() {
		return result;
	}

	public void setResult(HashMap<String, String> result) {
		this.result = result;
	}

	private HashMap<String, String> result;
}
