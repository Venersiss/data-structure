/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author Venersis
 */
public class queue_element {
    public void queue(String [] array,int index,String input){
    array[index]=input;
        System.out.println("Elements in queue: "+array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[4]+" ");
    }
    public void dequeue(String [] array){
    for(int i=0;i<array.length;i++){
        array[i]=null;
        System.out.println("Elements in queue: "+array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[4]+" ");
    }
    }
}
