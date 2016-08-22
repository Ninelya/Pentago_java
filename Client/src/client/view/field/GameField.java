package client.view.field;

import client.view.field.main.MainPanel;
import client.view.field.side.SidePanel;
import commons.logic.Game;
import commons.service.GlobalConstants;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class GameField extends JFrame {

    public static java.util.List<GameField> gameFields = new LinkedList<>();
    public int formId;
    private Container contentPane;
    public Game game;

    public static GameField getFieldById(int formId) {
        for (GameField field : gameFields) {
            if (field.formId == formId)
                return field;
        }
        return null;
    }

    public GameField(Game game) {
        super(GlobalConstants.TITLE_NAME);
        this.game = game;
        gameFields.add(this);
        formId = gameFields.indexOf(this);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.setBackground(GlobalConstants.COLOR_BACKGROUND);
        contentPane.add(new SidePanel(game), BorderLayout.LINE_START);//TODO customize SidePanel call
        contentPane.add(new MainPanel(game, this), BorderLayout.CENTER);//TODO customize MainPanel call
        pack();
    }

    public static void showMessage(GameField field, String message) {
        JOptionPane.showMessageDialog(field, message);
    }
}