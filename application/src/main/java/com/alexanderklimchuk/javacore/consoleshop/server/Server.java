package com.alexanderklimchuk.javacore.consoleshop.server;

import com.alexanderklimchuk.javacore.consoleshop.exception.ConnectionException;
import com.alexanderklimchuk.javacore.consoleshop.service.ServerService;

import com.alexanderklimchuk.javacore.consoleshop.model.Catalog;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.net.Socket;

public class Server implements Runnable {

    private final ServerService serverService;
    private final Socket clientSocket;
    private Catalog catalog;

    public Server(ServerService serverService, Socket clientSocket, Catalog catalog) {
        this.serverService = serverService;
        this.clientSocket = clientSocket;
        this.catalog = catalog;
    }

    @Override
    public void run() {
        try (clientSocket;
             ObjectOutputStream clientOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());
             ObjectInputStream clientInputStream = new ObjectInputStream(clientSocket.getInputStream())) {
            serverService.answerOnClientsRequests(clientOutputStream, clientInputStream, catalog);
        } catch (IOException | ClassNotFoundException ex) {
            throw new ConnectionException("Problem with client connection to server. Check server connection settings! ", ex);
        }
    }

}