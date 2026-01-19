package Trees;

public class InvertTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static Node invertTree(Node root) {
        if(root == null) return root;
        Node l = root.left;
        Node r = root.right;
        root.left = invertTree(r);
        root.right =invertTree(l);
        return root;
        
    }
}
