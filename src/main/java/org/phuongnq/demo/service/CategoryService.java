package org.phuongnq.demo.service;

import java.util.List;

import org.phuongnq.demo.model.CategoryEntity;
import org.phuongnq.demo.model.SaleEntity;

public interface CategoryService {
	
	public List<CategoryEntity> findListOriginals();

	public List<CategoryEntity> getChildren(long id);
	
	public List<CategoryEntity> findAll();
	
	public List<SaleEntity> findByCategoryId(int id);
}
