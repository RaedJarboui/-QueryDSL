package com.querydsl.repo.impl;

import java.util.List;
import java.util.Optional;

import com.querydsl.core.Tuple;
import com.querydsl.entity.Category;
import com.querydsl.repo.CategoryRepository;

import jakarta.persistence.EntityManager;

public class CategoryRepositoryImpl extends QueryDslRepositoryImpl<Category, Integer> implements CategoryRepository {

	public CategoryRepositoryImpl(EntityManager em) {
		super(Category.class, em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Optional<Category> findCategoryByName(String name) {
		// Optional.ofNullable(null)
	
		return Optional.ofNullable(
				jpaQueryFactory.
				select(category)
				.from(category)
				.where(category.name.equalsIgnoreCase(name))
				.fetchFirst()
				
				);
	}

	@Override
	public List<Category> findAllCategories() {
		return jpaQueryFactory.select(category).from(category).fetch();

	}

	@Override
	public List<Tuple> findCategoriesContainingProducts() {
		
		return  jpaQueryFactory.select(category.email,category.name)
				.from(category)
				.distinct()
				.innerJoin(category.products,product)
				.fetchJoin()
				.fetch()
				;
	}

}
