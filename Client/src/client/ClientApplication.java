package client;

import client.view.ClientMainScreen;
import client.view.settings.SettingsWindow;

import javax.swing.*;


class ClientApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ClientMainScreen client = new ClientMainScreen();//to show modal windows properly
                //   client.setVisible(true);
                new SettingsWindow().setVisible(true);
            }
        });
    }
}