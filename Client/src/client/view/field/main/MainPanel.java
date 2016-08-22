package client.view.field.main;

import client.view.field.GameField;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import commons.logic.Game;
import commons.service.GlobalConstants;

import javax.swing.*;
import java.awt.*;


public class MainPanel extends JPanel {

    public GameField gameField;

    public MainPanel(Game game, GameField gameField) {
        this.gameField = gameField;
        setBackground(GlobalConstants.COLOR_BACKGROUND);
        setPreferredSize(GlobalConstants.getSizeMainPanel(game.getNumSectors()));
        setMinimumSize(GlobalConstants.getSizeMainPanel(game.getNumSectors()));
        setMaximumSize(GlobalConstants.getSizeMainPanel(game.getNumSectors()));
        setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), 0, 0));

        /* so the field doesn't stretch when window is resized */
        JPanel wrapper = new JPanel();
        {
            wrapper.setLayout(new GridLayoutManager(game.getNumSectors(),
                    game.getNumSectors(), new Insets(0, 0, 0, 0), 0, 0));
            wrapper.setBackground(GlobalConstants.COLOR_BACKGROUND);
            wrapper.setPreferredSize(GlobalConstants.getSizeMainPanel(game.getNumSectors()));
            wrapper.setMinimumSize(GlobalConstants.getSizeMainPanel(game.getNumSectors()));
            wrapper.setMaximumSize(GlobalConstants.getSizeMainPanel(game.getNumSectors()));

            for (int i = 1; i <= game.getNumSectors(); i++) {
                for (int j = 1; j <= game.getNumSectors(); j++) {
                    wrapper.add(new CirclesPanel(game.getSectorById(i * 10 + j),
                                    i * 10 + j, gameField),
                            new GridConstraints(i - 1, j - 1, 1, 1,
                                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                    null, null, null));
                }
            }
        }
        this.add(wrapper, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
    }
}
