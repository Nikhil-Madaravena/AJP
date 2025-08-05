import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Text_Label {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Text using Label");
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.white); // Fix background color
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label 1
        JLabel label1 = new JLabel("Maddy");
        label1.setBounds(20, 100, 300, 50);
        label1.setForeground(Color.black);
        label1.setOpaque(true);
        label1.setBackground(Color.yellow);
	label1.setHorizontalAlignment(SwingConstants.LEFT);  
        label1.setVerticalAlignment(SwingConstants.CENTER);

        // Button next to label1
        JButton button1 = new JButton("Button1");
        button1.setBounds(330, 100, 130, 50);
	button1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
        	Color current = label1.getBackground();
        if (current.equals(Color.YELLOW)) {
            label1.setBackground(Color.CYAN);
        } else {
            label1.setBackground(Color.YELLOW);
        	}
    	}
	});
        // Label 2
        JLabel label2 = new JLabel("Madhusri Vemulapally");
        label2.setBounds(20, 200, 300, 50);
        label2.setForeground(Color.black);
        label2.setOpaque(true);
        label2.setBackground(Color.gray);
        // Button next to label2
        JButton button2 = new JButton("Button2");
        button2.setBounds(330, 200, 130, 50);
	button2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
        	Color current = label2.getBackground();
        if (current.equals(Color.YELLOW)) {
            label2.setBackground(Color.CYAN);
        } else {
            label2.setBackground(Color.YELLOW);
        	}
    	}
	});
        // Add all components
        frame.add(label1);
        frame.add(button1);
        frame.add(label2);
        frame.add(button2);

        frame.setVisible(true);
    }
}
