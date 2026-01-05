package Trees;


public class sizeMaxSumHeight {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    //max
    public static int max(Node root){
        if(root ==null) return Integer.MIN_VALUE;
        // int a=root.val;
        // int b=max(root.left);
        // int c = max(root.right);
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }

    //min
    public static int min(Node root){
        if(root ==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }

    //height
    public static int height(Node root){
        if(root ==null) return 0;
        if(root.left==null && root.right==null) return 0;
        // int a=root.val;
        // int b=max(root.left);
        // int c = max(root.right);
        return 1+ Math.max(height(root.left),height(root.right));
    }

    //size
    public static int size(Node root){
        if(root==null) return 0;
        return 1 +size(root.left)+size(root.right);
    }

    //sum
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val +sum(root.left)+sum(root.right);
    }
    
    //product
    public static int product(Node root){
        if(root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }

    //preorder
    public static void preorder(Node root){
        if(root ==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
        public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(1);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(24);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;
        preorder(root);
        System.out.println();
        System.out.println("Size:" + size(root));//size
        System.out.println("Sum:" + sum(root));
        System.out.println("Max:" + max(root));
        System.out.println("Height:"+height(root));
        System.out.println("MIN: "+ min(root));
        System.out.println("Product: "+product(root));
    }
    
}
