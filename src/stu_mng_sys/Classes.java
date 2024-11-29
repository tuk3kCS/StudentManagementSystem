
package stu_mng_sys;
import java.util.*;
public class Classes {
    private String classID, Major;
    private ArrayList<Student> students; //Composition: A class has many students.

    public static ArrayList<Classes> classList = new ArrayList<>();

    public Classes(String classID, String Major){
        this.classID = classID;
        this.Major = Major;
        this.students = new ArrayList<>();
    }

    public String getClassID() {
        return classID;
    }

    public void addNewClass(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class ID: ");
        String classID = sc.nextLine();
        System.out.print("Enter major: ");
        String Major = sc.nextLine();

        // Check the Class are exist or not based on classID
        Classes newClass = new Classes(classID, Major);
        String newclassID = newClass.getClassID();
        for (Classes c : classList){
            if(c.getClassID().equals(newclassID)){
                System.out.println("Class is already exists.");
                return;
            }
        }
        classList.add(newClass);
    }

    public void addStudentToClass(Student student){
        if(!students.contains(student)){
            students.add(student);
        }else{
            System.out.println("Student already in class");
        }
    }
    
    public void viewClassInfor(){
        System.out.println("ClassID: " + classID);
        System.out.println("Major: " + Major);
        System.out.println("Students: ");
        for(Student student : students){
            System.out.println(student.toString());
        }
    }  
}
