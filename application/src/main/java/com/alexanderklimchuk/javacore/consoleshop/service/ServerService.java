package com.alexanderklimchuk.javacore.consoleshop.service;

import com.alexanderklimchuk.javacore.consoleshop.model.Catalog;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public interface ServerService {

    void answerOnClientsRequests(ObjectOutputStream clientOutputStream, ObjectInputStream clientInputStream,
                                 Catalog catalog) throws IOException, ClassNotFoundException;

}