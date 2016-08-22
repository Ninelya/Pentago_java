package server;

import server.service.ConnectionsManager;
import server.view.ServerMainScreen;


public class ServerApplication {
    public static void main(String[] args) throws Exception {
        new ServerMainScreen().render();
        try (ConnectionsManager manager = new ConnectionsManager()) {
            manager.listenConnections();
        }
    }

}
