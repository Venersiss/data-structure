/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashtable;

/**
 *
 * @author Venersis
 */
public class HashTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Methods <String, Integer> myHashTable = new Methods<>();

        myHashTable.put("one", 100);
        myHashTable.put("two",1000);
        myHashTable.put("three", 10000);

        System.out.println("Value sa key 'two': " + myHashTable.get("two"));

        myHashTable.put("two", 2000); // Update ang value sa key 'two'

        System.out.println("Updated value sa key 'two': " + myHashTable.get("two"));

        myHashTable.remove("one");// remove ang data sa key one

        System.out.println("Size sa hash table: " + myHashTable.size());
    }
    
}
