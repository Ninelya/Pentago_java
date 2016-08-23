package client.view.settings;

import client.service.ConnectionInvoker;
import client.view.ClientMainScreen;
import commons.logic.Settings;
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
            new Settings(
                    parentWindow.getPlayersNum(),
                    parentWindow.getSectorsNum(),
                    parentWindow.getPlayerName()
            );
            ConnectionInvoker.invoke(new ComNewGame(Settings.instance, 0));//single frame for a new game
            parentWindow.setVisible(false);
        }
    }
}
