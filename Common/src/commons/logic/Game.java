package commons.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Game implements Serializable { //TODO implement
    //public static List<Game> games = new LinkedList<>();
    public List<Integer> fieldIds = new LinkedList<>();
    public static Game instance;
    //private int id;
    private Player activePlayer;
    private int numSectors;//num of sectors


    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    private int numPlayers;//max quantity of players

    public List<Player> players = new ArrayList<>();
    public List<Sector> sectors = new ArrayList<>();

    public Game(int numPlayers, int numSectors, String firstPlayerName, int initialFieldId) {
        Player firstPlayer = new Player(this, firstPlayerName, players.size());
        players.add(firstPlayer);
        this.numSectors = numSectors;
        activePlayer = firstPlayer;
        instance = this;
        this.numPlayers = numPlayers;
        fieldIds.add(initialFieldId);
        //this.id = games.size();

        for (int i = 0; i < numSectors; i++)
            for (int j = 0; j < numSectors; j++) {
                sectors.add(new Sector(this, (i + 1) * 10 + j + 1));
            }
    }

    //todo addplayer(),
    //todo saveGame()

    /* public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }
 */
    public Player getActivePlayer() {
        return activePlayer;
    }

    public void setActivePlayer(Player activePlayer) {
        this.activePlayer = activePlayer;
    }

    public int getNumSectors() {
        return numSectors;
    }

    public void setNumSectors(int numSectors) {
        this.numSectors = numSectors;
    }


    public Sector getSectorById(int i) {
        for (Sector sector : sectors)
            if (sector.getId() == i)
                return sector;
        return null;
    }
}
