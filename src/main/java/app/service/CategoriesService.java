package app.service;

import java.util.List;

import app.model.Categories;


public interface CategoriesService extends BaseService<Integer, Categories> {
//	boolean deleteCar(Integer id);

//	List<Car> loadCars(Integer offsets,Integer maxResults);
	
//	long countCar();
	List<Categories> loadCategories();
}
