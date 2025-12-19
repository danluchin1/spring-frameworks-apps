package com.example.firstrestapispring.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.firstrestapispring.product.domain.Product;

@Repository

public interface ProductRepository extends JpaRepository<Product, Long> {

}