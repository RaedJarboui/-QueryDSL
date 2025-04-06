package com.querydsl.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.querydsl.core.Tuple;
import com.querydsl.entity.Category;
@Repository
public interface CategoryRepository extends QueryDslRepository<Category, Integer> {
	
	Optional<Category> findCategoryByName(String name);
	List<Category> findAllCategories();
	List<Tuple> findCategoriesContainingProducts();


}
