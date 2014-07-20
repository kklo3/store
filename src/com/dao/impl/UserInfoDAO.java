package com.dao.impl;

import java.util.List;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.IUserInfoDAO;
import com.store.user.UserInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * UserInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.store.user.UserInfo
 * @author MyEclipse Persistence Tools
 */

public class UserInfoDAO extends HibernateDaoSupport implements IUserInfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(UserInfoDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String PHONE = "phone";
	public static final String ADDRESS = "address";
	public static final String POSTCARD = "postcard";
	public static final String NAME = "name";
	public static final String EMAIL = "email";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IUserInfoDAO#save(com.store.user.UserInfo)
	 */
	@Override
	public void save(UserInfo transientInstance) {
		log.debug("saving UserInfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IUserInfoDAO#delete(com.store.user.UserInfo)
	 */
	@Override
	public void delete(UserInfo persistentInstance) {
		log.debug("deleting UserInfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IUserInfoDAO#findById(java.lang.Integer)
	 */
	@Override
	public UserInfo findById(java.lang.Integer id) {
		log.debug("getting UserInfo instance with id: " + id);
		try {
			UserInfo instance = (UserInfo) getHibernateTemplate().get(
					"com.store.user.UserInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UserInfo instance) {
		log.debug("finding UserInfo instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding UserInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UserInfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IUserInfoDAO#findByUsername(java.lang.Object)
	 */
	@Override
	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IUserInfoDAO#findByPhone(java.lang.Object)
	 */
	@Override
	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IUserInfoDAO#findByAddress(java.lang.Object)
	 */
	@Override
	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IUserInfoDAO#findByPostcard(java.lang.Object)
	 */
	@Override
	public List findByPostcard(Object postcard) {
		return findByProperty(POSTCARD, postcard);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IUserInfoDAO#findByName(java.lang.Object)
	 */
	@Override
	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IUserInfoDAO#findByEmail(java.lang.Object)
	 */
	@Override
	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IUserInfoDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all UserInfo instances");
		try {
			String queryString = "from UserInfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UserInfo merge(UserInfo detachedInstance) {
		log.debug("merging UserInfo instance");
		try {
			UserInfo result = (UserInfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UserInfo instance) {
		log.debug("attaching dirty UserInfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UserInfo instance) {
		log.debug("attaching clean UserInfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UserInfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UserInfoDAO) ctx.getBean("UserInfoDAO");
	}
}