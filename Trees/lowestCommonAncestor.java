package Trees;
public class lowestCommonAncestor {

    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

     public boolean contains(Node root,Node node){
        if(root==null) return false;
        if(root==node) return true;
        return contains(root.left,node) || contains(root.right,node);
    }
    public Node LowestCommonAncestor(Node root, Node p,Node q) {
        if(p==root || q==root) return root;
        if(p==q) return p;
        boolean leftp=contains(root.left,p);
        boolean rightq=contains(root.right,q);
        if((leftp && rightq) ||(!leftp && !rightq)) return root;
        if(leftp && !rightq) return LowestCommonAncestor(root.left,p,q);
        if(!leftp && rightq) return LowestCommonAncestor(root.right,p,q);
        return null;
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
