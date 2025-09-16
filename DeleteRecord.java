import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DeleteRecord extends JFrame implements ActionListener {

    JTextField idField;
    JButton deleteBtn;
    Connection con;

    public DeleteRecord() {
        setTitle("Delete Employee Record");
        setSize(350, 150);
        setLayout(new GridLayout(2, 2, 10, 10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Enter Employee ID to Delete:"));
        idField = new JTextField();
        add(idField);

        deleteBtn = new JButton("Delete");
        add(deleteBtn);

        // Empty label for spacing
        add(new JLabel(""));

        deleteBtn.addActionListener(this);

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
            String query = "DELETE FROM empdata WHERE eid = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, eid);

            int rows = pst.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Record Deleted");
            } else {
                JOptionPane.showMessageDialog(this, "No record found with given ID");
            }
            pst.close();
            idField.setText("");
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numeric Employee ID.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new DeleteRecord().setVisible(true);
    }
}