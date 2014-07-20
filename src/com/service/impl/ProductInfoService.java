package com.service.impl;

import java.util.List;

import com.dao.IProductInfoDAO;
import com.service.IProductInfoService;
import com.store.product.ProductInfo;

public class ProductInfoService implements IProductInfoService {
	private IProductInfoDAO ProductInfoDAO;

	/* (non-Javadoc)
	 * @see com.service.impl.IProductInfoService#getProductInfoDAO()
	 */
	@Override
	public IProductInfoDAO getProductInfoDAO() {
		return ProductInfoDAO;
	}

	public void setProductInfoDAO(IProductInfoDAO ProductInfoDAO) {
		this.ProductInfoDAO = ProductInfoDAO;
	}
	
	/* (non-Javadoc)
	 * @see com.service.impl.IProductInfoService#addProduct(com.store.product.ProductInfo)
	 */
	@Override
	public void addProduct(ProductInfo Product){
		ProductInfoDAO.save(Product);
	}
	
	/* (non-Javadoc)
	 * @see com.service.impl.IProductInfoService#getProductInfoById(java.lang.Integer)
	 */
	@Override
	public ProductInfo getProductInfoById(java.lang.Integer id){
		return ProductInfoDAO.findById(id);
	}
	
	/* (non-Javadoc)
	 * @see com.service.impl.IProductInfoService#getProductByName(java.lang.String)
	 */
	@Override
	public ProductInfo getProductByName(String ProductName){
		List list = ProductInfoDAO.findByProductName(ProductName);
		if(list.size()==0){
			return null;
		}else{
			return (ProductInfo) list.get(0);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.service.impl.IProductInfoService#findByBrandId(java.lang.String)
	 */
	@Override
	public List findByBrandId(Integer BrandId) {
		return ProductInfoDAO.findByBrandId(BrandId);
	}
	
	/* (non-Javadoc)
	 * @see com.service.impl.IProductInfoService#findByOpId(java.lang.Integer)
	 */
	@Override
	public List findByOpId (Integer OpId){
		return ProductInfoDAO.findByOpId(OpId);
	}
	
	/* (non-Javadoc)
	 * @see com.service.impl.IProductInfoService#findByGsmEdit(java.lang.Short)
	 */
	@Override
	public List findByGsmEdit(Short GsmEdit){
		return ProductInfoDAO.findByGsmEdit(GsmEdit);
	}
	
	/* (non-Javadoc)
	 * @see com.service.impl.IProductInfoService#findByColor(java.lang.String)
	 */
	@Override
	public List findByColor(String color){
		return ProductInfoDAO.findByColor(color);
	}
	
	public void deleteProductById(Integer id){
		ProductInfoDAO.delete(ProductInfoDAO.findById(id));
	}

	public List findAll() {
		return ProductInfoDAO.findAll();
	}
}
