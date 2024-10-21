/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student_Management_System;
import java.util.*;
public class TuitionFee {
    private long totalFee; 
    private String Status;
    
    TuitionFee(){
        
    }
    
    TuitionFee(long totalFee, String Status){
        this.totalFee = totalFee;
        this.Status = Status;
    }
    
    public void setTotalFee(long totalFee){
        this.totalFee = totalFee; 
    }
    
    public long getTotalFee(){
        return this.totalFee; 
    }
    
    public void setStatus(String status){
        this.Status = status;
    }
    
    public String getStatus(){
        return this.Status; 
    }
    
    public String toString(){
        return this.totalFee + " " + this.Status; 
    }
    
}
