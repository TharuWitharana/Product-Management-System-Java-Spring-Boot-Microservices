package com.example.order.repo;

import com.example.order.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepo extends JpaRepository<Orders, Integer> {
    @Query(value = "SELECT * FROM orders WHERE id = ?1", nativeQuery = true)
    Orders getOrderById(Integer orderId);
}
