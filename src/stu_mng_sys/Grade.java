/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stu_mng_sys;
import java.util.*; 
public class Grade {
    Scanner sc = new Scanner(System.in);
    private float gpa;
    private Student student;
    private Courses course; 
    Grade(){
        this.gpa = sc.nextFloat(); 
    }
    
    public void setGpa(float gpa){
        this.gpa = gpa;
    }
    
    public float getGpa(){
        return this.gpa; 
    }
    
    public String toString(){
        return this.gpa + " " + this.student + " " + this.course; 
    }
}
