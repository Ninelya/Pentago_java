package server.service;

import commons.logic.BallColor;
import commons.logic.Game;
import commons.service.Command;
import commons.service.RespError;
import commons.service.Respond;
import commons.service.commands.ComColorBall;
import commons.service.commands.ComNewGame;
import commons.service.commands.RespColorBall;
import commons.service.commands.RespNewGame;


public class Exec {
    public static Respond doColorBall(Command command) {
        ComColorBall com = (ComColorBall) command;
        BallColor[][] newColors = com.ball.getSector().colorBall(com.ball, com.newColor);
        return new RespColorBall(com.ball.getSector(), newColors);
    }

    public static Respond doLoadGame(Command command) {
        return new RespError();
    }

    public static Respond doNewGame(Command command) {
        ComNewGame com = (ComNewGame) command;
        Game newGame = new Game(
                com.settings.getPlayersNumber(),
                com.settings.getSectorsNumber(),
                com.settings.names.get(0),
                com.formId);
        Respond respond = new RespNewGame(newGame);
        return respond;
    }

    public static Respond doTurnSectorLeft() {

        return new RespError();
    }

    public static Respond doTurnSectorRight(Command command) {
        return new RespError();
    }
}
