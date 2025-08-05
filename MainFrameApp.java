import javax.swing.*;
import java.awt.event.*;

public class MainFrameApp extends JFrame implements WindowListener {
  public MainFrameApp() {
    setTitle("WindowListener Demo");
    setSize(400, 200);
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    addWindowListener(this);

    JLabel label = new JLabel("Close or interact with the window to see events.", SwingConstants.CENTER);
    add(label);
  }

  // WindowListener methods
  public void windowOpened(WindowEvent e) {
    System.out.println("Window opened");
  }

  public void windowClosing(WindowEvent e) {
    System.out.println("Window closing");
    dispose();
    System.exit(0);
  }

  public void windowClosed(WindowEvent e) {
    System.out.println("Window closed");
  }

  public void windowIconified(WindowEvent e) {
    System.out.println("Window minimized");
  }

  public void windowDeiconified(WindowEvent e) {
    System.out.println("Window restored");
  }

  public void windowActivated(WindowEvent e) {
    System.out.println("Window activated");
  }

  public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated");
    }

  public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrameApp().setVisible(true);
        });
      }
    }