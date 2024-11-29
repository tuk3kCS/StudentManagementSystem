package stu_mng_sys;
import java.util.*;
public class Subject {
    private String subjectID, subjectName;
    private ArrayList<Student> enrolledStudents; // Danh sách sinh viên đã đăng ký.
    
    Subject(String subjectID, String subjectName, Student student){
        this.subjectID = subjectID;
        this.subjectName = subjectName; 
        this.enrolledStudents = new ArrayList<>();
    }

    public String getSubjectName() {
        return subjectName;
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

    // Đăng ký môn học cho sinh viên
    public void subjectRegistering(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            System.out.println("Student " + student.getFullName() + " has been registered for subject " + subjectName);
        } else {
            System.out.println("Student " + student.getFullName() + " is already registered for this subject.");
        }
    }

    // Hủy đăng ký môn học cho sinh viên
    public void subjectCanceling(Student student) {
        if (enrolledStudents.remove(student)) {
            System.out.println("Student " + student.getFullName() + " has been canceled from subject " + subjectName);
        } else {
            System.out.println("Student " + student.getFullName() + " is not registered for this subject.");
        }
    }

    @Override
    public String toString() {
        StringBuilder studentNames = new StringBuilder();
        for (Student student : enrolledStudents) {
            studentNames.append(student.getFullName()).append(", ");
        }
        return "Subject ID: " + subjectID + ", Subject Name: " + subjectName + ", Enrolled Students:  + studentNames.toString() + ";
    }
}
