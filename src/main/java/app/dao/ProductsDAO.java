package app.dao;

import java.util.List;

import app.model.Products;

public interface ProductsDAO extends BaseDAO<Integer, Products> {
//	List<Car> loadCars(Integer offset,Integer maxResults);
	List<Products> listProducts();
//	public long countCar();
	
}  
