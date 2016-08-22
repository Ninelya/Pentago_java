package commons.service.commands;


import commons.service.Command;
import commons.service.CommandType;

import java.io.Serializable;

public class ComTurnLeft implements Command, Serializable {
    public final int gameId;
    public final int sectorId;

    @Override
    public CommandType getType() {
        return CommandType.TURN_SECTOR_LEFT;
    }

    public ComTurnLeft(int gameId, int sectorId) {
        this.gameId = gameId;
        this.sectorId = sectorId;

    }
}
