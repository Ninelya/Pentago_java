package commons.logic;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Sector implements Serializable {
    public List<Ball> balls = new ArrayList<>();
    private int id;
    private SectorOrientation orientation;
    public Game game;
    BallColor[][] colors;

    Sector(Game game, int id) {
        this.game = game;
        this.id = id;
        orientation = SectorOrientation.UP;
        colors = new BallColor[3][3];

        for (int i = 1; i <= 3; i++)
            for (int j = 1; j <= 3; j++) {
                balls.add(new Ball(BallColor.WHITE, this, i * 10 + j));
                colors[i - 1][j - 1] = BallColor.WHITE;
            }
    }

    public BallColor[][] colorBall(Ball ball, BallColor color) {
        int x = ball.getId() / 10 - 1;
        int y = ball.getId() % 10 - 1;
        colors[x][y] = color;
        return colors;
    }

    //TODO turns

    public SectorOrientation getOrientation() {
        return orientation;
    }

    public void setOrientation(SectorOrientation orientation) {
        this.orientation = orientation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Ball getBallById(int i) {
        for (Ball ball : balls)
            if (ball.getId() == i)
                return ball;
        return null;
    }
}
