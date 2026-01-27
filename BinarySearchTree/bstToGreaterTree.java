public class bstToGreaterTree {

    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    static int sum = 0;
    public static void helper(Node root){
        if(root == null) return;
        helper(root.right);
        root.val = root.val+sum;
        sum = root.val;
        System.out.print(sum+" ");
        helper(root.left);
    }


    public static Node convertBST(Node root){
        sum = 0;
        helper(root);
        return root;

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
        convertBST(root);
        }
    
}
