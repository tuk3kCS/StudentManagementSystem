
package stu_mng_sys;
import java.util.*;
public class Subject {
    private String subjectID, subjectName;
    private Student student; // Subject class associate with Student class. 
    
    Subject(String subjectID, String subjectName, Student student){
        this.subjectID = subjectID;
        this.subjectName = subjectName; 
        this.student = student;
    }
    
    public void addNewProject(){
        
    }
    
    public void viewModifySubjectInfor(){
        
    }
    
    public void subjectRegistering(){
        
    }
    
    public void subjectCanceling(){
        
    }
    
    public String toString(){
        return this.subjectID + " " + this.subjectName + " " + this.student;
    }
    
}
