
package Student_Management_System;
import java.util.*; 
public class Student extends User{
    Scanner sc = new Scanner(System.in); 
    private String name, DoB, phoneNo, Email, studentID,classRoom; 
    private HashMap<Courses,Boolean> enrolledCourses;
    
    Student(){
        enrolledCourses = new HashMap<>(); 
    }
    
    Student(String name, String DoB, String phoneNo, String Email,String studentID, String classRoom, HashMap<Courses,Boolean> enrollCourses){
        this.name = name;
        this.DoB = DoB; 
        this.phoneNo = phoneNo; 
        this.Email = Email; 
        this.studentID = studentID; 
        this.classRoom = classRoom; 
        this.enrolledCourses = enrollCourses; 
    }
    
    public void setName(){
        String name = sc.nextLine();
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setDob(){
        String Dob = sc.nextLine(); 
        this.DoB = Dob; 
    }
    
    public String getDob(){
        return this.DoB; 
    }
    
    public void setPhoneNo(){
        String phoneNo = sc.nextLine();
        this.phoneNo = phoneNo; 
    }
    
    public String getPhoneNo(){
        return this.phoneNo; 
    }
    
    public void setEmail(){
        String email = sc.nextLine();
        this.Email = email; 
    }
    
    public String getEmail(){
        return this.Email; 
    }
    
    public void setStudentID(){
        String ID = sc.nextLine(); 
        this.studentID = ID; 
    }
    
    public String getStudentID(){
        return this.studentID; 
    }
    
    public void setClassroom(){
        String classroom = sc.nextLine();
        this.classRoom = classroom; 
    }
    
    public String getClassroom(){
        return this.classRoom; 
    }
    
    public void setEnrollCourses(HashMap<Courses,Boolean>enrolledCourse){
        this.enrolledCourses = enrolledCourse; 
    }
    
    public void getEnrollCourses(){
        System.out.println("Enrolled Courses:");
        for(Courses course:enrolledCourses.keySet()){
            System.out.println(course + ": " + ((enrolledCourses.get(course)) ? "Enrolled" : "Not Enrolled"));
        }
    }
    
    public String getSchedule(){
        String schedule = sc.nextLine();
        return schedule; 
    }
    
    public void getGrade(){
        
    }
    
    public void getTuitionFee(){
        
    }
    
    public String toString(){
        return this.studentID + " " + this.name + " " + this.Email + " " + this.DoB + " " + this.classRoom; 
    }
    
}
