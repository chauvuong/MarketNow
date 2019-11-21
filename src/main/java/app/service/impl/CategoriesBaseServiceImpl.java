package app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import app.dao.CategoriesDAO;

public class CategoriesBaseServiceImpl {
	
	@Autowired
	protected CategoriesDAO categoriesDAO;

	public CategoriesDAO getCategoriesDAO() {
		return categoriesDAO;
	}

	public void setCategoriesDAO(CategoriesDAO categoriesDAO) {
		this.categoriesDAO = categoriesDAO;
	}





	




}