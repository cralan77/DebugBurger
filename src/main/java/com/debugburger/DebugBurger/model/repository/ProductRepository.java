package com.debugburger.DebugBurger.model.repository;

import com.debugburger.DebugBurger.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
