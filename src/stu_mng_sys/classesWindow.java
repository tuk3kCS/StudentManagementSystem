package stu_mng_sys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class classesWindow extends JFrame {
    private final Stu_Mng_Sys mainApp;

    public classesWindow(Stu_Mng_Sys mainApp) {
        //Create student management function window
        super("Student Management");
        this.mainApp = mainApp;
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(1280, 720);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
