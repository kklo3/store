package com.store.manager;

/**
 * AbstractManagerInfo entity provides the base persistence definition of the
 * ManagerInfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractManagerInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String opType;

	// Constructors

	/** default constructor */
	public AbstractManagerInfo() {
	}

	/** full constructor */
	public AbstractManagerInfo(String username, String password, String opType) {
		this.username = username;
		this.password = password;
		this.opType = opType;
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

	public String getOpType() {
		return this.opType;
	}

	public void setOpType(String opType) {
		this.opType = opType;
	}

}