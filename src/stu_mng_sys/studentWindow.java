package stu_mng_sys;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class studentWindow extends JFrame implements Serializable {
    private final JLabel studentLabel = new JLabel("Student Management");
    private final JButton addStudentButton = new JButton("Add New Student");
    private final JButton modifyInfoButton = new JButton("Modify Information");
    private final JTable studentTable = new JTable(new DefaultTableModel(new Object[][]{}, new Object[]{"Student ID", "Full Name", "Date of Birth", "Gender", "Address", "Email", "Phone Number", "Class", "Major"}));
    private final JLabel studentFilterLabel = new JLabel("Search for Student ID");
    private final JTextField studentFilterTextField = new JTextField();
    private final JButton studentFilterButton = new JButton("Search");
    private final JFrame newStudentFormFrame = new JFrame("Add New Student");
    private final JFrame modifyInformationFormFrame = new JFrame("Modify Student's Information");
    private ArrayList<Student> studentArrayList = new ArrayList<>();
    private File studentFile = new File("student.in");
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
                    addNewStudent();
                }
            }
        });
        mainPanel.add(addStudentButton);

        //Students' information table
        JScrollPane studentScrollPane = new JScrollPane(studentTable); //Create students' information table
        mainPanel.add(studentScrollPane);
        studentScrollPane.setBounds(40, 200, 1200, 420);

        //Test data
        //studentArrayList.add(new Student("Dinh Quyet Thang", "06/09/2004", "Nam", "Hạ Long, Quảng Ninh", "0123456789", "E22CQCN03-B", "Công nghệ thông tin - CLC"));
        //studentArrayList.add(new Student("Nguyen Hoang Tung", "03/08/2004", "Nam", "Thanh Xuân, Hà Nội", "0983830780", "E22CQCN03-B", "Công nghệ thông tin - CLC"));

        //Load all data to the table when active
        if (studentFile.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(studentFile))){
                studentArrayList = (ArrayList<Student>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
        for (Student student : studentArrayList) {
            String studentID = student.getStudentID();
            String fullName = student.getFullName();
            String DoB = student.getDoB();
            String gender = student.getGender();
            String address = student.getAddress();
            String email = student.getEmail();
            String phoneNo = student.getPhoneNo();
            String classID = student.getClassID();
            String major = student.getMajor();
            model.addRow(new Object[]{studentID, fullName, DoB, gender, address, email, phoneNo, classID, major});
        }

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
                //Find the record matches with the correspond text in the text field (not just studentID 'cause I just found out how to do that xDDDDD)
                TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(studentTable.getModel());
                studentTable.setRowSorter(rowSorter);
                String text = studentFilterTextField.getText();
                if (text.trim().isEmpty()) {
                    rowSorter.setRowFilter(null);
                }
                else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
        });
        mainPanel.add(studentFilterButton);

        //Modify information function button
        modifyInfoButton.setBounds(1030, 150, 200, 30);
        modifyInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!modifyInformationFormFrame.isVisible()) {
                    modifyInformationFormFrame.setVisible(true); //Show add new student window
                    modifyInformation();
                }
            }
        });
        mainPanel.add(modifyInfoButton);

        //Add new student window
        newStudentFormFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newStudentFormFrame.setSize(640, 480);
        newStudentFormFrame.setLayout(null);
        newStudentFormFrame.setLocationRelativeTo(null);
        newStudentFormFrame.setResizable(false);

        //Modify student's information
        modifyInformationFormFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        modifyInformationFormFrame.setSize(640, 480);
        modifyInformationFormFrame.setLayout(null);
        modifyInformationFormFrame.setLocationRelativeTo(null);
        modifyInformationFormFrame.setResizable(false);
    }

    public void addNewStudent() {
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
        dobLabel.setBounds(100, 120, 100, 30);
        formPanel.add(dobLabel);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Arial", Font.BOLD, 15));
        genderLabel.setBounds(100, 160, 100, 30);
        formPanel.add(genderLabel);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Arial", Font.BOLD, 15));
        addressLabel.setBounds(100, 200, 100, 30);
        formPanel.add(addressLabel);

        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberLabel.setFont(new Font("Arial", Font.BOLD, 15));
        phoneNumberLabel.setBounds(100, 240, 150, 30);
        formPanel.add(phoneNumberLabel);

        JLabel classIDLabel = new JLabel("Class ID:");
        classIDLabel.setFont(new Font("Arial", Font.BOLD, 15));
        classIDLabel.setBounds(100, 280, 100, 30);
        formPanel.add(classIDLabel);

        JLabel majorLabel = new JLabel("Major: ");
        majorLabel.setFont(new Font("Arial", Font.BOLD, 15));
        majorLabel.setBounds(100, 320, 100, 30);
        formPanel.add(majorLabel);

        JTextField fullNameField = new JTextField();
        fullNameField.setBounds(250, 80, 290, 30);
        formPanel.add(fullNameField);

        JTextField dobField = new JTextField();
        dobField.setBounds(250, 120, 290, 30);
        formPanel.add(dobField);

        JTextField genderField = new JTextField();
        genderField.setBounds(250, 160, 290, 30);
        formPanel.add(genderField);

        JTextField addressField = new JTextField();
        addressField.setBounds(250, 200, 290, 30);
        formPanel.add(addressField);

        JTextField phoneNumberField = new JTextField();
        phoneNumberField.setBounds(250, 240, 290, 30);
        formPanel.add(phoneNumberField);

        JTextField classIDField = new JTextField();
        classIDField.setBounds(250, 280, 290, 30);
        formPanel.add(classIDField);

        JTextField majorField = new JTextField();
        majorField.setBounds(250, 320, 290, 30);
        formPanel.add(majorField);

        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.BOLD, 15));
        submitButton.setBounds(220, 380, 200, 30);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //When no field is null, save information to the data file and show a message "Added successfully"
                //Update students table by pushing the data from data file again

                String fullName = fullNameField.getText();
                String dob = dobField.getText();
                String gender = genderField.getText();
                String address = addressField.getText();
                String phoneNumber = phoneNumberField.getText();
                String classID = classIDField.getText();
                String major = majorField.getText();

                if (fullName.isEmpty() || dob.isEmpty() || gender.isEmpty() || address.isEmpty() || phoneNumber.isEmpty() || classID.isEmpty() || major.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields.");
                }

                else {
                    Student newStudent = new Student(fullName, dob, gender, address, phoneNumber, classID, major);
                    studentArrayList.add(newStudent);
                    saveDataFromList(studentArrayList);
                    DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
                    model.setRowCount(0);
                    loadDataToList(studentTable, studentArrayList);
                    JOptionPane.showMessageDialog(null, "Added successfully.");
                    clearFields(fullNameField, dobField, genderField, addressField, phoneNumberField, classIDField, majorField);
                }
            }
        });
        formPanel.add(submitButton);
    }

    public void modifyInformation() {
        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setSize(640, 480);
        modifyInformationFormFrame.add(formPanel);

        JLabel newStudentFormLabel = new JLabel("Modify Student's Information");
        newStudentFormLabel.setFont(new Font("Arial", Font.BOLD, 30));
        newStudentFormLabel.setBounds(110, 20, 500, 40);
        formPanel.add(newStudentFormLabel);

        JLabel studentIDLabel = new JLabel("Student ID");
        studentIDLabel.setFont(new Font("Arial", Font.BOLD, 15));
        studentIDLabel.setBounds(100, 90, 100, 30);
        formPanel.add(studentIDLabel);

        JLabel fullNameLabel = new JLabel("Full Name:");
        fullNameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        fullNameLabel.setBounds(100, 125, 100, 30);
        formPanel.add(fullNameLabel);

        JLabel dobLabel = new JLabel("Date of Birth:");
        dobLabel.setFont(new Font("Arial", Font.BOLD, 15));
        dobLabel.setBounds(100, 160, 100, 30);
        formPanel.add(dobLabel);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Arial", Font.BOLD, 15));
        genderLabel.setBounds(100, 195, 100, 30);
        formPanel.add(genderLabel);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Arial", Font.BOLD, 15));
        addressLabel.setBounds(100, 230, 100, 30);
        formPanel.add(addressLabel);

        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberLabel.setFont(new Font("Arial", Font.BOLD, 15));
        phoneNumberLabel.setBounds(100, 265, 150, 30);
        formPanel.add(phoneNumberLabel);

        JLabel classIDLabel = new JLabel("Class ID:");
        classIDLabel.setFont(new Font("Arial", Font.BOLD, 15));
        classIDLabel.setBounds(100, 300, 100, 30);
        formPanel.add(classIDLabel);

        JLabel majorLabel = new JLabel("Major: ");
        majorLabel.setFont(new Font("Arial", Font.BOLD, 15));
        majorLabel.setBounds(100, 335, 100, 30);
        formPanel.add(majorLabel);

        JTextField studentIDTextField = new JTextField();
        studentIDTextField.setBounds(250, 90, 140, 30);
        formPanel.add(studentIDTextField);

        JTextField fullNameField = new JTextField();
        fullNameField.setBounds(250, 125, 290, 30);
        formPanel.add(fullNameField);

        JTextField dobField = new JTextField();
        dobField.setBounds(250, 160, 290, 30);
        formPanel.add(dobField);

        JTextField genderField = new JTextField();
        genderField.setBounds(250, 195, 290, 30);
        formPanel.add(genderField);

        JTextField addressField = new JTextField();
        addressField.setBounds(250, 230, 290, 30);
        formPanel.add(addressField);

        JTextField phoneNumberField = new JTextField();
        phoneNumberField.setBounds(250, 265, 290, 30);
        formPanel.add(phoneNumberField);

        JTextField classIDField = new JTextField();
        classIDField.setBounds(250, 300, 290, 30);
        formPanel.add(classIDField);

        JTextField majorField = new JTextField();
        majorField.setBounds(250, 335, 290, 30);
        formPanel.add(majorField);

        JButton findStudentButton = new JButton("Find Student");
        findStudentButton.setBounds(400, 90, 140, 30);
        findStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //If the studentID exists, return all value to the text fields
                String studentIDQuery = studentIDTextField.getText();
                for (Student student : studentArrayList) {
                    if (studentIDQuery.equals(student.getStudentID())) {
                        fullNameField.setText(student.getFullName());
                        dobField.setText(student.getDoB());
                        genderField.setText(student.getGender());
                        addressField.setText(student.getAddress());
                        phoneNumberField.setText(student.getPhoneNo());
                        classIDField.setText(student.getClassID());
                        majorField.setText(student.getMajor());
                        break;
                    }
                }
            }
        });
        formPanel.add(findStudentButton);

        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.BOLD, 15));
        submitButton.setBounds(220, 380, 200, 30);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //When no field is null, save information to the data file and show a message "Added successfully"
                //Update students table by pushing the data from data file again

                String fullName = fullNameField.getText();
                String dob = dobField.getText();
                String gender = genderField.getText();
                String address = addressField.getText();
                String phoneNumber = phoneNumberField.getText();
                String classID = classIDField.getText();
                String major = majorField.getText();

                if (fullName.isEmpty() || dob.isEmpty() || gender.isEmpty() || address.isEmpty() || phoneNumber.isEmpty() || classID.isEmpty() || major.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields.");
                }

                else {
                    for (Student student : studentArrayList) {
                        if (student.getFullName().equals(fullName)) {
                            studentArrayList.remove(student);
                            break;
                        }
                    }
                    Student newStudent = new Student(fullName, dob, gender, address, phoneNumber, classID, major);
                    studentArrayList.add(newStudent);
                    saveDataFromList(studentArrayList);
                    DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
                    model.setRowCount(0);
                    loadDataToList(studentTable, studentArrayList);
                    JOptionPane.showMessageDialog(null, "Added successfully.");
                    clearFields(fullNameField, dobField, genderField, addressField, phoneNumberField, classIDField, majorField);
                }
            }
        });
        formPanel.add(submitButton);
    }

    public void saveDataFromList(ArrayList<Student> studentArrayList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(studentFile))){
            oos.writeObject(studentArrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadDataToList(JTable studentTable, ArrayList<Student> studentArrayList) {
        if (studentFile.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(studentFile))){
                studentArrayList = (ArrayList<Student>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
        for (Student student : studentArrayList) {
            String studentID = student.getStudentID();
            String fullName = student.getFullName();
            String DoB = student.getDoB();
            String gender = student.getGender();
            String address = student.getAddress();
            String email = student.getEmail();
            String phoneNo = student.getPhoneNo();
            String classID = student.getClassID();
            String major = student.getMajor();
            model.addRow(new Object[]{studentID, fullName, DoB, gender, address, email, phoneNo, classID, major});
        }
    }

    public void clearFields(JTextField fullNameField, JTextField dobField, JTextField genderField, JTextField addressField, JTextField phoneNumberField, JTextField classIDField, JTextField majorField) {
        fullNameField.setText(null);
        dobField.setText(null);
        genderField.setText(null);
        addressField.setText(null);
        phoneNumberField.setText(null);
        classIDField.setText(null);
        majorField.setText(null);
    }
}
