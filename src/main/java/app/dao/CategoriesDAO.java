package app.dao;

import java.util.List;

import app.model.Categories;

public interface CategoriesDAO extends BaseDAO<Integer, Categories> {
//	List<Car> loadCars(Integer offset,Integer maxResults);
	List<Categories> listCategories();
//	public long countCar();
	
}  
