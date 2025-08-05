import javax.swing.*;
import java.time.LocalTime;

public class TimeGreeting {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Greeting");
        JLabel label = new JLabel("Click to get greeting", SwingConstants.CENTER);
        JButton button = new JButton("Greet");

        button.addActionListener(e -> {
            int hour = LocalTime.now().getHour();
            String msg = (hour >= 5 && hour < 12) ? "Good Morning!" :
                         (hour < 17) ? "Good Afternoon!" :
                         (hour < 21) ? "Good Evening!" : "Good Night!";
            label.setText(msg);
        });

        frame.add(label, "Center");
        frame.add(button, "South");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
