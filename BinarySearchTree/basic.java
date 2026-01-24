public class basic {
    public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val = val;
        }
    }
    public static Node searchBST(Node root,int val){
        if(root == null) return null;
        if(root.val == val) return root;
        if(root.val > val) return searchBST(root.left, val);
        if(root.val < val) return searchBST(root.right, val);
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
        System.out.println(searchBST(root, 34));
    }
    
}
