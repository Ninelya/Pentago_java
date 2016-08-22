package commons.service.commands;


import commons.logic.Game;
import commons.service.Respond;
import commons.service.RespondType;

import java.io.Serializable;

public class RespNewGame implements Respond, Serializable {
    public Game game;

    public RespNewGame(Game game) {
        this.game = game;
    }

    @Override
    public RespondType getType() {
        return RespondType.NEW_GAME;
    }
}