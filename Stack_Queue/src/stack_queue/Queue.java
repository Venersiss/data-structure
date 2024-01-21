/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_queue;

/**
 *
 * @author Venersis
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Methods method = new Methods();
        
        method.enqueue(12);
        method.enqueue(123);
        method.enqueue(444);
        method.print();
       
        method.dequeue();
        method.print();
       
        method.dequeue();
        method.print();
     
        method.dequeue();
        method.print();
      
    }
    
}
