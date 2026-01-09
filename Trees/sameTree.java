package Trees;

public class sameTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static boolean SameTree(Node p ,Node q){
     if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        return SameTree(p.left,q.left) && SameTree(p.right,q.right);
}
}
