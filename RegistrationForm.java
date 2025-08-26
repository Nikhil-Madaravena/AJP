import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame {

  JRadioButton rb1, rb2, rb3;
  ButtonGroup bg;
  JComboBox<String> countryBox;
  JTextArea addressArea;
  JButton submitBtn;

  public RegistrationForm() {

    setTitle("Registration Form");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(10, 2, 10, 10));

    add(new JLabel("First Name:"));
    JTextArea firstNameField = new JTextArea(3, 15);
    add(firstNameField);

    add(new JLabel("Last Name:"));
    JTextArea lastNameField = new JTextArea(3, 15);
    add(lastNameField);

    add(new JLabel("Email:"));
    JTextArea emailField = new JTextArea(3, 15);
    add(emailField);

    add(new JLabel("Phone Number:"));
    JTextArea phoneField = new JTextArea(3, 15);
    add(phoneField);

    rb1 = new JRadioButton("Male");
    rb2 = new JRadioButton("Female");
    rb3 = new JRadioButton("Other");

    bg = new ButtonGroup();

    bg.add(rb1);
    bg.add(rb2);
    bg.add(rb3);

    add(new JLabel("Select Gender:"));
    JPanel genderPanel = new JPanel();

    genderPanel.add(rb1);
    genderPanel.add(rb2);
    genderPanel.add(rb3);

    add(genderPanel);

    String countries[] = { "India", "USA", "UK", "Canada", "Australia" };
    countryBox = new JComboBox<>(countries);

    add(new JLabel("Select Country:"));
    add(countryBox);
    
    addressArea = new JTextArea(3, 20);
    JScrollPane scroll = new JScrollPane(addressArea);
    add(new JLabel("Enter Address:"));
    add(scroll);

    submitBtn = new JButton("Submit");
    add(submitBtn);

    submitBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();

        String gender = "";

        if (rb1.isSelected())
          gender = "Male";

        else if (rb2.isSelected())
          gender = "Female";

        else if (rb3.isSelected())
          gender = "Other";

        else
          gender = "Not selected";

        String country = (String) countryBox.getSelectedItem();
        String address = addressArea.getText();
        JOptionPane.showMessageDialog(null,

            "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "Gender: " + gender +
                "\nCountry: " + country +
                "\nAddress: " + address,
            "Your Selection", JOptionPane.INFORMATION_MESSAGE);
      }

    });
    setVisible(true);
  }

  public static void main(String[] args) {

    new RegistrationForm();

  }

}
