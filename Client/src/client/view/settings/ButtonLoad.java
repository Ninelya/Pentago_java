package client.view.settings;

import commons.service.GlobalConstants;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonLoad extends JButton {
    public ButtonLoad() {
        setText(GlobalConstants.LOAD_GAME_NAME);
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