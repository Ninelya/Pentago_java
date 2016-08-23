package commons.service;

import java.awt.*;
import java.nio.file.Paths;


public class GlobalConstants {

    //path for images

    public static final String IMG_PATH = Paths.get("").toAbsolutePath().toString() +
            "\\Common\\src\\commons\\img\\";
    public static final String IMG_BALL_WHITE = "ball_white.gif";
    public static final String IMG_BALL_BLUE = "ball_blue.gif";
    public static final String IMG_BALL_BLACK = "ball_black.gif";
    public static final String IMG_BALL_BROWN = "ball_brown.gif";
    public static final String IMG_BALL_CYAN = "ball_cyan.gif";
    public static final String IMG_BALL_GREEN = "ball_green.gif";
    public static final String IMG_BALL_MAGENTA = "ball_magenta.gif";
    public static final String IMG_BALL_RED = "ball_red.gif";
    public static final String IMG_BALL_YELLOW = "ball_yellow.gif";

    public static final String IMG_SECTOR_UP = "sector_up.gif";
    public static final String IMG_SECTOR_RIGHT = "sector_right.gif";
    public static final String IMG_SECTOR_DOWN = "sector_down.gif";
    public static final String IMG_SECTOR_LEFT = "sector_left.gif";

    //Dimensions
    static public final int SIZE_189 = 189;
    static public final int SIZE_100 = 100;
    static public final int SIZE_35 = 35;
    static public final int SIZE_20 = 20;
    static public final int SIZE_23 = 23;
    static public final int SIZE_15 = 15;
    static public final int SIZE_10 = 10;
    private static final int SIZE_500 = 500;
    private static final int SIZE_700 = 700;

    static public final Dimension SIZE_CIRCLE = new Dimension(SIZE_35, SIZE_35);
    static public final Dimension SIZE_CIRCLE_PANEL = new Dimension(SIZE_189, SIZE_189);
    static public final Dimension VERTICAL_GAP_15 = new Dimension(2, SIZE_15);
    static public final Dimension VERTICAL_GAP_10 = new Dimension(2, SIZE_10);
    static public final Dimension VERTICAL_GAP_20 = new Dimension(2, SIZE_20);
    static public final Dimension HORISONTAL_GAP_10 = new Dimension(SIZE_10, 2);
    static public final Dimension SIZE_INPUT = new Dimension(SIZE_100, SIZE_23);
    static public final Dimension SIZE_SERVER = new Dimension(SIZE_700, SIZE_500);


    public static Dimension getSizeMainPanel(int quantity) {
        int a = SIZE_189 * quantity + (quantity - 1) * SIZE_20;
        return new Dimension(a, a);
    }

    //Design
    static public final Color COLOR_BACKGROUND = new Color(204, 102, 51);
    static public final Color COLOR_FONT = new Color(247, 235, 200);

    public static final Font TITLE_FONT = new Font("Arial", Font.BOLD | Font.ITALIC, 60);
    public static final Font YOUR_MOVE_FONT = new Font("Arial", Font.PLAIN, 20);
    public static final Font PLAYER_FONT = new Font("Arial", Font.BOLD, 30);
    public static final Font PLAYER_FONT_SMALL = new Font("Arial", Font.PLAIN, 15);
    public static final Font SETTINGS_FONT = new Font("Arial", Font.BOLD, 15);

    public static final String TITLE_NAME = "Pentago";
    public static final String YOUR_MOVE_NAME = "Your move";
    public static final String WAIT_FOR_YOUR_MOVE_NAME = "Wait for your move";
    public static final String ACTION_BALL_NAME = "Select a ball";
    public static final String ACTION_PANEL_NAME = "Turn a sector";
    public static final String SETTINGS_NAME = "Pentago settings";
    public static final String SECTOR_NUM_NAME = "Number of sectors:";
    public static final String PLAYERS_NUM_NAME = "Number of players:";
    public static final String NEW_GAME_NAME = "New game";
    public static final String SEARCH_GAME_NAME = "Search";
    public static final String LOAD_GAME_NAME = "Load";
    public static final String ENTER_YOUR_NAME = "Enter your name:";
    public static final String ACTIVE_GAMES = "Active games:";
    public static final String FAILED_CONNECTION = "Unable to set a connection with Server.";

    public static final String[] SECTOR_NUM_LIST = new String[]{
            "4 (2x2)",
            "9 (3x3)",
            "16 (4x4)",
            "25 (5x5)"
    };
    public static final String[] PLAYERS_NUM_LIST = new String[]{
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8"
    };

    public static String getHost() {
        return "localhost";
    }

    public static int getPort() {
        return 3128;
    }

    public static int getClients() {
        return 20;
    }
}