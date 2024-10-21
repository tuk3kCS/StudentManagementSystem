
package Student_Management_System;
import java.util.*; 
public class Administrator{
    private String UserName,Password,Role; 
    Administrator(){
        
    }
    
    public void setUsername(String UserName){
        this.UserName = UserName;
        this.Password = Password;
        this.Role = Role; 
    }
    
    public String getUsername(){
        return this.UserName; 
    }
    
    public void createUser(){
        
    }
    
    public void modifyUser(){
        
    }
    
    public void createClassroom(){
        
    }
    
    public void modifyClassroom(){
        
    }
    
    public void createTuitionFee(){
        
    }
    
    public void modifyTuitionFee(){
        
    }
    
    public void createCourse(){
        
    }
    
    public void modifyCourse(){
        
    }
    
    public String toString(){
        return this.UserName + " " + this.Password + " " + this.Role; 
    }
}
