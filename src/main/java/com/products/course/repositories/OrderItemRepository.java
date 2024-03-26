package com.products.course.repositories;

import com.products.course.entities.OrderItem;
import com.products.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
