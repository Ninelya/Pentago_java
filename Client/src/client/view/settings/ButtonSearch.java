package client.view.settings;

import commons.service.GlobalConstants;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonSearch extends JButton {
    public ButtonSearch() {
        setText(GlobalConstants.SEARCH_GAME_NAME);
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

    }
}