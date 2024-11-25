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
    private final JFrame newStudentFormFrame = new JFrame("Add New Student");
    private final Stu_Mng_Sys mainApp;

    public studentWindow(Stu_Mng_Sys mainApp) {
        //Create student management function window
        super("Student Management");
        this.mainApp = mainApp;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1280, 720);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        //Main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(0, 0, 1280, 720);
        add(mainPanel);

        //Create contents in this window
        //Window's label
        studentLabel.setFont(new Font("Arial", Font.BOLD, 40));
        studentLabel.setBounds(440, 50, 500, 60);
        mainPanel.add(studentLabel);

        //Add new student function button
        addStudentButton.setBounds(50, 150, 200, 30);
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!newStudentFormFrame.isVisible()) {
                    newStudentFormFrame.setVisible(true); //Show add new student window
                    newStudentForm();
                }
            }
        });
        mainPanel.add(addStudentButton);

        //Students' information table
        JScrollPane studentScrollPane = new JScrollPane(studentTable); //Create students' information table
        mainPanel.add(studentScrollPane);
        studentScrollPane.setBounds(40, 200, 1200, 420);

        //Student filter text field
        studentFilterLabel.setFont(new Font("Arial", Font.BOLD, 15));
        studentFilterLabel.setBounds(350, 150, 200, 30);
        mainPanel.add(studentFilterLabel);

        studentFilterTextField.setBounds(530, 150, 200, 30);
        mainPanel.add(studentFilterTextField);

        studentFilterButton.setBounds(750, 150, 200, 30);
        studentFilterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        mainPanel.add(studentFilterButton);

        //Add new student window
        newStudentFormFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newStudentFormFrame.setSize(640, 480);
        newStudentFormFrame.setLayout(null);
        newStudentFormFrame.setLocationRelativeTo(null);
        newStudentFormFrame.setResizable(false);
    }

    public void newStudentForm() {
        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setSize(640, 480);
        newStudentFormFrame.add(formPanel);

        JLabel newStudentFormLabel = new JLabel("Add New Student");
        newStudentFormLabel.setFont(new Font("Arial", Font.BOLD, 30));
        newStudentFormLabel.setBounds(190, 20, 300, 40);
        formPanel.add(newStudentFormLabel);

        JLabel fullNameLabel = new JLabel("Full Name:");
        fullNameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        fullNameLabel.setBounds(100, 80, 100, 30);
        formPanel.add(fullNameLabel);

        JLabel dobLabel = new JLabel("Date of Birth:");
        dobLabel.setFont(new Font("Arial", Font.BOLD, 15));
        dobLabel.setBounds(100, 130, 100, 30);
        formPanel.add(dobLabel);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Arial", Font.BOLD, 15));
        genderLabel.setBounds(100, 180, 100, 30);
        formPanel.add(genderLabel);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Arial", Font.BOLD, 15));
        addressLabel.setBounds(100, 230, 100, 30);
        formPanel.add(addressLabel);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setFont(new Font("Arial", Font.BOLD, 15));
        phoneLabel.setBounds(100, 280, 100, 30);
        formPanel.add(phoneLabel);

        JLabel classIDLabel = new JLabel("Class ID:");
        classIDLabel.setFont(new Font("Arial", Font.BOLD, 15));
        classIDLabel.setBounds(100, 330, 100, 30);
        formPanel.add(classIDLabel);

        JTextField fullNameField = new JTextField();
        fullNameField.setBounds(250, 80, 290, 30);
        formPanel.add(fullNameField);

        JTextField dobField = new JTextField();
        dobField.setBounds(250, 130, 290, 30);
        formPanel.add(dobField);

        JTextField genderField = new JTextField();
        genderField.setBounds(250, 180, 290, 30);
        formPanel.add(genderField);

        JTextField addressField = new JTextField();
        addressField.setBounds(250, 230, 290, 30);
        formPanel.add(addressField);

        JTextField phoneField = new JTextField();
        phoneField.setBounds(250, 280, 290, 30);
        formPanel.add(phoneField);

        JTextField classIDField = new JTextField();
        classIDField.setBounds(250, 330, 290, 30);
        formPanel.add(classIDField);

        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.BOLD, 15));
        submitButton.setBounds(220, 380, 200, 30);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        formPanel.add(submitButton);
    }
}
