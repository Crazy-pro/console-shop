package com.alexanderklimchuk.javacore.consoleshop.service.impl;

import com.alexanderklimchuk.javacore.consoleshop.repository.ProductRepository;
import com.alexanderklimchuk.javacore.consoleshop.service.ProductService;
import com.alexanderklimchuk.javacore.consoleshop.model.Product;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

}