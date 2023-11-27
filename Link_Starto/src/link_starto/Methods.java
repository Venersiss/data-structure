/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package link_starto;

/**
 *
 * @author User
 */
public class Methods {

    Node ulo_sa_baha;

    public void dungag(int input) {
        Node node = new Node();
        node.data = input;
        node.next = null;

        if (ulo_sa_baha == null) {
            ulo_sa_baha = node;
        } else {
            Node n = ulo_sa_baha;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void print() {
        Node node = ulo_sa_baha;

        while (node.next != null) {
            System.out.print("[" + node.data + "], ");
            node = node.next;
        }
        System.out.println("[" + node.data + "]");
    }

    public void insertsaSugod(int input) {
        Node node = new Node();
        node.data = input;
        node.next = null;
        node.next = ulo_sa_baha;
        ulo_sa_baha = node;
    }

    public void insertsa(int index, int input) {
        Node node = new Node();
        node.data = input;
        node.next = null;

        if (index == 0) {
            insertsaSugod(input);
        } else {
            Node n = ulo_sa_baha;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
                if (n == null) {
                    System.out.println("Nalapas imong index bogo!");
                }
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteangvaluesa(int index) {
        if (index == 0) {
            ulo_sa_baha = ulo_sa_baha.next;
        } else {
            Node n = ulo_sa_baha;
            Node n1 = null;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
                if (n == null) {
                    System.out.println("Nalapas imong index bogo!");
                }
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("Imoha gi delete ang [" + n1.data + "] yeyyy");
            n1 = null;
        }
    }
}
