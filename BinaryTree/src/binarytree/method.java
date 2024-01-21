/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarytree;

class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;

    }
}

public class method {

    Node root;

    public void insert(int data) {

        root = insert(root, data);

    }

    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {

            root.left = insert(root.left, data);
        } else if (data > root.data) {

            root.right = insert(root.right, data);
        }
        return root;
    }

    public void inorder() {
        inOrderTraversal(root);
    }

    public void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public int maxDepth(Node root) {
        // Base case: If the tree is empty, the depth is 0
        if (root == null) {
            return 0;
        }

        // Recursively calculate the depth of the left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // The maximum depth is the greater of the left and right subtree depths, plus 1 for the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public void depth() {
        int depth = maxDepth(root);
        System.out.println("\n Maximum Depth of the Binary Tree: " + depth);

    }
    // Helper function for in-order traversal

    public boolean isBST(Node root, Integer min, Integer max) {
        // Base case: an empty tree is a BST
        if (root == null) {
            return true;
        }

        // Check if the current node's value is within the valid range
        if ((min != null && root.data <= min) || (max != null && root.data >= max)) {
            return false;
        }

        // Recursively check the left and right subtrees with updated ranges
        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }

    // Main function to check if a binary tree is a BST
    public boolean isBST(Node root) {
        // Use Integer.MIN_VALUE and Integer.MAX_VALUE as initial range limits
        return isBST(root, null, null);
    }

    public void BSTVerifier(){
    boolean isBST = isBST(root);

        // Print the result
        System.out.println("Is the Binary Tree a BST? " + isBST);
    }
    
    public Node LCA(Node root, Node p, Node q) {
        // Base case: if the root is null or equal to one of the nodes, it is the LCA
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recursively search for the LCA in the left and right subtrees
        Node leftLCA = LCA(root.left, p, q);
        Node rightLCA = LCA(root.right, p, q);

        // If both nodes are found in different subtrees, the current root is the LCA
        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        // If one of the nodes is found, return it (the other node is in a different subtree)
        return (leftLCA != null) ? leftLCA : rightLCA;
    }
     
    public void LCAfinder(){
     Node lca = LCA(root, root.left, root.right);

        // Print the result
        System.out.println("Lowest Common Ancestor: " + lca.data);
    }
}

