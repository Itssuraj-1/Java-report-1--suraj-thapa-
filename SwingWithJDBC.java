// WAP to create a Swing Application with JDBC
import java.sql.*;
import javax.swing.*;

public class SwingWithJDBC {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login");
        JLabel l1 = new JLabel("Username:");
        l1.setBounds(20, 20, 100, 30);
        JTextField tf = new JTextField();
        tf.setBounds(120, 20, 150, 30);
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 60, 100, 30);
        JPasswordField pf = new JPasswordField();
        pf.setBounds(120, 60, 150, 30);
        JButton b = new JButton("Login");
        b.setBounds(120, 100, 100, 30);

        b.addActionListener(e -> {
            String user = tf.getText();
            String pass = new String(pf.getPassword());
            try {
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "password");
                PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM users WHERE username=? AND password=?");
                ps.setString(1, user);
                ps.setString(2, pass);
                ResultSet rs = ps.executeQuery();
                if (rs.next())
                    JOptionPane.showMessageDialog(f, "Login Successful");
                else
                    JOptionPane.showMessageDialog(f, "Login Failed");
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        f.add(l1); f.add(tf); f.add(l2); f.add(pf); f.add(b);
        f.setSize(350, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
