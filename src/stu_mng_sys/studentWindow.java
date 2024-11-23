package stu_mng_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class studentWindow extends JFrame {
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
        JLabel studentLabel = new JLabel("Student Management"); //window's label
        studentLabel.setFont(new Font("Arial", Font.BOLD, 40));
        studentLabel.setBounds(440, 50, 500, 60);
        add(studentLabel);

        JButton addStudentButton = new JButton("Add New Student"); // Add new student function button
        addStudentButton.setBounds(50, 150, 200, 30);
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(addStudentButton);

        String[][] studentInit = {};
        String[] studentAttributes = {"Student ID", "Full Name", "Date of Birth", "Gender", "Address", "Email", "Phone Number", "Class"};
        JTable studentTable = new JTable(studentInit, studentAttributes);
        JScrollPane studentScrollPane = new JScrollPane(studentTable); //Create students' information table
        add(studentScrollPane);
        studentScrollPane.setBounds(40, 200, 1200, 420);
    }
}
