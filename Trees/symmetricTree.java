package Trees;


public class symmetricTree {

    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public boolean SameTree(Node p ,Node q){
     if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        return SameTree(p.left,q.left) && SameTree(p.right,q.right);
}

 public Node invertTree(Node root) {
        if(root == null) return root;
        Node l = root.left;
        Node r = root.right;
        root.left = invertTree(r);
        root.right =invertTree(l);
        return root; 
    }
    

    public boolean isSymmetric(Node root) {
        if(root == null) return true;
        root.left =invertTree(root.left);
        return SameTree(root.left,root.right);
    }
    public static void main(String[] args) {
        
    }
}
