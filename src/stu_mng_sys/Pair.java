/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stu_mng_sys;
public class Pair<K,V>{
    private K Courses;
    private V Status; 
    
    Pair(K courses, V status){
        this.Courses = courses;
        this.Status = status;
    }
    
    public K getKey(){
        return Courses; 
    }
    
    public V getValue(){
        return Status; 
    }
    
    public String toString(){
        return Courses + " " + Status; 
    }
    
}
