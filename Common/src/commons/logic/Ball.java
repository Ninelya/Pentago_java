package commons.logic;


import java.io.Serializable;

public class Ball implements Serializable {
    public Sector sector;
    private BallColor color;
    private int id;


    Ball(BallColor color, Sector sector, int id) {
        this.color = color;
        this.sector = sector;
        this.id = id;
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

    public void setColor(BallColor color) {
        this.color = color;
    }


}
