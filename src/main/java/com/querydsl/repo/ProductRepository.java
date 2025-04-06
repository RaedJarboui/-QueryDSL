package com.querydsl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.querydsl.entity.Product;
@Repository
public interface ProductRepository extends QueryDslRepository<Product, Integer> {

}
