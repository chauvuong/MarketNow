package app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import app.dao.CategoriesDAO;
import app.dao.ProductsDAO;

public class ProductsBaseServiceImpl {
	
	@Autowired
	protected ProductsDAO productsDAO;

	public ProductsDAO getProductsDAO() {
		return productsDAO;
	}

	public void setProductsDAO(ProductsDAO productsDAO) {
		this.productsDAO = productsDAO;
	}

	



}