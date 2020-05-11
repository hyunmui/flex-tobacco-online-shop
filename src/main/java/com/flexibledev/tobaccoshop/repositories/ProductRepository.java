package com.flexibledev.tobaccoshop.repositories;

import com.flexibledev.tobaccoshop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
