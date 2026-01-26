public class lowestCommonAncestor {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static Node LowestCommonAncestor(Node root, Node p, Node q) {
        if(p.val == root.val || q.val == root.val) return root;
        else if(p.val<root.val && q.val>root.val) return root;
        else if(q.val<root.val && p.val>root.val) return root;
        else if(p.val<root.val && q.val<root.val) return LowestCommonAncestor(root.left,p,q);
        else return LowestCommonAncestor(root.right,p,q);
    }
    public static void main(String[] args) {
        no
    }
   
    
}
