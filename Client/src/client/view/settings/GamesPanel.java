package client.view.settings;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import commons.service.GlobalConstants;

import javax.swing.*;
import java.awt.*;


public class GamesPanel extends JPanel {

    public GamesPanel() {
        setBackground(GlobalConstants.COLOR_BACKGROUND);
        setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        ButtonGroup bg = new ButtonGroup();
        int count = 5;//TODO customize
        JRadioButton radioButton;
        int a = 0;
        for (int i = 0; i < count / 2 + count % 2; i++) {
            for (int j = 0; j < 2 && ++a <= count; j++) {
                radioButton = new JRadioButton();
                radioButton.setText("game " + a);//TODO  customize according to stored games
                radioButton.setFont(GlobalConstants.PLAYER_FONT_SMALL);
                radioButton.setForeground(GlobalConstants.COLOR_FONT);
                radioButton.setBackground(GlobalConstants.COLOR_BACKGROUND);
                bg.add(radioButton);
                add(radioButton, new GridConstraints(i, j, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
            }
        }
    }
}