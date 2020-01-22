package com.alexanderklimchuk.javacore.consoleshop.service;

import com.alexanderklimchuk.javacore.consoleshop.order.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrders();

    void createOrder(String productName);

    void performFramedOrders();

    void completePerformedOrders();

}