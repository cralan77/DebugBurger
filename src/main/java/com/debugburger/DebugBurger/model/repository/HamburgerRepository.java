package com.debugburger.DebugBurger.model.repository;

import com.debugburger.DebugBurger.model.entity.Hamburger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HamburgerRepository extends JpaRepository<Hamburger, Long> {
}
