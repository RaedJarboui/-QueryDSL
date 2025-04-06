package com.querydsl.repo.impl;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.querydsl.entity.QCategory;
import com.querydsl.entity.QProduct;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.querydsl.repo.QueryDslRepository;

import jakarta.persistence.EntityManager;

public class QueryDslRepositoryImpl<T,ID> extends SimpleJpaRepository<T,ID> implements QueryDslRepository<T,ID> {

	EntityManager em;
    JPAQueryFactory jpaQueryFactory;

    protected final QCategory category=QCategory.category;
    protected  final QProduct product=QProduct.product;

    public QueryDslRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        this.em=em;
        this.jpaQueryFactory=new JPAQueryFactory(em);
    }

   
}