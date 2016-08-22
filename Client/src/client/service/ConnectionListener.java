package client.service;


import commons.service.Respond;

class ConnectionListener {

    static void process(Respond respond) {
        switch (respond.getType()) {
            case TURN_SECTOR_RIGHT:
                break;
            case TURN_SECTOR_LEFT:
                break;
            case COLOR_BALL:
                Listener.colorBall(respond);
                break;
            case NEW_GAME:
                Listener.newGame(respond);
                break;
            case LOAD_GAME:
                break;
            case RET_ERROR:
                break;
        }

    }
}

