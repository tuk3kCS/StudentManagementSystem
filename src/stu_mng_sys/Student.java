/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stu_mng_sys;
import java.util.*;
public class Student {
    private String studentID, fullName, DoB, Gender, Address, Email, phoneNo, classID,Major; 
    public int index = 1; 
    Student(){
        
    }
    
    Student(String studentID, String fullName, String DoB, String Gender, String Address, String Email, String phoneNo, String classID,String Major){
        this.studentID = studentID; 
        this.fullName = fullName;
        this.DoB = DoB;
        this.Gender = Gender;
        this.Address = Address;
        this.Email = Email;
        this.phoneNo = phoneNo;
        this.classID = classID; 
        this.Major = Major; 
    }
    
    public void setStudentID(){ 
        int DoB = Integer.valueOf(this.DoB.substring(6,10)); 
        int tmp = 0;
        while(DoB != 0){
            tmp += DoB % 10; 
            DoB/=10; 
        }
        tmp += 18;
        String x = String.valueOf(tmp); 
        this.studentID = "B"+x.substring(x.length()-2,x.length()) + this.Major.substring(0,2) + String.format("%04d",index); 
        index+=1; 
    }
    
    public String getStudentID(){
        return this.studentID.toUpperCase(); 
    }
    
    public void setfullName(String s){
        this.fullName = s; 
    }
    
    public String getfullName(){
        return this.fullName; 
    }
    
    public void setDoB(String s){
        this.DoB = s; 
    }
    
    public String getDoB(){
        return this.DoB; 
    }
    
    public void setGender(String s){
        this.Gender = s; 
    }
    
    public String getGender(){
        return this.Gender; 
    }
    
    public void setAddress(String s){
        this.Address = s; 
    }
    
    public String getAddress(){
        return this.Address; 
    }
    
    public String getEmail(){
        String res[] = this.fullName.trim().split("\\s++");
        this.Email = res[res.length-1]; 
        for(int i = 0;i < res.length-1;i++){
            this.Email += res[i].substring(0,1); 
        }
        this.Email = this.Email + "." + this.studentID + "@stu.ptit.edu.vn";
        return this.Email.toLowerCase();
    }
    
    public void setPhoneNo(String s){
        this.phoneNo = s; 
    }
    
    public String getPhoneNo(){
        return this.phoneNo; 
    }
    
    public void setMajor(String s){
        this.Major = s; 
    }
    
    public String getMajor(){
        return this.Major; 
    }
    
    public void setClassID(String s){
        this.classID = s; 
    }
    
    public String getClassID(){
        return this.classID;
    }
    
    public void addNewStudent(){
        
    }
    
    public void viewModifyInfor(){
        
    }
    
    public String toString(){
        return this.studentID + " " + this.fullName + " " + this.DoB + " " + this.phoneNo + " " + this.Email + " " + this.Gender + " " + this.Address + " " + this.Major + " " + this.classID; 
    }
    
}
