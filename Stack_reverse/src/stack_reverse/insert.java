/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack_reverse;

/**
 *
 * @author Venersis
 */
public class insert {
      public void insert(String [] array,String input, int index){
        
        array[index]=input;
    
    }
    
    public void pop (String [] array,int index,String [] array2){
        array2[index-1]=array[array.length-index];
        array[array.length-index]=null;       
        System.out.println("Letter in array: " + array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
        System.out.println("Reversed elements of array: "+ array2[0] + " " + array2[1] + " " + array2[2] + " " + array2[3] + " " + array2[4]);
    }
}
