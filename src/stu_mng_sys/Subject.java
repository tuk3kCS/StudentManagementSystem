/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stu_mng_sys;
import java.util.*;
public class Subject {
    private String subjectID, subjectName;
    
    Subject(){
        
    }
    
    Subject(String subjectID, String subjectName){
        this.subjectID = subjectID;
        this.subjectName = subjectName; 
    }
    
    public void setSubjectID(String s){
        this.subjectID = s; 
    }
    
    public String getSubjectID(){
        return this.subjectID; 
    }
    
    public void setSubjectName(String s){
        this.subjectName = s; 
    }
    
    public String getSubjectName(){
        return this.subjectName; 
    }
    
    public void addNewProject(){
        
    }
    
    public void viewModifyInfor(){
        
    }
    
    public void subjectRegistering(){
        
    }
    
    public void subjectCanceling(){
        
    }
    
    public String toString(){
        return this.subjectID + " " + this.subjectName; 
    }
    
}
