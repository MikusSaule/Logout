import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        //Dashboard
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);

        JButton logout = new JButton("Logout");
        logout.setBounds(150,10,85,25);
        panel2.add(logout);

        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel2);
                frame.add(panel);
                frame.repaint();

            }
        });


        frame.setTitle("MainPage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.add(panel);

        panel.setLayout(null);

        JLabel name = new JLabel("Name: ");
        name.setBounds(10,10,100,25);
        panel.add(name);

        JTextField name1 = new JTextField();
        name1.setBounds(50,10,100,25);
        panel.add(name1);

        JButton login = new JButton("Login");
        login.setBounds(150,10,85,25);
        panel.add(login);

        JLabel error = new JLabel();
        error.setBounds(10,30,200,25);
        error.setForeground(Color.RED);
        panel.add(error);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getVal = name1.getText();
                if (getVal.isEmpty()) {
                    error.setText("Please enter a valid name!");

                }
                else if (getVal.equals("Mikus")) {
                    frame.remove(panel);
                    frame.add(panel2);
                    frame.repaint();
                    frame.setTitle("Welcome " + getVal);
                }
                else {
                    error.setText("Error!");
            }
        }



});
}}
