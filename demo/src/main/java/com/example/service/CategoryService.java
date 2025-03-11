package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Category;
import com.example.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository categoryRepo;
	public void createCategory(Category category )
	{
		categoryRepo.save(category);
	}

}
