package server.view;

import commons.service.GlobalConstants;

import javax.swing.*;
import java.awt.*;

public class ServerMainScreen extends JFrame {
    private static ServerMainScreen instance;

    private final JPanel server;
    private final JTextArea logger;

    public ServerMainScreen() {
        logger = new JTextArea();
        server = new JPanel();

        JScrollPane scrollPane1 = new JScrollPane();

        instance = this;

        //======== server ========
        {
            server.setBackground(GlobalConstants.COLOR_BACKGROUND);
            server.setPreferredSize(GlobalConstants.SIZE_SERVER);
            server.setLayout(new FlowLayout());

            //======== scrollPane1 ========
            {
                //---- logger ----
                logger.setColumns(60);
                logger.setRows(20);
                logger.setLineWrap(true);
                logger.setWrapStyleWord(true);
                scrollPane1.setViewportView(logger);
            }
            server.add(scrollPane1);
        }
    }

    public void render() {
        JFrame frame = new JFrame(GlobalConstants.TITLE_NAME);
        frame.setContentPane(ServerMainScreen.instance.server);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }

    public static void log(String s) {
        instance.logger.append(s + "\n");
        instance.logger.setCaretPosition(instance.logger.getDocument().getLength());
        instance.server.updateUI();
    }
}