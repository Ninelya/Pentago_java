package client.view.field.main;

import client.service.ConnectionInvoker;
import client.view.field.GameField;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import commons.logic.BallColor;
import commons.logic.Sector;
import commons.logic.SectorOrientation;
import commons.service.GlobalConstants;
import commons.service.commands.ComTurnLeft;
import commons.service.commands.ComTurnRight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class CirclesPanel extends JPanel {
    private int id;
    private SectorOrientation orientation;
    private List<CircleButton> circleButtons = new ArrayList<>();
    private Image background;
    private GameField gameField;
    private Sector sector;

    public CirclesPanel(Sector sector, int id, final GameField gameField) {
        this.gameField = gameField;
        this.id = id;
        setBackground(GlobalConstants.COLOR_BACKGROUND);
        setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1, true, true));
        setMaximumSize(GlobalConstants.SIZE_CIRCLE_PANEL);
        setMinimumSize(GlobalConstants.SIZE_CIRCLE_PANEL);
        setPreferredSize(GlobalConstants.SIZE_CIRCLE_PANEL);
        orientation = SectorOrientation.UP;
        background = new ImageIcon(GlobalConstants.IMG_PATH
                + GlobalConstants.IMG_SECTOR_UP).getImage();

        CircleButton button;
        for (int i = 1; i <= 3; i++)
            for (int j = 1; j <= 3; j++) {
                button = new CircleButton(sector.getBallById(10 * i + j),
                        true, BallColor.WHITE, 10 * i + j);
                button.setParent(this);
                this.add(button, new GridConstraints(i - 1, j - 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                circleButtons.add(button);
            }

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    turnBgLeft();
                    ConnectionInvoker.invoke(new ComTurnLeft(0, 11));
                } else if (SwingUtilities.isRightMouseButton(e)) {
                    turnBgRight();
                    ConnectionInvoker.invoke(new ComTurnRight(0, 11));
                } else if (SwingUtilities.isMiddleMouseButton(e)) //todo placeholder
                    ;

                setImage(orientation);
            }
        });
    }

    public void applyNewColors(BallColor[][] colors) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                circleButtons.get(i * 3 + j).setImage(colors[i][j]);
            }
    }

    public void turnBgLeft() {
        switch (orientation) {
            case UP:
                orientation = SectorOrientation.RIGHT;
                break;
            case RIGHT:
                orientation = SectorOrientation.DOWN;
                break;
            case DOWN:
                orientation = SectorOrientation.LEFT;
                break;
            case LEFT:
                orientation = SectorOrientation.UP;
                break;
        }
    }

    public void turnBgRight() {
        switch (orientation) {
            case UP:
                orientation = SectorOrientation.LEFT;
                break;
            case LEFT:
                orientation = SectorOrientation.DOWN;
                break;
            case DOWN:
                orientation = SectorOrientation.RIGHT;
                break;
            case RIGHT:
                orientation = SectorOrientation.UP;
                break;
        }
    }

    public void setImage(SectorOrientation orientation) {
        String fileName;
        switch (orientation) {
            case UP:
                fileName = GlobalConstants.IMG_SECTOR_UP;
                break;
            case RIGHT:
                fileName = GlobalConstants.IMG_SECTOR_RIGHT;
                break;
            case DOWN:
                fileName = GlobalConstants.IMG_SECTOR_DOWN;
                break;
            default:
                fileName = GlobalConstants.IMG_SECTOR_LEFT;
        }
        background = new ImageIcon(GlobalConstants.IMG_PATH + fileName).getImage();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, null);
    }

    public GameField getGameField() {
        return gameField;
    }

    public void setGameField(GameField gameField) {
        this.gameField = gameField;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
}
