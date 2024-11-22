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
        int DoB = Integer.valueOf(this.DoB.substring(6)); 
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
        res = "B"+x.substring(x.length()-2,x.length()) + "DC" + majorTitle + String.format("%03d",index); 
        return res.toUpperCase(); 
    }
    
    public String convertFullName(String fullName){
        String word[] = fullName.trim().split("\\s++");
        String res = "";
        for(int i = 0;i < word.length;i++){
            res = res + word[i].substring(0,1).toUpperCase() + word[i].substring(1).toLowerCase() + " "; 
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
        String word[] = this.fullName.trim().split("\\s++");
        res = word[word.length-1]; 
        for(int i = 0;i < word.length-1;i++){
            res += word[i].substring(0,1); 
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
