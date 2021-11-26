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
public class Link {

    public int id;
    public String nama;
    public int prioritas;
    public Link next;

    public Link(int id, String nama,int prioritas) {
        this.id = id;
        this.nama = nama;
        this.prioritas = prioritas;
    }

    public void displayLink() { 
        System.out.print(id +" "+nama+"\n");
    }
}
