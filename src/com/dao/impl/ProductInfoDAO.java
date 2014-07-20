package com.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.IProductInfoDAO;
import com.store.product.ProductInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * ProductInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.store.product.ProductInfo
 * @author MyEclipse Persistence Tools
 */

public class ProductInfoDAO extends HibernateDaoSupport implements IProductInfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ProductInfoDAO.class);
	// property constants
	public static final String PRICE = "price";
	public static final String COLOR = "color";
	public static final String BRAND_ID = "brandId";
	public static final String OP_ID = "opId";
	public static final String GSM_EDIT = "gsmEdit";
	public static final String MEMO = "memo";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#save(com.store.product.ProductInfo)
	 */
	@Override
	public void save(ProductInfo transientInstance) {
		log.debug("saving ProductInfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#delete(com.store.product.ProductInfo)
	 */
	@Override
	public void delete(ProductInfo persistentInstance) {
		log.debug("deleting ProductInfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#findById(java.lang.Integer)
	 */
	@Override
	public ProductInfo findById(java.lang.Integer id) {
		log.debug("getting ProductInfo instance with id: " + id);
		try {
			ProductInfo instance = (ProductInfo) getHibernateTemplate().get(
					"com.store.product.ProductInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#findByExample(com.store.product.ProductInfo)
	 */
	@Override
	public List findByExample(ProductInfo instance) {
		log.debug("finding ProductInfo instance by example");
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

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ProductInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ProductInfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#findByPrice(java.lang.Object)
	 */
	@Override
	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#findByColor(java.lang.Object)
	 */
	@Override
	public List findByColor(Object color) {
		return findByProperty(COLOR, color);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#findByProductName(java.lang.Object)
	 */
	@Override
	public List findByProductName(Object productName) {
		return findByProperty(PRODUCT_NAME, productName);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#findByBrandId(java.lang.Object)
	 */
	@Override
	public List findByBrandId(Object brandId) {
		return findByProperty(BRAND_ID, brandId);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#findByOpId(java.lang.Object)
	 */
	@Override
	public List findByOpId(Object opId) {
		return findByProperty(OP_ID, opId);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#findByGsmEdit(java.lang.Object)
	 */
	@Override
	public List findByGsmEdit(Object gsmEdit) {
		return findByProperty(GSM_EDIT, gsmEdit);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#findByMemo(java.lang.Object)
	 */
	@Override
	public List findByMemo(Object memo) {
		return findByProperty(MEMO, memo);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all ProductInfo instances");
		try {
			String queryString = "from ProductInfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#merge(com.store.product.ProductInfo)
	 */
	@Override
	public ProductInfo merge(ProductInfo detachedInstance) {
		log.debug("merging ProductInfo instance");
		try {
			ProductInfo result = (ProductInfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#attachDirty(com.store.product.ProductInfo)
	 */
	@Override
	public void attachDirty(ProductInfo instance) {
		log.debug("attaching dirty ProductInfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.IProductInfoDAO#attachClean(com.store.product.ProductInfo)
	 */
	@Override
	public void attachClean(ProductInfo instance) {
		log.debug("attaching clean ProductInfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ProductInfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ProductInfoDAO) ctx.getBean("ProductInfoDAO");
	}
}