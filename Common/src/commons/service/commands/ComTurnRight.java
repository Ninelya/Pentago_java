package commons.service.commands;


import commons.service.Command;
import commons.service.CommandType;

import java.io.Serializable;

public class ComTurnRight implements Command, Serializable {
    public final int gameId;
    public final int sectorId;

    public ComTurnRight(int gameId, int sectorId) {
        this.gameId = gameId;
        this.sectorId = sectorId;
    }

    @Override
    public CommandType getType() {
        return CommandType.TURN_SECTOR_RIGHT;
    }
}
