package app.dao.impl;

import java.util.List;

import app.dao.CategoriesDAO;
import app.dao.GenericDAO;
import app.model.Categories;
import app.model.Places;

public class CategoriesDAOImpl extends GenericDAO<Integer, Categories> implements CategoriesDAO {
	public CategoriesDAOImpl() {
		super(Categories.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categories> listCategories() {
		return getSession().createQuery("FROM Categories").getResultList();
	}
}