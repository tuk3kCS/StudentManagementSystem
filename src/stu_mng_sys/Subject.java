package stu_mng_sys;
import java.util.*;
import java.io.*;
public class Subject implements Serializable {
    private String subjectID, subjectName;
    private ArrayList<Student> enrolledStudents; // Danh sách sinh viên đã đăng ký.
    
    public Subject(String subjectID, String subjectName){
        this.subjectID = subjectID;
        this.subjectName = subjectName; 
        this.enrolledStudents = new ArrayList<>();
    }

    public String getSubjectName(){
        return this.subjectName;
    }

    public void addNewSubject(String SubjectName) {
        System.out.println("Subject '" + SubjectName + "' has been added to subject " + subjectName);
    }
    
    public void viewModifySubjectInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject ID: ");
        String searchID = sc.nextLine();

        if(this.subjectID.equals(searchID)){
            System.out.println("Subject information: ");
            System.out.println(this);

            System.out.println("Do you want to modify the subject information? (y/n)");
            String option = sc.nextLine();
            if(option.equalsIgnoreCase("y")){
                System.out.println("Enter new subject name: ");
                this.subjectName = sc.nextLine();

                System.out.println("Subject information updated successfully.");
            }
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

    // ghi thong tin mon hoc vao file nhi phan
    public static void writeSubjectToFile(String fileName, Subject subject) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName, true))) {
            os.writeObject(subject);
            System.out.println("Subject information saved to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occured while wrting to the file.");
        }
    }


    // doc thong tin mon hoc tu file nhi phan
    public static ArrayList<Subject> readSubjectFromFile(String fileName) throws ClassNotFoundException{
        ArrayList<Subject>subjects = new ArrayList<>();
        try(ObjectInputStream os = new ObjectInputStream(new FileInputStream(fileName))){
            while(true){
                Subject subject = (Subject) os.readObject();
                subjects.add(subject);
            }
        }catch(EOFException e){
            // Khi gap cau nay la khong con gi de doc nua
        }catch(IOException e){
            System.out.println("An error occured while reading the file.");
        }
        return subjects;
    }


    @Override
    public String toString() {
        StringBuilder studentNames = new StringBuilder();
        for (Student student : enrolledStudents) {
            studentNames.append(student.getFullName()).append(", ");
        }
        return "Subject ID: " + subjectID + ", Subject Name: " + subjectName + ", Enrolled Students:"  + studentNames;
    }
}
// BE PHAN DUOI NAY VAO HAM MAIN NEU CAN
/*
        Scanner sc = new Scanner(System.in);
        ArrayList<Subject> subjectList = new ArrayList<>();
        String fileName = "Subject.in";

        // Kiểm tra xem file có tồn tại và có dữ liệu không
        File file = new File(fileName);
        if (file.exists() && file.length() > 0) {
            try {
                subjectList.addAll(Subject.readSubjectFromFile(fileName));
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found exception: " + e.getMessage());
            }
        }

        while (true) {
            System.out.println("1. Add new subject");
            System.out.println("2. View all subjects");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // them mon hoc moi
                    System.out.print("Enter subject ID: ");
                    String subjectID = sc.nextLine();
                    System.out.print("Enter subject name: ");
                    String subjectName = sc.nextLine();

                    Subject newSubject = new Subject(subjectID, subjectName);
                    subjectList.add(newSubject);
                    Subject.writeSubjectToFile(fileName, newSubject); // Ghi môn học vào file
                    System.out.println("Subject added successfully!");
                    break;

                case 2: // xem danh sach mon hoc
                    System.out.println("List of Subjects:");
                    for (Subject subject : subjectList) {
                        System.out.println(subject);
                    }
                    break;

                case 3: // thoat
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
*/
