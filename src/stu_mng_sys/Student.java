/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stu_mng_sys;
import java.util.*;
public class Student {
    private String studentID, fullName, DoB, Gender, Address, Email, phoneNo, classID,Major; 
    public int index = 0; 
    
    Student(String fullName, String DoB, String Gender, String Address,String phoneNo, String classID,String Major){
        this.fullName = fullName; 
        this.DoB = DoB; 
        this.Gender = Gender;
        this.Address = Address;
        this.Email = "";  
        this.phoneNo = phoneNo;
        this.classID = classID; 
        this.Major = Major; 
        this.studentID = "";
        index++; 
    }
    
    public String getStudentID(){ // convert to get studentID; 
        String res = "";

        String dob[] = this.DoB.trim().split("/");
        int YoB = Integer.valueOf(dob[2].substring(2,4));
        String courseYear = String.valueOf((YoB+18)%100);

        String major[] = this.Major.trim().split("\\s++");
        String majorTitle = "";
        for(int i=0; i<=1; i++){
            majorTitle += major[i].substring(0,1);
        }

        res = "B" + courseYear + "DC" + majorTitle + String.format("%03d",index);
        return res.toUpperCase(); 
    }
    
    public String convertFullName(String fullName){
        String name[] = fullName.trim().split("\\s++");
        String res = "";
        for(int i=0 ; i<name.length;i++){
            res = res + name[i].substring(0,1).toUpperCase() + name[i].substring(1).toLowerCase() + " ";
        }
        return res;
    }

    public String setDoB(String s){
        if(s.charAt(1) == '/') s = "0" + s; 
        if(s.charAt(4) == '/') s = s.substring(0,3) + "0" + s.substring(3); 
        return s;  
    }
    
    public String convertEmail(){ // convert to get Email for student
        String res = "";

        String name[] = this.fullName.trim().split("\\s++");
        String firstname = name[name.length-1];
        res += name[name.length-1];

        for(int i = 0;i < name.length-1;i++){
            res += name[i].substring(0,1);
        }
        res = res + "." + getStudentID() + "@stu.ptit.edu.vn";
        return res.toLowerCase();
    }
    
    public void addNewStudent(){
        
    }
    
    public void viewModifyInfor(){
        
    }
    
    public String toString(){
        this.DoB = setDoB(DoB);
        this.studentID = getStudentID();
        this.Email = convertEmail();
        this.fullName = convertFullName(fullName); 
        return this.studentID + " " + this.fullName + " " + this.DoB + " " + this.phoneNo + " " + this.Email + " " + this.Gender + " " + this.Address + " " + this.Major + " " + this.classID; 
    }
    
}
