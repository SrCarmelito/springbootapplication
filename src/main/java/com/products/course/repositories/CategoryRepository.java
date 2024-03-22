package com.products.course.repositories;

import com.products.course.entities.Category;
import com.products.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
