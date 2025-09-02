//to execute this code you need to add mysql-connector-java-8.0.33.jar file in the project build path
//Also create a database named 'employee' and a table named 'empdata' with columns 'eid', 'name', 'age', 'department'
//You can create the table using the following SQL command:
/*
CREATE TABLE empdata (
    eid INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    department VARCHAR(100)
);
*/
//Then run this code to insert records into the empdata table
//javac -cp .;mysql-connector-java-8.0.33.jar DatabaseDemo.java
//java -cp .;mysql-connector-java-8.0.33.jar DatabaseDemo

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DatabaseDemo extends JFrame implements ActionListener {

    JTextField idField, nameField, ageField, deptField;
    JButton insertBtn;
    Connection con;

    public DatabaseDemo() {
        setTitle("Employee Database");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10)); // added spacing
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Labels and fields
        add(new JLabel("Employee ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Age:"));
        ageField = new JTextField();
        add(ageField);

        add(new JLabel("Department:"));
        deptField = new JTextField();
        add(deptField);

        insertBtn = new JButton("Insert");
        add(insertBtn);

        // Empty label to fill grid
        add(new JLabel(""));

        insertBtn.addActionListener(this);

        connectDB();
    }

    private void connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "1234");
            System.out.println("Connected to MySQL DB");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "DB Connection Failed: " + e.getMessage());
        }
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == insertBtn) {
                int eid = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String dept = deptField.getText();

                String query = "INSERT INTO empdata (eid, name, age, department) VALUES (?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(query);

                pst.setInt(1, eid);
                pst.setString(2, name);
                pst.setInt(3, age);
                pst.setString(4, dept);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Inserted");
                pst.close();

                // Clear fields after insert
                idField.setText("");
                nameField.setText("");
                ageField.setText("");
                deptField.setText("");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values for ID and Age.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new DatabaseDemo().setVisible(true);
    }
}
