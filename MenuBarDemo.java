import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuBarDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Bar Example");
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        exitItem.addActionListener(e -> System.exit(0));
    }
}
