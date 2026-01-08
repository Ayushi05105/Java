package Trees;


public class diameter {

     public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static int height(Node root){
        if(root ==null || root.left == null && root.right==null)
             return 0;
        return 1 + Math.max(height(root.left), height(root.right));    
    }
    public static int diameterofBT(Node root){
        if(root ==null || root.left == null && root.right==null)
            return 0;
        int leftAns = diameterofBT(root.left);
        int rightAns = diameterofBT(root.right);
        int mid = height(root.left) + height(root.right);
        if(root.right !=null) mid++;
        if(root.left != null) mid++;
        int max = Math.max(leftAns,Math.max(rightAns,mid));
        return max;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f= new Node(8);
        b.left =e;
        b.right = f;
        System.out.println(diameterofBT(root));
    }
    
}
