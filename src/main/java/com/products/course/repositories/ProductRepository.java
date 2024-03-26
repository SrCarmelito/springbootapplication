package com.products.course.repositories;

import com.products.course.entities.Category;
import com.products.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
