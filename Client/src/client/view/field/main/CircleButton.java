package client.view.field.main;

import client.service.ConnectionInvoker;
import commons.logic.Ball;
import commons.logic.BallColor;
import commons.service.GlobalConstants;
import commons.service.commands.ComColorBall;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CircleButton extends JButton {
    public CirclesPanel parent;
    private Image image;
    private int id;
    private boolean isClickable;
    private Ball ball;

    private boolean isColored;

    public CircleButton(Ball ball, boolean isClickable, BallColor color, int id) {
        this.id = id;
        setImage(color);
        this.isClickable = isClickable;
        isColored = false;
        this.ball = ball;

        setOpaque(false);
        setContentAreaFilled(false);
        setBorder(null);
        setMaximumSize(GlobalConstants.SIZE_CIRCLE);
        setMinimumSize(GlobalConstants.SIZE_CIRCLE);
        setPreferredSize(GlobalConstants.SIZE_CIRCLE);
        setFocusable(false);
        setFocusPainted(false);


        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                clickMouse();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }

    //TODO customize to active player
    public void clickMouse() {
        if (isClickable && !isColored) {
            BallColor color = parent.gameField.game.getActivePlayer().getColor();
            setImage(color);
            isColored = true;
            ConnectionInvoker.invoke(new ComColorBall(parent.gameField.formId, ball, color));
        }
    }

    public void setImage(BallColor color) {
        String colorName;
        switch (color) {
            case RED:
                colorName = GlobalConstants.IMG_BALL_RED;
                break;
            case GREEN:
                colorName = GlobalConstants.IMG_BALL_GREEN;
                break;
            case BLUE:
                colorName = GlobalConstants.IMG_BALL_BLUE;
                break;
            case CYAN:
                colorName = GlobalConstants.IMG_BALL_CYAN;
                break;
            case MAGENTA:
                colorName = GlobalConstants.IMG_BALL_MAGENTA;
                break;
            case YELLOW:
                colorName = GlobalConstants.IMG_BALL_YELLOW;
                break;
            case BLACK:
                colorName = GlobalConstants.IMG_BALL_BLACK;
                break;
            case BROWN:
                colorName = GlobalConstants.IMG_BALL_BROWN;
                break;
            default:
                colorName = GlobalConstants.IMG_BALL_WHITE;
        }

        image = new ImageIcon(GlobalConstants.IMG_PATH + colorName)
                .getImage()
                .getScaledInstance(GlobalConstants.SIZE_35, GlobalConstants.SIZE_35, Image.SCALE_SMOOTH);
        repaint();
    }

    public boolean isColored() {
        return isColored;
    }

    public void setColored(boolean colored) {
        isColored = colored;
    }


}

