/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package link_starto;

/**
 *
 * @author User
 */
public class Link_Starto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Methods method = new Methods();

        method.dungag(5);
        method.dungag(10);
        method.dungag(100);
        method.dungag(200);

        method.insertsaSugod(25);

        method.insertsa(0, 17);
        method.insertsa(3, 77);

        method.print();

        method.deleteangvaluesa(2);

        method.print();
    }

}
