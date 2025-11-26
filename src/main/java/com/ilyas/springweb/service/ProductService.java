package com.ilyas.springweb.service;

import com.ilyas.springweb.entities.Product;

import java.util.List;

public interface ProductService{
    Product addProduct(Product product);
    List<Product> findAll();
    void deleteById(Long id);
    Product updateProductById(Long id, String name,double price, long quantity );
    Product findById(Long id);
}
