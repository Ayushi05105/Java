public class BstFromPreorder {

       public static class Node{
        int val;
        Node left;
        Node right;
       
        public  Node(int val){
            this.val = val;
        }
    }
       public static Node insertIntoBST(Node root,int val){
        if(root == null) return new Node(val);
        if(root.val>val){
            if(root.left == null) root.left = new Node(val);
            else insertIntoBST(root.left,val);
        }
        else{
            if(root.right == null) root.right =new Node(val);
            else insertIntoBST(root.right,val);
        }
        return root;
    }
    public static Node bstFromPreorder(int[] preorder) {
        Node root = new Node(preorder[0]);
        for(int i =1;i<preorder.length;i++){
            root =insertIntoBST(root,preorder[i]); 
        }
        return root;
    }
    
}
