package stu_mng_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class studentWindow extends JFrame {
    private final JLabel studentLabel = new JLabel("Student Management");
    private final JButton addStudentButton = new JButton("Add New Student");
    String[][] studentInit = {};
    String[] studentAttributes = {"Student ID", "Full Name", "Date of Birth", "Gender", "Address", "Email", "Phone Number", "Class", "Major"};
    private final JTable studentTable = new JTable(studentInit, studentAttributes);
    private final JLabel studentFilterLabel = new JLabel("Search for Student ID");
    private final JTextField studentFilterTextField = new JTextField();
    private final JButton studentFilterButton = new JButton("Search");
    private final Stu_Mng_Sys mainApp;

    public studentWindow(Stu_Mng_Sys mainApp) {
        //Create student management function window
        super("Student Management");
        this.mainApp = mainApp;
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(1280, 720);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        //Create contents in this window
        //Window's label
        studentLabel.setFont(new Font("Arial", Font.BOLD, 40));
        studentLabel.setBounds(440, 50, 500, 60);
        add(studentLabel);

        //Add new student function button
        addStudentButton.setBounds(50, 150, 200, 30);
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(addStudentButton);

        //Students' information table
        JScrollPane studentScrollPane = new JScrollPane(studentTable); //Create students' information table
        add(studentScrollPane);
        studentScrollPane.setBounds(40, 200, 1200, 420);

        //Student filter text field
        studentFilterLabel.setFont(new Font("Arial", Font.BOLD, 15));
        studentFilterLabel.setBounds(350, 150, 200, 30);
        add(studentFilterLabel);

        studentFilterTextField.setBounds(530, 150, 200, 30);
        add(studentFilterTextField);

        studentFilterButton.setBounds(750, 150, 200, 30);
        studentFilterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(studentFilterButton);
    }
}
