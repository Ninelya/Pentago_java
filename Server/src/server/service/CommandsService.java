package server.service;


import commons.service.Command;
import commons.service.Respond;
import server.view.ServerMainScreen;

public class CommandsService {

    public static Object handleCommand(Command command) {
        Respond respond = null;
        ServerMainScreen.log("Executing: " + command);
        switch (command.getType()) {
            case COLOR_BALL:
                respond = Exec.doColorBall(command);
                break;
            case LOAD_GAME:
                respond = Exec.doLoadGame(command);
                break;
            case NEW_GAME:
                respond = Exec.doNewGame(command);
                break;
            case TURN_SECTOR_LEFT:
                respond = Exec.doTurnSectorLeft();
                break;
            case TURN_SECTOR_RIGHT:
                respond = Exec.doTurnSectorRight(command);
                break;
        }
        return respond; //ответная команда клиенту
    }
}
