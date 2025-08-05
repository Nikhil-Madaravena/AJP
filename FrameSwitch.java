import java.awt.*;
import java.awt.event.*;

public class FrameSwitch {
    public static void main(String[] args) {
        Frame f1 = new Frame("Frame 1");
        Button b1 = new Button("Go to Frame 2");
        f1.setSize(300, 200);
        f1.setLayout(new FlowLayout());
        f1.add(b1);
        f1.setVisible(true);

        Frame f2 = new Frame("Frame 2");
        Button b2 = new Button("Back to Frame 1");
        f2.setSize(300, 200);
        f2.setLayout(new FlowLayout());
        f2.add(b2);

        b1.addActionListener(e -> {
            f1.setVisible(false);
            f2.setVisible(true);
        });

        b2.addActionListener(e -> {
            f2.setVisible(false);
            f1.setVisible(true);
        });

        f1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { f1.dispose(); }
        });

        f2.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { 
                f2.dispose(); 
                f1.dispose();
            }
        });
    }
}
