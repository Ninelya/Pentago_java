package commons.service.commands;


import commons.service.Command;
import commons.service.CommandType;

import java.io.Serializable;

public class ComNewGame implements Command, Serializable {
    public final int numPlayers;
    public final int numSectors;
    public final String firstPlayerName;
    public final int formId;

    public ComNewGame(int numPlayers, int numSectors, String firstPlayerName, int formId) {
        this.numPlayers = numPlayers;
        this.numSectors = numSectors;
        this.firstPlayerName = firstPlayerName;
        this.formId = formId;
    }

    @Override
    public CommandType getType() {
        return CommandType.NEW_GAME;
    }
}
