package com.alexanderklimchuk.javacore.consoleshop.repository;

import com.alexanderklimchuk.javacore.consoleshop.model.Product;

public interface ProductRepository {

    void save(Product product);

}