/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_reverse;

import java.util.Scanner;

/**
 *
 * @author Venersis
 */
public class Stack_reverse {

    public static String array[] = new String[5];
    public static String array2[]=new String[5];
    public static Scanner sc = new Scanner(System.in);
    public static String x, z, y;    
    public static insert wow = new insert();

    public static void main(String[] args) {
        do {
            System.out.print("Insert? or Pop? : ");
            x = sc.next();
            switch (x) {

                case "insert":

                    for (int i = 0; i < array.length; i++) {
                        System.out.print("Type Letter to Insert in index " + i + " : ");
                        y = sc.next();
                        wow.insert(array, y, i);
                    }
                    System.out.println("Letter in array: " + array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
                    break;
                case "pop":
                    for (int j = 1; j < array.length + 1; j++) {
                        z = sc.next();
                        wow.pop(array, j,array2);

                    }
            }
            System.out.println("End? Or Loop?: ");
            x = sc.next();
        } while (x != "end");
    }

}
