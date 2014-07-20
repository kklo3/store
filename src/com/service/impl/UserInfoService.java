package com.service.impl;

import java.util.List;

import com.dao.IUserInfoDAO;
import com.service.IUserInfoService;
import com.store.user.UserInfo;

public class UserInfoService implements IUserInfoService {
	private IUserInfoDAO UserInfoDAO;

	/* (non-Javadoc)
	 * @see com.service.impl.IUserInfoService#getUserInfoDAO()
	 */
	@Override
	public IUserInfoDAO getUserInfoDAO() {
		return UserInfoDAO;
	}

	public void setUserInfoDAO(IUserInfoDAO UserInfoDAO) {
		this.UserInfoDAO = UserInfoDAO;
	}
	
	/* (non-Javadoc)
	 * @see com.service.impl.IUserInfoService#addUser(com.store.user.UserInfo)
	 */
	@Override
	public void addUser(UserInfo user){
		UserInfoDAO.save(user);
	}
	
	/* (non-Javadoc)
	 * @see com.service.impl.IUserInfoService#getUserById(java.lang.Integer)
	 */
	@Override
	public UserInfo getUserById(java.lang.Integer id){
		return UserInfoDAO.findById(id);
	}
	
	/* (non-Javadoc)
	 * @see com.service.impl.IUserInfoService#findByUsername(java.lang.Object)
	 */
	@Override
	public UserInfo findByUsername(Object username){
		List list = UserInfoDAO.findByUsername(username);
		if(list.size()==0){
			return null;
		}else{
			return (UserInfo) list.get(0);
		}
	}

	/* (non-Javadoc)
	 * @see com.service.impl.IUserInfoService#findByPhone(java.lang.Object)
	 */
	@Override
	public UserInfo findByPhone(Object phone){
		List list = UserInfoDAO.findByPhone(phone);
		if(list.size()==0){
			return null;
		}else{
			return (UserInfo) list.get(0);
		}
	}

	/* (non-Javadoc)
	 * @see com.service.impl.IUserInfoService#findByAddress(java.lang.Object)
	 */
	@Override
	public UserInfo findByAddress(Object address){
		List list = UserInfoDAO.findByAddress(address);
		if(list.size()==0){
			return null;
		}else{
			return (UserInfo) list.get(0);
		}
	}

	/* (non-Javadoc)
	 * @see com.service.impl.IUserInfoService#findByPostcard(java.lang.Object)
	 */
	@Override
	public UserInfo findByPostcard(Object postcard){
		List list = UserInfoDAO.findByPostcard(postcard);
		if(list.size()==0){
			return null;
		}else{
			return (UserInfo) list.get(0);
		}
	}

	/* (non-Javadoc)
	 * @see com.service.impl.IUserInfoService#findByName(java.lang.Object)
	 */
	@Override
	public UserInfo findByName(Object name){
		List list = UserInfoDAO.findByName(name);
		if(list.size()==0){
			return null;
		}else{
			return (UserInfo) list.get(0);
		}
	}

	/* (non-Javadoc)
	 * @see com.service.impl.IUserInfoService#findByEmail(java.lang.Object)
	 */
	@Override
	public UserInfo findByEmail(Object email){
		List list = UserInfoDAO.findByEmail(email);
		if(list.size()==0){
			return null;
		}else{
			return (UserInfo) list.get(0);
		}
	}
	
	public List findAll(){
		return UserInfoDAO.findAll();
	}

	@Override
	public void delete(UserInfo user) {
		UserInfoDAO.delete(user);
	}

	@Override
	public void update(UserInfo user) {
		UserInfoDAO.attachDirty(user);
	}
}
