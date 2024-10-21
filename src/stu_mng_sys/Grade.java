/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student_Management_System;
import java.util.*; 
public class Grade {
    private ArrayList<Float> gpa; 
    Grade(){
        gpa = new ArrayList<>(); 
    }
    
    public void setGpa(ArrayList<Float>gpa){
        this.gpa = gpa;
    }
    
    public ArrayList getGpa(){
        return this.gpa; 
    }
    
    public String toString(){
        String res = " ";
        for(int i = 0;i < this.gpa.size();i++){
            res = res + this.gpa.get(i) + " "; 
        }
        return res;
    }
}
