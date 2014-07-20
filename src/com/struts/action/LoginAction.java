package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.IManagerInfoService;
import com.store.manager.ManagerInfo;
import com.util.ContextUtil;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		IManagerInfoService service = (IManagerInfoService) ContextUtil.getContext("ManagerInfoService");
		ManagerInfo manager = service.getManagerByName(ManagerName);
		if (manager!=null&&(manager.getPassword()).equals(ManagerPassword))
			message = ManagerName;
		else {
			message = ManagerName + "µÇÂ¼Ê§°Ü";
			return INPUT;
		}
		return SUCCESS;
	}

	private String ManagerName;
	private String ManagerPassword;
	private String message;

	public String getManagerName() {
		return ManagerName;
	}

	public void setManagerName(String ManagerName) {
		this.ManagerName = ManagerName;
	}

	public String getManagerPassword() {
		return ManagerPassword;
	}

	public void setManagerPassword(String ManagerPassword) {
		this.ManagerPassword = ManagerPassword;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
