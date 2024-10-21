/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stu_mng_sys;
import java.util.*; 
public class Courses {
    private String CourseID, name,lecturer;
    private int credit, slot; 
    private ArrayList<Student> student;
    
    Courses(){
        student = new ArrayList<Student>(); 
    }
    
    Courses(String courseID, String name, String lecturer,int credit,int slot, ArrayList<Student> student){
        this.CourseID = courseID;
        this.name = name;
        this.lecturer = lecturer;
        this.credit = credit;
        this.slot = slot;
        this.student = student;
    }
    
    public void setCourseID(String courseID){
        this.CourseID = courseID;
    }
    
    public String getCourseID(){
        return this.CourseID;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name; 
    }
    
    public void setCredit(int credit){
        this.credit = credit;
    }
    
    public int getCredit(){
        return this.credit;
    }
    
    public void setLecturer(String Lecturer){
        this.lecturer = Lecturer;
    }
    
    public String getLecturer(){
        return this.lecturer;
    }
    
    public void setSlot(int slot){
        this.slot = slot;
    }
    
    public int getSlot(){
        return this.slot;
    }
    
    public void setStudent(ArrayList<Student>student){
        this.student = student;
    }
    
    public void getStudent(){
        for(int i = 0;i < student.size();i++){
            System.out.println(student.get(i));
        }
    }
    
    public String toString(){
        return this.CourseID + " " + this.name + " " + this.lecturer + " " + this.credit + " " + this.slot; 
    }
    
}
