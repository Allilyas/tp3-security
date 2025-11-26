package com.ilyas.springweb.reposetories;

import com.ilyas.springweb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
