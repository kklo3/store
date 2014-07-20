package com.dao.impl;

import java.util.List;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.IManagerInfoDAO;
import com.store.manager.ManagerInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * ManagerInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.store.manager.ManagerInfo
 * @author MyEclipse Persistence Tools
 */

public class ManagerInfoDAO extends HibernateDaoSupport implements IManagerInfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ManagerInfoDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String OP_TYPE = "opType";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IManagerInfoDAO#save(com.store.manager.ManagerInfo)
	 */
	@Override
	public void save(ManagerInfo transientInstance) {
		log.debug("saving ManagerInfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IManagerInfoDAO#delete(com.store.manager.ManagerInfo)
	 */
	@Override
	public void delete(ManagerInfo persistentInstance) {
		log.debug("deleting ManagerInfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IManagerInfoDAO#findById(java.lang.Integer)
	 */
	@Override
	public ManagerInfo findById(java.lang.Integer id) {
		log.debug("getting ManagerInfo instance with id: " + id);
		try {
			ManagerInfo instance = (ManagerInfo) getHibernateTemplate().get(
					"com.store.manager.ManagerInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ManagerInfo instance) {
		log.debug("finding ManagerInfo instance by example");
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
		log.debug("finding ManagerInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ManagerInfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IManagerInfoDAO#findByUsername(java.lang.Object)
	 */
	@Override
	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IManagerInfoDAO#findByOpType(java.lang.Object)
	 */
	@Override
	public List findByOpType(Object opType) {
		return findByProperty(OP_TYPE, opType);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IManagerInfoDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all ManagerInfo instances");
		try {
			String queryString = "from ManagerInfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ManagerInfo merge(ManagerInfo detachedInstance) {
		log.debug("merging ManagerInfo instance");
		try {
			ManagerInfo result = (ManagerInfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ManagerInfo instance) {
		log.debug("attaching dirty ManagerInfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ManagerInfo instance) {
		log.debug("attaching clean ManagerInfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IManagerInfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (IManagerInfoDAO) ctx.getBean("ManagerInfoDAO");
	}
}