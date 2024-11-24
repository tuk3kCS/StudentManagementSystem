package stu_mng_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class classesWindow extends JFrame {
    private final JLabel classesLabel = new JLabel("Classes Management");
    private final JButton addClassButton = new JButton("Add New Class");
    String[][] classInit = {};
    String[] classAttributes = {"Student ID", "Full Name", "Date of Birth", "Email"};
    private final JTable classTable = new JTable(classInit, classAttributes);
    private final JLabel classFilterLabel = new JLabel("Search for Class ID");
    private final JTextField classFilterTextField = new JTextField();
    private final JButton classFilterButton = new JButton("Search");
    private final Stu_Mng_Sys mainApp;

    public classesWindow(Stu_Mng_Sys mainApp) {
        //Create student management function window
        super("Classes Management");
        this.mainApp = mainApp;
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(1280, 720);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        //Create contents in this window
        //Window's label
        classesLabel.setFont(new Font("Arial", Font.BOLD, 40));
        classesLabel.setBounds(440, 50, 500, 60);
        add(classesLabel);

        //Add new class function button
        addClassButton.setBounds(50, 150, 200, 30);
        addClassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(addClassButton);

        //Classes' students table
        JScrollPane studentScrollPane = new JScrollPane(classTable); //Create classes' students table
        add(studentScrollPane);
        studentScrollPane.setBounds(40, 200, 1200, 420);

        //Class filter
        classFilterLabel.setFont(new Font("Arial", Font.BOLD, 15));
        classFilterLabel.setBounds(350, 150, 200, 30);
        add(classFilterLabel);

        classFilterTextField.setBounds(530, 150, 200, 30);
        add(classFilterTextField);

        classFilterButton.setBounds(750, 150, 200, 30);
        classFilterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(classFilterButton);
    }
}
