package alex.klimchuk.javacore.consoleshop.service;

import alex.klimchuk.javacore.consoleshop.order.Order;

import java.util.List;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
public interface OrderService {

    List<Order> getOrders();

    void createOrder(String productName);

    void performFramedOrders();

    void completePerformedOrders();

}
