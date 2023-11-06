/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack2;

import java.util.Scanner;

/**
 *
 * @author Venersis
 */
public class Stack2 {

    public static int array[] = new int[5];
    public static Scanner sc = new Scanner(System.in);
    public static String x, z;
    public static int y;
    public static insert wow = new insert();

    public static void main(String[] args) {
        do {
            System.out.print("Insert? or Pop? : ");
            x = sc.next();
            switch (x) {

                case "insert":

                    for (int i = 0; i < array.length; i++) {
                        System.out.print("Type Number to Insert in index " + i + " : ");
                        y = sc.nextInt();
                        wow.insert(array, y, i);
                    }
                    System.out.println("Number in array: " + array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
                    break;
                case "pop":
                    for (int j = 1; j < array.length + 1; j++) {
                        z = sc.next();
                        wow.pop(array, j);

                    }
            }
            System.out.println("End? Or Loop?: ");
            z = sc.next();
        } while (z.equals("loop"));
    }

}
