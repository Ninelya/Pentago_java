package client.view.field.side;

import client.view.field.main.CircleButton;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import commons.logic.BallColor;
import commons.logic.Player;
import commons.service.GlobalConstants;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel {
    Player player;

    public PlayerPanel(Player player) {
        this.player = player;
        setBackground(GlobalConstants.COLOR_BACKGROUND);
        setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));

        //---- CircleButton ----
        //TODO customize according to player
        add(new CircleButton(null, false, player.getColor(), 0), new GridConstraints(0, 0, 2, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

        //---- playerNameSmall ----
        JLabel playerNameSmall = new JLabel();
        playerNameSmall.setText(player.getName());//TODO customize player name
        playerNameSmall.setForeground(GlobalConstants.COLOR_FONT);
        playerNameSmall.setFont(GlobalConstants.PLAYER_FONT_SMALL);
        add(playerNameSmall, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_SOUTHWEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

        //---- score ----
        JLabel score = new JLabel();
        score.setText("55");//TODO customize score
        score.setAlignmentY(0.0F);
        score.setForeground(GlobalConstants.COLOR_FONT);
        score.setFont(GlobalConstants.PLAYER_FONT_SMALL);
        add(score, new GridConstraints(1, 1, 1, 1,
                GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
    }
}
