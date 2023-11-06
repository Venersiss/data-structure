/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack2;

public class insert {
    
    public void insert(int [] array,int num, int index){
        
        array[index]=num;
    
    }
    
    public void pop (int [] array,int index){
    
        array[array.length-index]=0;
        System.out.println("Number in array: " + array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
    
    }
}
