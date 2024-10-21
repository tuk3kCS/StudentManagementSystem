
package stu_mng_sys;
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
     
    public void getID(){
        String ID = sc.nextLine();
        this.ID = ID; 
    }
     
    public String toString(){
        return this.ID + " " + this.UserName + " " + this.Password + " " + this.Role; 
    }
    
}
