package app.service.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import app.model.Car;
import app.model.Categories;
import app.service.CategoriesService;

public class CategoriesServiceImpl extends CategoriesBaseServiceImpl implements CategoriesService {
	
	private static final Logger logger = Logger.getLogger(CategoriesServiceImpl.class);

	@Override
	public List<Categories> loadCategories() {
		try {
			return getCategoriesDAO().listCategories();
		} catch (Exception e) {
			return null;
		}
	}
	@Override
	public Categories saveOrUpdate(Categories entity) {
		try {
			return getCategoriesDAO().saveOrUpdate(entity);
		} catch (Exception e) {
//			logger.error(e);
			throw e;
		}
	}
//

	@Override
	public Categories findById(Serializable key) {
		try {
			return getCategoriesDAO().findById(key);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean delete(Categories entity) {
		try {
			getCategoriesDAO().delete(entity);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}



	


}
