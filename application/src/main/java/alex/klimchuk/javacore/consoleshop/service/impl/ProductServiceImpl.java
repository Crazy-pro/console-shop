package alex.klimchuk.javacore.consoleshop.service.impl;

import alex.klimchuk.javacore.consoleshop.model.Product;
import alex.klimchuk.javacore.consoleshop.repository.ProductRepository;
import alex.klimchuk.javacore.consoleshop.service.ProductService;

/**
 * Copyright Alex Klimchuk (c) 2019.
 */
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