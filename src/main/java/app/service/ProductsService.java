package app.service;

import java.util.List;

import app.model.Products;

public interface ProductsService extends BaseService<Integer, Products> {
	List<Products> loadProducts();
}
