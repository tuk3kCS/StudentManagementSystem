
package stu_mng_sys;
import java.util.*; 
public class Lecturer extends User{
    Scanner sc = new Scanner(System.in); 
    private String name, DoB, phoneNo, Email, lecID; 
    Lecturer(){
        
    }
    
    Lecturer(String name, String DoB, String phoneNo, String email, String lecID){
        this.name = name;
        this.DoB = DoB;
        this.phoneNo = phoneNo;
        this.Email = email;
        this.lecID = lecID; 
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setDob(String Dob){
        this.DoB = Dob; 
    }
    
    public String getDob(){
        return this.DoB; 
    }
    
    public void setPhoneno(){
        String phoneNo = sc.nextLine(); 
        this.phoneNo = phoneNo; 
    }
    
    public String getPhoneno(){
        return this.phoneNo; 
    }
    
    public void setEmail(){
        String email = sc.nextLine(); 
        this.Email = email; 
    }
    
    public String getEmail(){
        return this.Email; 
    }
    
    public void setLecID(){
        String lecID = sc.nextLine();
        this.lecID = lecID; 
    }
    
    public String getLecID(){
        return this.lecID; 
    }
    
    public String toString(){
        return this.lecID + " " + this.name + " " + this.DoB + " " + this.phoneNo + " " + this.Email; 
    } 
    
}
