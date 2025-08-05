import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    JTextField num1 = new JTextField(5), num2 = new JTextField(5), result = new JTextField(10);

    public Calculator() {
        setTitle("Calc");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton add = new JButton("+"), sub = new JButton("-"), mul = new JButton("*"), div = new JButton("/");

        add(num1); add(num2); add(result);
        add(add); add(sub); add(mul); add(div);

        ActionListener action = e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                String op = e.getActionCommand();
                double res = 0;
                switch (op) {
                    case "+":
                        res =  a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                    case "/":
                        res = b != 0 ? a / b : Double.NaN;
                        break;
                    default:
                    res = 0;
                };
                result.setText("" + res);
            } catch (Exception ex) {
                result.setText("Error");
            }
        };

        add.addActionListener(action);
        sub.addActionListener(action);
        mul.addActionListener(action);
        div.addActionListener(action);

        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
