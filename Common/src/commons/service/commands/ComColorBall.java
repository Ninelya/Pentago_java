package commons.service.commands;


import commons.logic.Ball;
import commons.logic.BallColor;
import commons.service.Command;
import commons.service.CommandType;

import java.io.Serializable;

public class ComColorBall implements Command, Serializable {
    public final Ball ball;
    public final BallColor newColor;
    public final int circlesPanelId;

    public ComColorBall(int circlesPanelId, Ball ball, BallColor newColor) {
        this.ball = ball;
        this.newColor = newColor;
        this.circlesPanelId = circlesPanelId;
    }

    @Override
    public CommandType getType() {
        return CommandType.COLOR_BALL;
    }
}
