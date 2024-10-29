
package stu_mng_sys;
import java.util.*;
public class Learning_Process_and_Scores {
    private float attendanceScore, processScore, midtermScore, finalScore;
    private double GPA; 

    public Learning_Process_and_Scores() {
        
    }
    
    public Learning_Process_and_Scores(float attendanceScore, float processScore, float midtermScore, float finalScore){
        this.attendanceScore = attendanceScore; 
        this.processScore = processScore; 
        this.midtermScore = midtermScore; 
        this.finalScore = finalScore; 
        this.GPA = 0.1*this.attendanceScore + 0.1*this.processScore + 0.2*this.midtermScore + 0.6 * this.finalScore;
    }
    
    public void setAttendanceScore(float d){
        if(d >= 0 && d <= 10) this.attendanceScore = d; 
    }
    
    public float getAttendanceScore(){
        return this.attendanceScore;
    }
    
    public void setProcessScore(float d){
        if(d >= 0 && d <= 10) this.processScore = d; 
    }
    
    public float getProcessScore(){
        return this.processScore; 
    }
    
    public void setMidtermScore(float d){
        if(d >= 0 && d <= 10) this.midtermScore = d; 
    }
    
    public float getMidtermScore(){
        return this.midtermScore; 
    }
    
    public void setFinalScore(float d){
        if(d >= 0 && d <= 10) this.finalScore = d; 
    }
    
    public float getFinalScore(){
        return this.finalScore; 
    }
    
    public double getGPA(){
        return this.GPA; 
    }
    
    public void viewLearningProcess(){
        
    }
    
    public void ModifyScore(){
        
    }
    
    public String toString(){
        return this.attendanceScore + " " + this.processScore + " " + this.midtermScore + " " + this.finalScore + " " + this.GPA; 
    }
    
}
