package com.debugburger.DebugBurger.model.repository;

import com.debugburger.DebugBurger.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
