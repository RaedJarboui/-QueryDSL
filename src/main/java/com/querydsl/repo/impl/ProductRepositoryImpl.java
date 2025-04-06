package com.querydsl.repo.impl;

import com.querydsl.entity.Product;
import com.querydsl.repo.ProductRepository;

import jakarta.persistence.EntityManager;

public class ProductRepositoryImpl extends QueryDslRepositoryImpl<Product, Integer> implements ProductRepository {

	public ProductRepositoryImpl(EntityManager em) {
		super(Product.class, em);
	}

}
