package com.flexibledev.tobaccoshop.services.impl;

import com.flexibledev.tobaccoshop.entities.Product;
import com.flexibledev.tobaccoshop.repositories.ProductRepository;
import com.flexibledev.tobaccoshop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(long id) {
        return productRepository.findById(id).orElseThrow();
    }

}
