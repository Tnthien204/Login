package dao;

import java.util.List;

import models.CategoryModel;

public interface ICategoryDao {
	List<CategoryModel> findAll();
	CategoryModel findById(int id);
	void insert(CategoryModel category);
	void update(CategoryModel category);
	void delete(int id);
	List<CategoryModel> findName(String keyword);
	
	
}
