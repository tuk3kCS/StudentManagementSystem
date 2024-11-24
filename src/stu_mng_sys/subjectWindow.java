package stu_mng_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class subjectWindow extends JFrame {
    private final JLabel subjectLabel = new JLabel("Subject Management");
    private final JButton addNewSubjectButton = new JButton("Add New Subject");
    private final JButton newRegistration = new JButton("New Registration");
    String[][] subjectInit = {};
    String[] subjectAttributes = {"Student ID", "Student Name", "Class ID", "Subject ID", "Subject Name"};
    private final JTable subjectTable = new JTable(subjectInit, subjectAttributes);
    private final JLabel studentFilterLabel = new JLabel("Search for Student ID");
    private final JTextField studentFilterTextField = new JTextField();
    private final JButton studentFilterButton = new JButton("Search");
    private final Stu_Mng_Sys mainApp;

    public subjectWindow(Stu_Mng_Sys mainApp) {
        //Create student management function window
        super("Subject Management");
        this.mainApp = mainApp;
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(1280, 720);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        //Create contents in this window
        //Window's label
        subjectLabel.setFont(new Font("Arial", Font.BOLD, 40));
        subjectLabel.setBounds(440, 50, 500, 60);
        add(subjectLabel);

        //Add new registration function button
        newRegistration.setBounds(50, 150, 200, 30);
        newRegistration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(newRegistration);

        //Students' subjects table
        JScrollPane studentScrollPane = new JScrollPane(subjectTable); //Create students' subjects table
        add(studentScrollPane);
        studentScrollPane.setBounds(40, 200, 1200, 420);

        //Student filter
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

        //Add new subject function button
        addNewSubjectButton.setBounds(1030, 150, 200, 30);
        addNewSubjectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(addNewSubjectButton);
    }
}
