/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stu_mng_sys;
import java.util.*;
public class Classroom {
    private String classID;
    private ArrayList<Student> student;
    
    Classroom(){
        student = new ArrayList<>(); 
    }
    
    Classroom(String classID, ArrayList<Student> student){
        this.classID = classID;
        this.student = student;
    }
    
    public void setClassID(String classID){
        this.classID = classID; 
    }
    
    public String getClassID(){
        return this.classID; 
    }
    
    public void setStudent(ArrayList<Student>student){
        this.student = student;
    }
    
    public ArrayList getStudent(){
        return this.student; 
    }
    
    public String toString(){
        return this.classID; 
    }
    
}
