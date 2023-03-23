package com.devdutt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdutt.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

}
