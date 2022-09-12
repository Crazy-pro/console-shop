package alex.klimchuk.javacore.consoleshop.service.impl;

import alex.klimchuk.javacore.consoleshop.model.Catalog;
import alex.klimchuk.javacore.consoleshop.service.ServerService;
import alex.klimchuk.javacore.consoleshop.service.OrderService;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

/**
 * Copyright Alex Klimchuk (c) 2019.
 */
public class ServerServiceImpl implements ServerService {

    private final OrderService orderService;

    public ServerServiceImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void answerOnClientsRequests(ObjectOutputStream clientOutputStream, ObjectInputStream clientInputStream,
                                        Catalog catalog) throws IOException, ClassNotFoundException {
        while (true) {
            int serverChoice = (int) clientInputStream.readObject();
            switch (serverChoice) {
                case 1:
                    transferCatalog(clientOutputStream, catalog);
                    break;
                case 2:
                    createOrder(clientInputStream);
                    break;
                case 3:
                    transferOrders(clientOutputStream);
                    break;
                case 4:
                    return;
            }
        }
    }

    private void transferCatalog(ObjectOutputStream clientOutputStream, Catalog catalog) throws IOException {
        clientOutputStream.writeObject(catalog);
    }

    private void createOrder(ObjectInputStream clientInputStream) throws IOException, ClassNotFoundException {
        String productName = (String) clientInputStream.readObject();
        orderService.createOrder(productName);
    }

    private void transferOrders(ObjectOutputStream clientOutputStream) throws IOException {
        clientOutputStream.writeObject(orderService.getOrders());
    }

}