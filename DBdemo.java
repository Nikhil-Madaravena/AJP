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
//javac -cp .;mysql-connector-java-8.0.33.jar DBdemo.java
//java -cp .;mysql-connector-java-8.0.33.jar DBdemo


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DBdemo extends JFrame implements ActionListener {

  JTextField idField;
  JButton insertBtn;
  Connection con;

  public DBdemo() {

    setTitle("Employee Database");
    setSize(400, 300);
    setLayout(new GridLayout(5, 2));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(new JLabel("Employee ID:"));
    idField = new JTextField();
    add(idField);
    insertBtn = new JButton("Insert");
    add(insertBtn);
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
      int eid = Integer.parseInt(idField.getText());
      if (ae.getSource() == insertBtn) {
        PreparedStatement pst = con.prepareStatement("INSERT INTO empdata (eid) VALUES (?)");
        pst.setInt(1, eid);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Record Inserted");
        pst.close();
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
  }

  public static void main(String[] args) {
    new DBdemo().setVisible(true);
  }
}