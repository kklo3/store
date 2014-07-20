package com.store.user;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */
public class UserInfo extends AbstractUserInfo implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** full constructor */
	public UserInfo(String username, String password, Long phone,
			String address, String postcard, String name, String email) {
		super(username, password, phone, address, postcard, name, email);
	}

}
