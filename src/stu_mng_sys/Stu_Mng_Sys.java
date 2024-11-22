package stu_mng_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Stu_Mng_Sys {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Stu_Mng_Sys::new); //Make this program thread-safe (?)
    }

    public Stu_Mng_Sys() {
        //Create main frame
        JFrame mainFrame = new JFrame("Student Management System");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1280, 720);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        mainFrame.setLayout(new BorderLayout());

        //Create function panel
        JPanel studentPanel = new JPanel();
        JPanel classesPanel = new JPanel();
        JPanel subjectPanel = new JPanel();
        JPanel scoresPanel = new JPanel();

        //Create menubar panel with 4 buttons correspond to 4 functions
        JPanel menuBar = new JPanel();
        menuBar.setLayout(new GridLayout(4, 1));
        menuBar.setPreferredSize(new Dimension(320, 720));
        mainFrame.add(menuBar, BorderLayout.WEST);

        JButton studentButton = new JButton("Student Management"); //Student management button
        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentPanel.setVisible(true);
                classesPanel.setVisible(false);
                subjectPanel.setVisible(false);
                scoresPanel.setVisible(false);
            }
        });
        menuBar.add(studentButton);

        JButton classesButton = new JButton("Classes Management"); //Classes management button
        classesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentPanel.setVisible(false);
                classesPanel.setVisible(true);
                subjectPanel.setVisible(false);
                scoresPanel.setVisible(false);
            }
        });
        menuBar.add(classesButton);

        JButton subjectButton = new JButton("Subject Management"); //Subject management button
        subjectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentPanel.setVisible(false);
                classesPanel.setVisible(false);
                subjectPanel.setVisible(true);
                scoresPanel.setVisible(false);
            }
        });
        menuBar.add(subjectButton);

        JButton scoresButton = new JButton("Scores Management"); //Scores management button
        scoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentPanel.setVisible(false);
                classesPanel.setVisible(false);
                subjectPanel.setVisible(false);
                scoresPanel.setVisible(true);
            }
        });
        menuBar.add(scoresButton);

        //Create functions in student management panel
        studentPanel.setLayout(null);
        mainFrame.add(studentPanel, BorderLayout.CENTER);

        JLabel studentLabel = new JLabel("Student Management"); //Student Management label
        studentLabel.setFont(new Font("Arial", Font.BOLD, 40));
        studentLabel.setBounds(280, 50, 500, 60);
        studentPanel.add(studentLabel);

        JButton addStudentButton = new JButton("Add New Student"); // Add new student function button
        addStudentButton.setBounds(50, 150, 200, 30);
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        studentPanel.add(addStudentButton);

        String[][] studentInit = {};
        String[] studentAttributes = {"Student ID", "Full Name", "Date of Birth", "Class", "Major"};
        JTable studentTable = new JTable(studentInit, studentAttributes);
        JScrollPane studentScrollPane = new JScrollPane(studentTable); //Create students' information table
        studentPanel.add(studentScrollPane);
        studentScrollPane.setBounds(40, 200, 860, 420);

        //Create functions in classes management
        classesPanel.setLayout(null);
        mainFrame.add(classesPanel, BorderLayout.CENTER);

        JLabel classesLabel = new JLabel("Classes Management"); //Classes Management label
        classesLabel.setFont(new Font("Arial", Font.BOLD, 40));
        classesLabel.setBounds(280, 50, 500, 60);
        classesPanel.add(classesLabel);
    }

}
