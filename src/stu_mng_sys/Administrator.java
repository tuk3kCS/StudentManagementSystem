
package stu_mng_sys; 
import java.util.*; 
public class Administrator{
    private String UserName,Password,Role; 
    Administrator(){
        
    }
    
    Administrator(String UserName, String Password, String Role){
        this.UserName = UserName;
        this.Password = Password;
        this.Role = Role; 
    }
    
    public void setUsername(String UserName){
        this.UserName = UserName; 
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
    
    public void setGrade(){
        
    }
    
    public void setTutionFee(){
        
    }
    
    public void setTuitionFeeStatus(){
        
    }
    
    public String toString(){
        return this.UserName + " " + this.Password + " " + this.Role; 
    }
}
