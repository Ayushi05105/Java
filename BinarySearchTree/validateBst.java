import java.util.List;

import javax.swing.tree.TreeNode;

public class validateBst {

    public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val = val;
        }
    }

    static boolean flag = true;
    static Node prev = null;
    public void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        if(prev == null) prev = root;
        else if(root.val <= prev.val){
            flag = false;
        }
        else prev = root;
        inorder(root.right);
    }
    public boolean isValidBST(Node root) {
        flag = true;
        prev = null;
        inorder(root);
        return flag;
    }
    
}
