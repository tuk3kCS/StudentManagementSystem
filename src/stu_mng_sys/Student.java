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
    
    Student(String fullName, String DoB, String Gender, String Address,String phoneNo, String classID,String Major){
        this.studentID = convertStudentID(); 
        this.fullName = fullName;
        this.DoB = DoB;
        this.Gender = Gender;
        this.Address = Address;
        this.Email = convertEmail(); 
        this.phoneNo = phoneNo;
        this.classID = classID; 
        this.Major = Major; 
    }
    
    public String convertStudentID(){ // convert to get studentID; 
        String res = ""; 
        int DoB = Integer.valueOf(this.DoB.substring(6,10)); 
        int tmp = 0;
        while(DoB != 0){
            tmp += DoB % 10; 
            DoB/=10; 
        }
        tmp += 18;
        String x = String.valueOf(tmp); 
        String word[] = this.Major.trim().split("\\s++");
        String majorTitle = ""; 
        for(int i = 0;i < word.length;i++){
            majorTitle += word[i].substring(0,1); 
        }
        res = "B"+x.substring(x.length()-2,x.length()) + "DC" + majorTitle + String.format("%04d",index); 
        index+=1;
        return res; 
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
    
    public String convertEmail(){ // convert to get Email for student
        String res = ""; 
        String word[] = this.fullName.trim().split("\\s++");
        res = word[word.length-1]; 
        for(int i = 0;i < word.length-1;i++){
            res += word[i].substring(0,1); 
        }
        res = res + "." + this.studentID + "@stu.ptit.edu.vn";
        return res.toLowerCase();
    }
    
    public String getEmail(){
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
