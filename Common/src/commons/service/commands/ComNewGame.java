package commons.service.commands;



import commons.logic.Settings;
import commons.service.Command;
import commons.service.CommandType;

import java.io.Serializable;

public class ComNewGame implements Command, Serializable {
    public final Settings settings;
    public final int formId;

    public ComNewGame(Settings settings, int formId) {
        this.settings = settings;
        this.formId = formId;
    }

    @Override
    public CommandType getType() {
        return CommandType.NEW_GAME;
    }
}
