/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linear_search;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Venersis
 */
public class Linear_Search {

    public static Random rand = new Random();
    public static int x[] = new int[10];
    public static Scanner sc = new Scanner(System.in);
    static Search Search = new Search();

    public static void main(String[] args) {

        for (int i = 0; i < x.length; i++) {
            int ans = rand.nextInt(10);
            System.out.println(ans);
            x[i] = ans;
        }
        System.out.println("Number in each index: " + x[0] + " " + x[1] + " " + x[2] + " " + x[3] + " " + x[4] + " " + x[5] + " " + x[6] + " " + x[7] + " " + x[8] + " " + x[9]);
        System.out.print("Input number to search: ");
        int index = sc.nextInt();
        Search.search(x, index);
    }
}
