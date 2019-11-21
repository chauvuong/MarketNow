package app.service.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import app.model.Car;
import app.model.Products;
import app.service.ProductsService;

public class ProductsServiceImpl extends ProductsBaseServiceImpl implements ProductsService {
	
	private static final Logger logger = Logger.getLogger(ProductsServiceImpl.class);

	@Override
	public List<Products> loadProducts() {
		try {
			return getProductsDAO().listProducts();
		} catch (Exception e) {
			return null;
		}
	}
	@Override
	public Products saveOrUpdate(Products entity) {
		try {
			return getProductsDAO().saveOrUpdate(entity);
		} catch (Exception e) {
//			logger.error(e);
			throw e;
		}
	}
//

	@Override
	public Products findById(Serializable key) {
		try {
			return getProductsDAO().findById(key);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean delete(Products entity) {
		try {
			getProductsDAO().delete(entity);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}



	


}
