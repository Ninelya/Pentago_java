package client.view.settings;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import commons.service.GlobalConstants;

import javax.swing.*;
import java.awt.*;

public class SettingsWindow extends JFrame {

    JComboBox<String> comboSectors;
    JComboBox<String> comboPlayers;
    JTextField playerName;
    public static SettingsWindow instance;

    public SettingsWindow() {
        //======== this ========
        instance = this;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(GlobalConstants.SETTINGS_NAME);
        setBackground(GlobalConstants.COLOR_BACKGROUND);
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), 0, 0));

        //======== panel1 ========
        JPanel panel1 = new JPanel();
        {
            panel1.setBackground(GlobalConstants.COLOR_BACKGROUND);
            panel1.setLayout(new GridLayoutManager(6, 4, new Insets(0, 0, 0, 0), 10, 10));

            //======== label1 ========
            JLabel label1 = new JLabel();
            panel1.add(label1, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            JLabel label2 = new JLabel();
            panel1.add(label2, new GridConstraints(1, 3, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- numSectors ----
            JLabel numSectors = new JLabel();
            numSectors.setFont(GlobalConstants.SETTINGS_FONT);
            numSectors.setForeground(GlobalConstants.COLOR_FONT);
            numSectors.setText(GlobalConstants.SECTOR_NUM_NAME);
            panel1.add(numSectors, new GridConstraints(1, 1, 1, 1,
                    GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- comboSectors ----
            comboSectors = new JComboBox<>();
            comboSectors.setModel(new DefaultComboBoxModel<>(GlobalConstants.SECTOR_NUM_LIST));
            panel1.add(comboSectors, new GridConstraints(1, 2, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- numPlayers ----
            JLabel numPlayers = new JLabel();
            numPlayers.setFont(GlobalConstants.SETTINGS_FONT);
            numPlayers.setForeground(GlobalConstants.COLOR_FONT);
            numPlayers.setText(GlobalConstants.PLAYERS_NUM_NAME);
            panel1.add(numPlayers, new GridConstraints(2, 1, 1, 1,
                    GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- comboPlayers ----
            comboPlayers = new JComboBox<>();
            comboPlayers.setModel(new DefaultComboBoxModel<>(GlobalConstants.PLAYERS_NUM_LIST));
            panel1.add(comboPlayers, new GridConstraints(2, 2, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- playerNameLabel ----
            JLabel playerNameLabel = new JLabel();
            playerNameLabel.setFont(GlobalConstants.SETTINGS_FONT);
            playerNameLabel.setForeground(GlobalConstants.COLOR_FONT);
            playerNameLabel.setText(GlobalConstants.ENTER_YOUR_NAME);
            playerNameLabel.setHorizontalTextPosition(SwingConstants.LEFT);
            playerNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
            panel1.add(playerNameLabel, new GridConstraints(3, 1, 1, 1,
                    GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- playerName ----
            playerName = new JTextField();
            playerName.setMaximumSize(GlobalConstants.SIZE_INPUT);
            playerName.setPreferredSize(GlobalConstants.SIZE_INPUT);
            playerName.setMinimumSize(GlobalConstants.SIZE_INPUT);
            panel1.add(playerName, new GridConstraints(3, 2, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- buttonSearch ----
            panel1.add(new ButtonSearch(), new GridConstraints(4, 1, 1, 2,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //======== panel3 ========
            JPanel panel3 = new JPanel();
            {
                panel3.setBackground(GlobalConstants.COLOR_BACKGROUND);
                panel3.setLayout(new GridLayoutManager(5, 4, new Insets(0, 0, 0, 0), -1, -1));

                //---- activeGamesLabel ----
                JLabel activeGamesLabel = new JLabel();
                activeGamesLabel.setFont(GlobalConstants.SETTINGS_FONT);
                activeGamesLabel.setForeground(GlobalConstants.COLOR_FONT);
                activeGamesLabel.setText(GlobalConstants.ACTIVE_GAMES);
                panel3.add(activeGamesLabel, new GridConstraints(0, 0, 1, 4,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //======== scrollPane1 ========
                JScrollPane scrollPane1 = new JScrollPane();
                {
                    //======== GamesPanel ========
                    scrollPane1.setViewportView(new GamesPanel());
                }
                panel3.add(scrollPane1, new GridConstraints(1, 1, 1, 2,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //---- ButtonLoad ----
                panel3.add(new ButtonLoad(), new GridConstraints(3, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //---- ButtonNew ----
                panel3.add(new ButtonNew(this), new GridConstraints(3, 2, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                JLabel label3 = new JLabel();
                panel3.add(label3, new GridConstraints(4, 1, 1, 2,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
            }
            panel1.add(panel3, new GridConstraints(5, 0, 1, 4,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
        }
        contentPane.add(panel1, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        pack();
        setLocationRelativeTo(getOwner());
    }

    public String getPlayerName() {
        return playerName.getText();
    }

    public int getSectorsNum() {
        return comboSectors.getSelectedIndex() + 2;
    }

    public int getPlayersNum() {
        return comboPlayers.getSelectedIndex() + 2;
    }

}