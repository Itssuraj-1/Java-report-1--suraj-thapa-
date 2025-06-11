// WAP to design a Menu using Swing in Java
import javax.swing.*;

public class SwingMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Demo");
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");

        open.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Open Clicked"));
        exit.addActionListener(e -> System.exit(0));

        fileMenu.add(open);
        fileMenu.add(exit);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
