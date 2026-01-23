package Trees;
public class postInOrderTree {

    public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val = val;
        }
    }
public static Node helper(int[] postorder,int postlo,int posthi,int[] inorder,int inlo,int inhi){
        if(postlo > posthi) return null;
        Node root = new Node(postorder[posthi]);
        int i = inhi;
        while(inorder[i] != postorder[posthi]) i--;
        int leftsize = i-inlo;
        root.left = helper(postorder,postlo,postlo+leftsize-1,inorder,inlo,i-1);
        root.right = helper(postorder,postlo+leftsize,posthi -1,inorder,i+1,inhi);
        return root;
    }
    public static Node buildTree(int[] postorder,int[] inorder) {
        int n = postorder.length;
        return helper(postorder,0,n-1,inorder,0,n-1);
}

public static void preorderPrint(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorderPrint(root.left);
        preorderPrint(root.right);
    }
public static void main(String[] args) {
    int[] postorder = {9,15,7,20,3};
    int[] inorder = {9,3,15,20,7};
     Node root = buildTree(postorder,inorder);
     preorderPrint(root);

}
}
