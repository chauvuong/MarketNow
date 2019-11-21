package app.dao.impl;

import java.util.List;

import app.dao.CategoriesDAO;
import app.dao.GenericDAO;
import app.dao.ProductsDAO;
import app.model.Categories;
import app.model.Places;
import app.model.Products;

public class ProductsDAOImpl extends GenericDAO<Integer, Products> implements ProductsDAO {
	public ProductsDAOImpl() {
		super(Products.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Products> listProducts() {
		return getSession().createQuery("FROM Products").getResultList();
	}
}