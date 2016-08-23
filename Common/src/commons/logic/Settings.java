package commons.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Settings implements Serializable {
    private int sectorsNumber;
    private int playersNumber;
    public List<String> names  = new ArrayList<>();

    public Settings(int sectorsNumber, int playersNumber, String name){
        this.playersNumber = playersNumber;
        this.sectorsNumber = sectorsNumber;
        addName(name);
    }

    public void addName(String name){
        names.add(name);
    }

    public int getSectorsNumber() {
        return sectorsNumber;
    }

    public void setSectorsNumber(int sectorsNumber) {
        this.sectorsNumber = sectorsNumber;
    }

    public int getPlayersNumber() {
        return playersNumber;
    }

    public void setPlayersNumber(int playersNumber) {
        this.playersNumber = playersNumber;
    }
}
