/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stu_mng_sys;
import java.util.*;
public class Classes {
    private String classID, Major;
    
    Classes(){
        
    }
    
    Classes(String classID, String Major){
        this.classID = classID;
        this.Major = Major;
    }
    
    public void setClassID(String s){
        this.classID = s; 
    }
    
    public String getClassID(){
        return this.classID; 
    }
    
    public void setMajor(String s){
        this.Major = s; 
    }
    
    public String getMajor(){
        return this.Major; 
    }
    
    public void addNewClass(){
        
    }
    
    public void viewClassInfor(){
        
    }
    
    public String toString(){
        return this.classID + " " + this.Major;  
    }
    
}
