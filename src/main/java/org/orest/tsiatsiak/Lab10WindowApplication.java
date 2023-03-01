package org.orest.tsiatsiak;

import javax.swing.*;
import java.awt.*;

public class Lab10WindowApplication {

    public static void main(String[] args) {
        tuneWindowForVariant9(new JFrame(), 300);
        new MyWindow();
    }

    public static void tuneWindowForVariant9(JFrame window) {
        tuneWindowForVariant9(window, 0);
    }

    public static void tuneWindowForVariant9(JFrame window, int leftMargin) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        window.setTitle("Нижнє праве вікно");
        window.setSize(300, 400);
        window.setLocation(screenSize.width - window.getWidth() - leftMargin, screenSize.height - window.getHeight());
        window.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        JPanel info = getInfoForVariant9(window);
        window.add(info);
        info.revalidate();
    }

    public static JPanel getInfoForVariant9(JFrame window) {
        Dimension dimension = window.getSize();
        Point location = window.getLocation();
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Dimensions: width - " + dimension.width + " height - " + dimension.height));
        panel.add(new JLabel("Location: x - " + location.x + " y - " + location.y));
        panel.add(new JLabel("Title: " + window.getTitle()));
        panel.add(new JLabel("State: " + window.getCursor().getName()));
        return panel;
    }

}
