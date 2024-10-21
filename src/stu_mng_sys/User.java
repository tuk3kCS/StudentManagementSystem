
package Student_Management_System;
import java.util.*; 
public class User {
    Scanner sc = new Scanner(System.in); 
    private String UserName,Password,Role,ID; 
    
    User(){
        
    }
    
    User(String UserName,String Password, String Role,String ID){
        this.UserName = UserName;
        this.Password = Password;
        this.Role = Role;
        this.ID = ID; 
    }
    
    public void setUsername(String UserName){
        this.UserName = UserName; 
    }
    
    public String getUsername(){
        return this.UserName;
    }
    
    public void setRole(String Role){
        this.Role = Role; 
    }
    
    public String getRole(){
        return this.Role;
    }
    
    public void getID(){
        String ID = sc.nextLine();
        this.ID = ID; 
    }
    
    public void setPassword(String Password){
        this.Password = Password; 
    }
    
    public String getPassword(){
        return this.Password; 
    }
    
    public String toString(){
        return this.ID + " " + this.UserName + " " + this.Password + " " + this.Role; 
    }
    
}
