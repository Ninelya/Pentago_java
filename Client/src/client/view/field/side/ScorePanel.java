package client.view.field.side;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import commons.logic.Game;
import commons.logic.Player;
import commons.service.GlobalConstants;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ScorePanel extends JPanel {

    ScorePanel(Game game) {
        int rownumber = 1;
        int quantity = game.getNumPlayers();
        if (quantity > 2) {
            rownumber = quantity / 2;
            if (quantity % 2 > 0)
                rownumber++;
        }
        setBackground(GlobalConstants.COLOR_BACKGROUND);
        setLayout(new GridLayoutManager(rownumber, 2, new Insets(0, 0, 0, 0), -1, -1));

        int a = 0;
        Player player;
        for (int i = 0; i < rownumber; i++)
            for (int j = 0; j < 2 && ++a <= quantity; j++) {
                player = a >= 2 ? new Player(game, "System", a - 1) : game.players.get(a - 1);
                add(new PlayerPanel(player), //TODO customize
                        new GridConstraints(i, j, 1, 1,
                                GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));
            }
    }
}
