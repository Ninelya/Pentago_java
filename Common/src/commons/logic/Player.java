package commons.logic;

import java.io.Serializable;

public class Player implements Serializable {//TODO implement Player class
    private String name;
    private int id;
    private BallColor color;
    private Game game;
    public int score;

    public Player(Game game, String name, int id) {
        this.name = name;
        this.game = game;
        this.id = id;
        score = 0;

        setColor();
    }

    public void setColor() {
        switch (id) {
            case 0:
                color = BallColor.RED;
                break;
            case 1:
                color = BallColor.YELLOW;
                break;
            case 2:
                color = BallColor.GREEN;
                break;
            case 3:
                color = BallColor.CYAN;
                break;
            case 4:
                color = BallColor.BLUE;
                break;
            case 5:
                color = BallColor.MAGENTA;
                break;
            case 6:
                color = BallColor.BROWN;
                break;
            case 7:
                color = BallColor.BLACK;
                break;

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BallColor getColor() {
        return color;
    }


}
