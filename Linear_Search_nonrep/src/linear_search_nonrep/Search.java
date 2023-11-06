/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linear_search_nonrep;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Random;
import javax.xml.transform.sax.SAXSource;
import static linear_search_nonrep.Linear_Search_nonrep.x;

/**
 *
 * @author Venersis
 */
public class Search {

    public static Random rand = new Random();

    public void search(int[] array, int index) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                System.out.println("The number: " + index + " is in the index: " + i);
            }
           
                
        }
        

    }

    public void generate(int[] array) {

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            int a = random.nextInt(49) + 1; // this will give numbers between 1 and 50.

            if (!arrayList.contains(a)) {
                arrayList.add(a);
                array[i] = a;

            }
        }
    }

    public static String check(int[] array) {
        String x = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                x = "not";
            } else {
                x = "zero";
            }
        }
        return x;
    }
}
