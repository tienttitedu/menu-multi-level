package org.phuongnq.demo.service;

import java.util.List;

import org.phuongnq.demo.model.CategoryEntity;
import org.phuongnq.demo.repository.CategoryJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryJpaRepository repository;
	
	public List<CategoryEntity> findListOriginals() {
		System.out.println("return :"+repository.findListOriginal().size());
		return repository.findListOriginal();
	}

	public List<CategoryEntity> getChildren(long id) {
		 System.out.println("return :"+repository.getChildren(id).size());
		return repository.getChildren(id);
	}
	
	public List<CategoryEntity> findAll(){
		return repository.findAll();
	}
	
}
