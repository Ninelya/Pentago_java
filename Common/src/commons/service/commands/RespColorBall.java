package commons.service.commands;


import commons.logic.BallColor;
import commons.logic.Game;
import commons.logic.Sector;
import commons.service.Respond;
import commons.service.RespondType;

import java.io.Serializable;

public class RespColorBall implements Respond, Serializable {
    public Sector sector;
    public BallColor[][] colorMatrix;

    public RespColorBall(Sector sector, BallColor[][] colorMatrix) {
        this.sector = sector;
        this.colorMatrix = colorMatrix;

    }

    @Override
    public RespondType getType() {
        return RespondType.COLOR_BALL;
    }
}