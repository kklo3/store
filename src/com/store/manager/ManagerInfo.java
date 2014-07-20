package com.store.manager;

/**
 * ManagerInfo entity. @author MyEclipse Persistence Tools
 */
public class ManagerInfo extends AbstractManagerInfo implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ManagerInfo() {
	}

	/** full constructor */
	public ManagerInfo(String username, String password, String opType) {
		super(username, password, opType);
	}

}
