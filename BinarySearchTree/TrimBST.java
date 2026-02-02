public class TrimBST {

    public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val = val;
        }
    }
    
     public static void helper(Node root, int low,int high){
        if(root == null) return;
        while(root.left != null){
            if(root.left.val< low)  root.left = root.left.right;
            else if( root.left.val > high)  root.left = root.left.left;
            else break;
        }
        while(root.right != null){
            if(root.right.val > high) root.right = root.right.left;
            else if(root.right.val < low)  root.right = root.right.right;
            else break;
        }
        helper(root.left,low,high);
        helper(root.right,low,high);
    }

    public static Node trimBST(Node root, int low, int high) {
        Node parent = new Node(Integer.MAX_VALUE);
        parent.left = root;
        helper(parent,low,high);
        return parent.left;
    }
    
}
