
package stu_mng_sys;
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
        
    }
    
    public void ModifyScore(){
        
    }
    
    public String toString(){
        return this.attendanceScore + " " + this.processScore + " " + this.midtermScore + " " + this.finalScore + " " + " " + this.student + " " + this.subject;
    }
    
}
