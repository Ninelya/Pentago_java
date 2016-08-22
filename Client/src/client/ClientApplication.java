package client;

import client.view.ClientMainScreen;
import client.view.settings.SettingsWindow;

import java.awt.event.WindowEvent;


class ClientApplication {
    public static void main(String[] args) {
        ClientMainScreen client = new ClientMainScreen();//to show modal windows properly
    //   client.setVisible(true);
        new SettingsWindow().setVisible(true);
    }
}