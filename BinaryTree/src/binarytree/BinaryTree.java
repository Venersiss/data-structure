 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytree;

/**
 *
 * @author Venersis
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        method method=new method();
        method.insert(10);
        method.insert(10);
        method.insert(10);
        method.insert(10);
        method.insert(10);
       
        
        method.inorder();
        method.depth();
        method.BSTVerifier();
        method.LCAfinder();
    }
    
}
