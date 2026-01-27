public class minDistanceBST {

    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    static int minDiff = Integer.MAX_VALUE;
    static Node prev = null;
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        if(prev != null){
        int diff = Math.abs(root.val - prev.val);
        minDiff = Math.min(minDiff,diff);
        System.out.print(minDiff+" ");
        }
        prev = root;
        inorder(root.right);
    }
    public static int minDiffInBST(Node root) {
        minDiff = Integer.MAX_VALUE;
        prev = null;
        inorder(root);
        return minDiff;
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        Node a = new Node(20);
        Node b = new Node(17);
        Node c = new Node(34);
        Node d = new Node(10);
        Node e = new Node(28);
        Node f = new Node(14);
        Node g = new Node(60);
        Node h = new Node(55);
        Node i = new Node(89);
        Node j = new Node(70);
        root.left = a;
        root.right = g;
        a.left = b;
        a.right = c;
        b.left = d;
        d.right = f;
        c.left = e;
        g.left = h;
        g.right = i;
        i.left = j;
        minDiffInBST(root);
    }
    
}
