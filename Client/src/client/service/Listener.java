package client.service;

import client.view.field.GameField;
import commons.service.Respond;
import commons.service.commands.RespColorBall;
import commons.service.commands.RespNewGame;

public class Listener {
    public static void newGame(Respond respond) {
        RespNewGame res = (RespNewGame) respond;
        new GameField(res.game).setVisible(true);
    }

    public static void colorBall(Respond respond) {
        RespColorBall res = (RespColorBall) respond;

    }
}

