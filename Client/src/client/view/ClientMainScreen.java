package client.view;

import commons.service.GlobalConstants;

import javax.swing.*;
import java.awt.*;

public class ClientMainScreen extends JFrame {
    public static ClientMainScreen instance;

    public ClientMainScreen() throws HeadlessException {
        instance = this;
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT));
        setTitle(GlobalConstants.TITLE_NAME);

        JPanel panel = new JPanel();
        {
            panel.setBackground(GlobalConstants.COLOR_BACKGROUND);
            panel.setPreferredSize(GlobalConstants.SIZE_SERVER);
            panel.setMaximumSize(GlobalConstants.SIZE_SERVER);
            panel.setMinimumSize(GlobalConstants.SIZE_SERVER);
            panel.setLayout(new BorderLayout());

            JLabel label = new JLabel();
            label.setText("Close this window to exit");
            label.setForeground(GlobalConstants.COLOR_FONT);
            label.setFont(GlobalConstants.PLAYER_FONT);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(label, BorderLayout.CENTER);
        }
        container.add(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
    }

    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(instance, message);

    }
}
