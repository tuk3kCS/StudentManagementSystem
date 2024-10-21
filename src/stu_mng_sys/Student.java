
package stu_mng_sys;
import java.util.*; 
public class Student extends User{
    Scanner sc = new Scanner(System.in); 
    private String name, DoB, phoneNo, Email, studentID,classRoom,tuitionFeeStatus;  
    private ArrayList<Pair<Courses,String>> enrolledCourses; 
    private long tuitionFee; 
    
    Student(){
        enrolledCourses = new ArrayList<Pair<Courses,String>>(); 
    }
    
    Student(String name, String Dob, String phoneNo, String email, String stuID, String classroom, ArrayList<Pair<Courses,String>>enrolledCourses, long tuitionFee, String tuitionFeeStatus){
        this.name = name;
        this.DoB = Dob;
        this.phoneNo = phoneNo;
        this.Email = email; 
        this.studentID = stuID; 
        this.classRoom = classroom; 
        this.enrolledCourses = enrolledCourses;
        this.tuitionFee = tuitionFee;
        this.tuitionFeeStatus = tuitionFeeStatus; 
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
    
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo; 
    }
    
    public String getPhoneNo(){
        return this.phoneNo; 
    }
    
    public void setEmail(String email){
        this.Email = email; 
    }
    
    public String getEmail(){
        return this.Email; 
    }
    
    public void setStudentID(String ID){
        this.studentID = ID; 
    }
    
    public String getStudentID(){
        return this.studentID; 
    }
    
    public void setClassroom(String classroom){
        this.classRoom = classroom; 
    }
    
    public String getClassroom(){
        return this.classRoom; 
    }
    
    public void setEnrollCourses(ArrayList<Pair<Courses,String>>enrolledCourses){
        this.enrolledCourses = enrolledCourses; 
    }
    
    public void getEnrollCourses(){
        System.out.println("Enrolled Courses:");
        for(Pair<Courses,String>pair:this.enrolledCourses){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
    
    public String getSchedule(){
        String schedule = sc.nextLine(); 
        return schedule; 
    }
    
    public void getGrade(){
        Grade x = new Grade(); 
        System.out.println(x);
    }
    
    public long getTuitionFee(){
        return this.tuitionFee; 
    }
    
    public String getTuitionFeeStatus(){
        return this.tuitionFeeStatus; 
    }
    
    public String toString(){
        return this.studentID + " " + this.name + " " + this.Email + " " + this.DoB + " " + this.classRoom; 
    }
    
}
