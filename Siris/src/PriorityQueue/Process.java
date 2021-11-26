/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityQueue;

/**
 *
 * @author 62852
 */
class Process {
    private final int processNumber;
    private final int priority;
    private final String nama;
    private int timeToCompletion;
    
    public Process(int newNumber, int newPriority,String nama){
        processNumber = newNumber;
        priority = newPriority;
        timeToCompletion = 1;
        this.nama = nama;
    }
    
    public int getPriority(){
        return priority;
    }
    
    public int getProcessNumber(){
        return processNumber;
    }
    
    public int getTimeToCompletion(){
        return timeToCompletion;
    }
    
    public void doWork(){
        if(timeToCompletion > 0){
            timeToCompletion--;
        }
    }

    public String getNama() {
        return nama;
    }
    
    
}
