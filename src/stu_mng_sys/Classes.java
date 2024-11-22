
package stu_mng_sys;
import java.util.*;
public class Classes {
    private String classID, Major;
    private ArrayList<Student> students; //Composition: A class has many students. 
    
    Classes(String classID, String Major,ArrayList<Student> student){
        this.classID = classID;
        this.Major = Major;
        this.students = student;
    }

    public void addNewClass(){
        
    }
    
    public void viewClassInfor(){
        
    }  
}
