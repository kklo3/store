package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.IUserInfoService;
import com.store.user.UserInfo;
import com.util.ContextUtil;
import com.util.GenerateIdUtil;

@SuppressWarnings("serial")
public class UserApplyAction extends ActionSupport{
	
	public String execute() throws Exception {
		IUserInfoService service = (IUserInfoService) ContextUtil.getContext("UserInfoService");
		UserInfo user = new UserInfo();
		int id = GenerateIdUtil.GenerateId();
		user.setId(id);
		user.setUsername(UserName);
		user.setPassword(Password);
		user.setPhone(Long.parseLong(Phone));
		user.setAddress(Address);
		user.setPostcard(PostCard);
		user.setName(Name);
		user.setEmail(Email);
		service.addUser(user);
		message = "用户注册成功！";
		return SUCCESS;
	}
	
	private String UserName;
	private String Password;
	private String Phone;
	private String Address;
	private String PostCard;
	private String Name;
	private String Email;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPostCard() {
		return PostCard;
	}
	public void setPostCard(String postCard) {
		PostCard = postCard;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
}
