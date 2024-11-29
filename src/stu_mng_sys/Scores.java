
package stu_mng_sys;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scores  {
    private float attendanceScore, processScore, midtermScore, finalScore;
    private Student student; // Associate with Student class
    private Subject subject;// Compostion with Subject

    public Scores(){
        
    }
    
    public Scores (float attendanceScore, float processScore, float midtermScore, float finalScore, Student student, Subject subject){
        this.attendanceScore = setAttendanceScore(attendanceScore);
        this.processScore = setProcessScore(processScore);
        this.midtermScore = setMidtermScore(midtermScore); 
        this.finalScore = setFinalScore(finalScore);
        this.student = student;
        this.subject = subject;
    }
    
    public float setAttendanceScore(float d){
        if(d >= 0 && d <= 10) {
            this.attendanceScore = d;
            return this.attendanceScore;
        }
        else return 0; 
    }
    
    public float setProcessScore(float d){
        if(d >= 0 && d <= 10){
            this.processScore = d; 
            return this.processScore;
        }
        else return 0; 
    }
    
    
    public float setMidtermScore(float d){
        if(d >= 0 && d <= 10){
            this.midtermScore = d; 
            return this.midtermScore;
        }
        else return 0; 
    }
    
    public float setFinalScore(float d){
        if(d >= 0 && d <= 10){
            this.finalScore = d; 
            return this.finalScore;
        }
        else return 0;
    }
    
    
    public void viewLearningProcess(){
        //Display scores of student in subject
        System.out.println("Learning Process for " + student.getFullName() + " in " + subject.getSubjectName());

        //Display scores
        System.out.println("Scores: ");
        System.out.println("Attendance Score: " + attendanceScore);
        System.out.println("Process Score: " + processScore);
        System.out.println("Midterm Score: " + midtermScore);
        System.out.println("Final Score: " + finalScore);

        //Calculate and display GPA
        float gpa = (attendanceScore*0.1f) + (processScore*0.1f) + (midtermScore*0.2f) + (finalScore*0.6f);
        System.out.println("GPA: " + gpa);
    }
    
    public void ModifyScore(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Modify scores for " + student.getFullName() + " in " + subject.getSubjectName());

        System.out.print("Enter new Attendance Score: ");
        float newAttendance = sc.nextFloat();
        setAttendanceScore(newAttendance);

        System.out.print("Enter new Process Score: ");
        float newProcess = sc.nextFloat();
        setProcessScore(newProcess);

        System.out.print("Enter new Midterm Score: ");
        float newMidterm = sc.nextFloat();
        setMidtermScore(newMidterm);

        System.out.print("Enter new Final Score: ");
        float newFinal = sc.nextFloat();
        setFinalScore(newFinal);

        System.out.println("Scores updated successfully!");

        //Display updated scores
        viewLearningProcess();
    }
    
    public String toString(){
        return this.attendanceScore + " " + this.processScore + " " + this.midtermScore + " " + this.finalScore + " " + " " + this.student + " " + this.subject;
    }
    
}
