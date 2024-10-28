
package stu_mng_sys;
import java.util.*;
public class Learning_Process_and_Scores {
    private float attendanceScore, processScore, midtermScore, finalScore, GPA; 

    public Learning_Process_and_Scores() {
        
    }
    
    public Learning_Process_and_Scores(float attendanceScore, float processScore, float midtermScore, float finalScore,float GPA){
        this.attendanceScore = attendanceScore; 
        this.processScore = processScore; 
        this.midtermScore = midtermScore; 
        this.finalScore = finalScore; 
        this.GPA = GPA; 
    }
    
    public void setAttendanceScore(float d){
        this.attendanceScore = d; 
    }
    
    public float getAttendanceScore(){
        return this.attendanceScore;
    }
    
    public void setProcessScore(float d){
        this.processScore = d; 
    }
    
    public float getProcessScore(){
        return this.processScore; 
    }
    
    public void setMidtermScore(float d){
        this.midtermScore = d; 
    }
    
    public float getMidtermScore(){
        return this.midtermScore; 
    }
    
    public void setFinalScore(float d){
        this.finalScore = d; 
    }
    
    public float getFinalScore(){
        return this.finalScore; 
    }
    
    public float getGPA(){
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
