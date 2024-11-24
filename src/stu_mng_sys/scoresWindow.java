package stu_mng_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class scoresWindow extends JFrame {
    private final JLabel scoresLabel = new JLabel("Scores Management");
    private final JButton modifyScoresButton = new JButton("Modify Scores");
    String[][] scoresInit = {};
    String[] scoresAttributes = {"Student ID", "Student Name", "Class ID", "Subject ID", "Attendance Score", "Process Score", "Midterm Score", "Final Score", "GPA"};
    private final JTable scoresTable = new JTable(scoresInit, scoresAttributes);
    private final JLabel studentFilterLabel = new JLabel("Search for Student ID");
    private final JTextField studentFilterTextField = new JTextField();
    private final JButton studentFilterButton = new JButton("Search");
    private final Stu_Mng_Sys mainApp;

    public scoresWindow(Stu_Mng_Sys mainApp) {
        //Create student management function window
        super("Scores Management");
        this.mainApp = mainApp;
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(1280, 720);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        //Create contents in this window
        //Window's label
        scoresLabel.setFont(new Font("Arial", Font.BOLD, 40));
        scoresLabel.setBounds(440, 50, 500, 60);
        add(scoresLabel);

        //Add new student function button
        modifyScoresButton.setBounds(50, 150, 200, 30);
        modifyScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(modifyScoresButton);

        //Students' subjects table
        JScrollPane studentScrollPane = new JScrollPane(scoresTable); //Create students' subjects table
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
    }
}
