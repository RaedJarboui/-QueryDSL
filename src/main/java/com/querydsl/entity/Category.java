package com.querydsl.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
	
	 	@Id
	    @GeneratedValue
	    private int authorId;
	    private String name;
	    private String email;
	    @OneToMany(targetEntity = Product.class,
	            cascade = CascadeType.ALL,
	            fetch = FetchType.LAZY)
	    @JoinColumn(name = "productId",referencedColumnName = "productId")
	    private List<Product> products;

}
