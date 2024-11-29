
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
    
    public void addNewSubject(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject ID: ");
        String subjectID = sc.nextLine();
        System.out.println("Enter subject name: ");
        String subjectName = sc.nextLine();
    }
    
    public void viewModifySubjectInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject ID: ");
        String searchID = sc.nextLine();

        if(this.subjectID.equals(searchID)){
            System.out.println("Subject information: ");
            System.out.println(toString());

            System.out.println("Do you want to modify the subject information? (y/n)");
            String option = sc.nextLine();
            if(option.equalsIgnoreCase("y")){
                System.out.println("Enter new subject name: ");
                String newSubjectName = sc.nextLine();
                this.subjectName = newSubjectName;

                System.out.println("Subject information updated successfully.");
            };
        }else{
            System.out.println("Subject is not existed.");
        }
    }
    
    public void subjectRegistering(Student student){
        this.student = student;
        System.out.println("Student " + student.toString() + " has been registered for subject " + subjectName + ".");
    }
    
    public void subjectCanceling(Student student){
        if(this.student.equals(student)){
            this.student = null;
            System.out.println("Student " + student.toString() + " has been cancelled for subject " + subjectName + ".");
        }else{
            System.out.println("Student did not register for this subject.");
        }
    }
    
    public String toString(){
        return this.subjectID + " " + this.subjectName + " " + this.student;
    }
    
}
