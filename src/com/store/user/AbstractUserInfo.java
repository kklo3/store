package com.store.user;

/**
 * AbstractUserInfo entity provides the base persistence definition of the
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUserInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private Long phone;
	private String address;
	private String postcard;
	private String name;
	private String email;

	// Constructors

	/** default constructor */
	public AbstractUserInfo() {
	}

	/** full constructor */
	public AbstractUserInfo(String username, String password, Long phone,
			String address, String postcard, String name, String email) {
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.postcard = postcard;
		this.name = name;
		this.email = email;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhone() {
		return this.phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcard() {
		return this.postcard;
	}

	public void setPostcard(String postcard) {
		this.postcard = postcard;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}