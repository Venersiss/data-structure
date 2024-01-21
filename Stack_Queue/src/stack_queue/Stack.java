/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_queue;

/**
 *
 * @author Venersis
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Methods method = new Methods();
       
       method.push(10);
       method.push(9);
       method.push(100);
       method.print();
       method.peek();
       method.pop();
       method.pop();
       method.print();
       method.peek();
    }
    
}
