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
public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        
        b.right = e;
    }
}
