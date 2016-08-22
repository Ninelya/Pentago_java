package client.service;

import client.view.ClientMainScreen;
import commons.service.Command;
import commons.service.GlobalConstants;
import commons.service.Respond;

import java.io.*;
import java.net.Socket;

public class ConnectionInvoker {

    public static void invoke(Command command) {
        try (Socket fromServer = new Socket(GlobalConstants.getHost(), GlobalConstants.getPort());
             ObjectOutputStream outputStream = new ObjectOutputStream(new BufferedOutputStream(
                     fromServer.getOutputStream()));
             BufferedInputStream bufferedInputStream = new BufferedInputStream(
                     fromServer.getInputStream())) {
            outputStream.writeObject(command);
            outputStream.flush();


            //wait for answer from server
            ObjectInputStream inputStream = new ObjectInputStream(bufferedInputStream);
            Respond respond = (Respond) inputStream.readObject();
            ConnectionListener.process(respond);
        } catch (IOException | ClassNotFoundException e) {
            ClientMainScreen.showMessage(GlobalConstants.FAILED_CONNECTION);
            e.printStackTrace();
        }
    }
}