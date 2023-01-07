package alex.klimchuk.javacore.consoleshop.service;

import alex.klimchuk.javacore.consoleshop.model.Catalog;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
public interface ServerService {

    void answerOnClientsRequests(ObjectOutputStream clientOutputStream, ObjectInputStream clientInputStream,
                                 Catalog catalog) throws IOException, ClassNotFoundException;

}
