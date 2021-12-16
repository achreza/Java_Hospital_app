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
public class LinkedList {

  
    private Link front;
    private Link rear;

    public LinkedList() {
        this.front = this.rear = null;
    }

    public void insert(int nim, String nama, int prioritas) {
        Link newLink= new Link(nim, nama,prioritas);
        if (this.rear == null) {
            this.front = this.rear = newLink;
            return;
        }
        this.rear.next = newLink;
        this.rear = newLink;        
    }

    public void remove() {
        if (this.front == null) {
            return;
        }
        Link temp  = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
    }
      public void displayList() {
        System.out.println("Queue(front-->rear):");
        Link current = front;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

  
}
