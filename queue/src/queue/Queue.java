/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

import java.util.Scanner;

/**
 *
 * @author Venersis
 */
public class Queue {

    public static String queue[] = new String[5];
    public static Scanner sc = new Scanner(System.in);
    public static String x, y,z;
    public static queue_element elem = new queue_element();

    public static void main(String[] args) {
        do{
        System.out.println("Queue? or Dequeue?");
        y = sc.next();
        switch (y) {
            case "queue":
                for (int i = 0; i < queue.length; i++) {
                    System.out.println("Add element to queue: ");
                    x = sc.next();
                    elem.queue(queue, i, x);
                }
                break;
            case "dequeue":
                elem.dequeue(queue);
                break;
        }
            System.out.println("End? or Loop?");
            z=sc.next();
        }while(z.equals("loop"));
    }

}
