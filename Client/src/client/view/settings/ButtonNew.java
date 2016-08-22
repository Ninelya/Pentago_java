package client.view.settings;

import client.service.ConnectionInvoker;
import client.view.ClientMainScreen;
import commons.service.GlobalConstants;
import commons.service.commands.ComNewGame;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

public class ButtonNew extends JButton {
    private SettingsWindow parentWindow;

    public ButtonNew(SettingsWindow parentWindow) {
        this.parentWindow = parentWindow;
        setText(GlobalConstants.NEW_GAME_NAME);
        setBackground(GlobalConstants.COLOR_FONT);
        setFocusable(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                clickMouse();
            }
        });
    }

    private void clickMouse() {
        if (parentWindow.getPlayerName().isEmpty())
            JOptionPane.showMessageDialog(
                    ClientMainScreen.instance,
                    "Please, enter your name.");
        else {
            ConnectionInvoker.invoke(new ComNewGame(
                    parentWindow.getPlayersNum(),
                    parentWindow.getSectorsNum(),
                    parentWindow.getPlayerName(),
                    0));//single frame for a new game
            parentWindow.setVisible(false);
        }
    }
}
