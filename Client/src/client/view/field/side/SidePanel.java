package client.view.field.side;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import commons.logic.Game;
import commons.logic.Player;
import commons.service.GlobalConstants;

import javax.swing.*;
import java.awt.*;

public class SidePanel extends JPanel {


    public SidePanel(Game game) {
        setBackground(GlobalConstants.COLOR_BACKGROUND);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));


        //---- gameName ----
        JLabel gameName = new JLabel();
        gameName.setText(GlobalConstants.TITLE_NAME);
        gameName.setFont(GlobalConstants.TITLE_FONT);
        gameName.setForeground(GlobalConstants.COLOR_FONT);
        gameName.setHorizontalAlignment(SwingConstants.CENTER);
        gameName.setToolTipText(GlobalConstants.TITLE_NAME);
        gameName.setAlignmentX(0.5F);
        add(gameName);

        add(Box.createRigidArea(GlobalConstants.VERTICAL_GAP_15));

        //---- yourMove ----
        JLabel yourMove = new JLabel();
        yourMove.setText(GlobalConstants.YOUR_MOVE_NAME);//TODO customize to wait
        yourMove.setAlignmentX(0.5F);
        yourMove.setForeground(GlobalConstants.COLOR_FONT);
        yourMove.setFont(GlobalConstants.YOUR_MOVE_FONT);
        add(yourMove);

        add(Box.createRigidArea(GlobalConstants.VERTICAL_GAP_10));

        //---- playerName ----
        JLabel playerName = new JLabel();
        playerName.setText("Player 1!");//TODO customize name
        playerName.setAlignmentX(0.5F);
        playerName.setForeground(GlobalConstants.COLOR_FONT);
        playerName.setFont(GlobalConstants.PLAYER_FONT);
        add(playerName);

        add(Box.createRigidArea(GlobalConstants.VERTICAL_GAP_10));

        //---- actionName ----
        JLabel actionName = new JLabel();
        actionName.setText(GlobalConstants.ACTION_BALL_NAME);//TODO customize action
        actionName.setAlignmentX(0.5F);
        actionName.setForeground(GlobalConstants.COLOR_FONT);
        actionName.setFont(GlobalConstants.YOUR_MOVE_FONT);
        add(actionName);

        add(Box.createRigidArea(GlobalConstants.VERTICAL_GAP_20));

        //======== wrapper ========
        JPanel wrapper = new JPanel();
        {
            wrapper.setBackground(GlobalConstants.COLOR_BACKGROUND);
            wrapper.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
            wrapper.add(new ScorePanel(game), new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
        }
        add(wrapper);
    }
}

