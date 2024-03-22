package com.products.course.repositories;

import com.products.course.entities.Order;
import com.products.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
