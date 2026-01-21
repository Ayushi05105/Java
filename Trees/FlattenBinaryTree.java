package Trees;

import javax.swing.tree.TreeNode;

public class FlattenBinaryTree {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void flatten(Node root){
        if(root == null) return;
       // if(root.left == null && root.right == null) return;
        Node leftTree = root.left;
        Node rightTree = root.right;
        root.left = null;
        flatten(leftTree);
        flatten(rightTree);
        root.right = leftTree;
        Node temp = leftTree;
        while( temp != null && temp.right != null){
            temp = temp.right;
        }
        if(temp != null) temp.right = rightTree;
        else root.right = rightTree;
        return;
    }
    public static void flatten2(Node root){
        Node curr = root;
        while(curr != null){
            if(curr.left != null){
                Node pred = curr.left;
                while(pred.right != null){
                    pred = pred.right;
                }
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}
