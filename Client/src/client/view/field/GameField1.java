package client.view.field;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import info.clearthought.layout.*;
/*
 * Created by JFormDesigner on Thu Aug 04 18:05:53 EEST 2016
 */


/**
 * @author Nina Finder
 */
public class GameField1 extends JFrame {
    public GameField1() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Nina Finder
        panel5 = new JPanel();
        label1 = new JLabel();
        sidePanel = new JPanel();
        gameName = new JLabel();
        yourMove = new JLabel();
        playerName = new JLabel();
        actionName = new JLabel();
        wrapper = new JPanel();
        scorePanel = new JPanel();
        playerPanel = new JPanel();
        button10 = new JButton();
        playerNameSmall = new JLabel();
        score = new JLabel();
        mainPanel = new JPanel();
        panel4 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();

        //======== panel5 ========
        {

            // JFormDesigner evaluation mark
            panel5.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel5.getBorder())); panel5.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel5.setLayout(new BorderLayout());

            //---- label1 ----
            label1.setText("text");
            label1.setHorizontalTextPosition(SwingConstants.CENTER);
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            panel5.add(label1, BorderLayout.CENTER);
        }

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== sidePanel ========
        {
            sidePanel.setBackground(new Color(204, 102, 51));

            // JFormDesigner evaluation mark
            sidePanel.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), sidePanel.getBorder())); sidePanel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));

            //---- gameName ----
            gameName.setText("Pentago");
            gameName.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
            gameName.setForeground(new Color(247, 235, 200));
            gameName.setHorizontalAlignment(SwingConstants.CENTER);
            gameName.setToolTipText("Pentago");
            gameName.setAlignmentX(0.5F);
            sidePanel.add(gameName);

            //---- yourMove ----
            yourMove.setText("Your move");
            yourMove.setAlignmentX(0.5F);
            yourMove.setForeground(new Color(247, 235, 200));
            yourMove.setFont(new Font("Arial", Font.BOLD, 20));
            sidePanel.add(yourMove);

            //---- playerName ----
            playerName.setText("Player 1!");
            playerName.setAlignmentX(0.5F);
            playerName.setForeground(new Color(247, 235, 200));
            playerName.setFont(new Font("Arial", Font.BOLD, 30));
            sidePanel.add(playerName);

            //---- actionName ----
            actionName.setText("Choose a ball");
            actionName.setAlignmentX(0.5F);
            actionName.setForeground(new Color(247, 235, 200));
            actionName.setFont(new Font("Arial", Font.PLAIN, 20));
            sidePanel.add(actionName);

            //======== wrapper ========
            {
                wrapper.setBackground(new Color(204, 102, 51));
                wrapper.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

                //======== scorePanel ========
                {
                    scorePanel.setBackground(new Color(204, 102, 51));
                    scorePanel.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //======== playerPanel ========
                    {
                        playerPanel.setBackground(new Color(204, 102, 51));
                        playerPanel.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));

                        //---- button10 ----
                        button10.setOpaque(false);
                        button10.setContentAreaFilled(false);
                        button10.setBorder(null);
                        button10.setBackground(new Color(204, 102, 51));
                        button10.setIcon(new ImageIcon("D:\\java\\Pentago\\Common\\src\\img\\ball_white.gif"));
                        playerPanel.add(button10, new GridConstraints(0, 0, 2, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- playerNameSmall ----
                        playerNameSmall.setText("Player 1");
                        playerNameSmall.setForeground(new Color(247, 235, 200));
                        playerNameSmall.setFont(new Font("Arial", Font.PLAIN, 15));
                        playerPanel.add(playerNameSmall, new GridConstraints(0, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- score ----
                        score.setText("0");
                        score.setAlignmentY(0.0F);
                        score.setForeground(new Color(247, 235, 200));
                        score.setFont(new Font("Arial", Font.PLAIN, 15));
                        playerPanel.add(score, new GridConstraints(1, 1, 1, 1,
                            GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                    }
                    scorePanel.add(playerPanel, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                wrapper.add(scorePanel, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            sidePanel.add(wrapper);
        }
        contentPane.add(sidePanel, BorderLayout.LINE_START);

        //======== mainPanel ========
        {
            mainPanel.setBackground(new Color(204, 102, 51));
            mainPanel.setPreferredSize(new Dimension(500, 500));
            mainPanel.setMinimumSize(new Dimension(500, 500));
            mainPanel.setMaximumSize(new Dimension(500, 500));
            mainPanel.setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), 0, 0));

            //======== panel4 ========
            {
                panel4.setBackground(new Color(204, 102, 255));
                panel4.setPreferredSize(new Dimension(500, 500));
                panel4.setMinimumSize(new Dimension(109, 109));
                panel4.setMaximumSize(new Dimension(109, 109));
                panel4.setLayout(new GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1, true, true));

                //---- button1 ----
                button1.setIcon(new ImageIcon("D:\\java\\Pentago\\src\\img\\ball_white.gif"));
                button1.setMaximumSize(new Dimension(142, 143));
                button1.setMinimumSize(new Dimension(142, 143));
                button1.setBorderPainted(false);
                button1.setContentAreaFilled(false);
                button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button1.setDefaultCapable(false);
                button1.setIconTextGap(0);
                button1.setPreferredSize(new Dimension(142, 143));
                button1.setBorder(null);
                button1.setBackground(new Color(204, 102, 51));
                button1.setFocusPainted(false);
                button1.setFocusable(false);
                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button1MouseClicked(e);
                    }
                });
                panel4.add(button1, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- button2 ----
                button2.setOpaque(false);
                button2.setContentAreaFilled(false);
                button2.setBorder(null);
                button2.setBackground(new Color(204, 102, 51));
                button2.setIcon(new ImageIcon("D:\\java\\Pentago\\Common\\src\\img\\ball_white.gif"));
                panel4.add(button2, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- button3 ----
                button3.setText("text");
                panel4.add(button3, new GridConstraints(0, 2, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- button4 ----
                button4.setText("text");
                panel4.add(button4, new GridConstraints(1, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- button5 ----
                button5.setText("text");
                panel4.add(button5, new GridConstraints(1, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- button6 ----
                button6.setText("text");
                panel4.add(button6, new GridConstraints(1, 2, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- button7 ----
                button7.setText("text");
                panel4.add(button7, new GridConstraints(2, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- button8 ----
                button8.setText("text");
                panel4.add(button8, new GridConstraints(2, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- button9 ----
                button9.setText("text");
                panel4.add(button9, new GridConstraints(2, 2, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            mainPanel.add(panel4, new GridConstraints(2, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        contentPane.add(mainPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Nina Finder
    private JPanel panel5;
    private JLabel label1;
    private JPanel sidePanel;
    private JLabel gameName;
    private JLabel yourMove;
    private JLabel playerName;
    private JLabel actionName;
    private JPanel wrapper;
    private JPanel scorePanel;
    private JPanel playerPanel;
    private JButton button10;
    private JLabel playerNameSmall;
    private JLabel score;
    private JPanel mainPanel;
    private JPanel panel4;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
