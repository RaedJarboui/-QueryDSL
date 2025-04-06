package com.querydsl.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
@NoRepositoryBean
public interface QueryDslRepository<T,ID> extends JpaRepository<T, ID> {
	Optional<T> findById(ID id);

}
