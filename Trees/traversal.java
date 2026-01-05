package Trees;

import Recursion.Day1.sod;

public class traversal {
    public static class Node{
        int val ;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    //preorder    Root Left Right
    public static void Preorder(Node root){
        if(root ==null) return;
        System.out.print(root.val+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    //Inorder   Left  Root  Right
     public static void Inorder(Node root){
        if(root ==null) return;
        Inorder(root.left);
        System.out.print(root.val+" ");
        Inorder(root.right);
    }
    //postorder    Root  Left Right
     public static void Postorder(Node root){
        if(root ==null) return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.val+" ");
    }

    //Level order traversal
    public static int Levelorder(Node root){
        if(root == null) return 0;
        return Levelorder(root.left) + Levelorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f= new Node(7);
        b.left =e;
        b.right = f;
        System.out.print("Preorder:");
        Preorder(root);
        
        System.out.print("\nInorder:");
        Inorder(root);
        System.out.print("\nPostorder:");
        Postorder(root);
        System.out.println(Levelorder(root));
    }
    
}
