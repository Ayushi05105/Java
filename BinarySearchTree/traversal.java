import java.util.LinkedList;
import java.util.Queue;

public class traversal {
    public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val = val;
        }
    }
    
    public static Node constructBfs(String[] arr){
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(i <n-1){
            Node temp = q.remove();
            Node left = new Node(10);
            Node right = new Node(100);
            if(arr[i].equals("")) left = null;
            else{
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if(arr[i+1].equals("")) right = null;
            else{
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
    }
    public static void preorder(Node root){
        if(root == null) return ;
        System.out.print(root.val +" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null) return ;
        inorder(root.left);
        System.out.print(root.val +" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null) return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val +" ");
    }
    public static void main(String[] args) {
        String[] arr = {"1","2","3","4","5","","6","7","","","8","","","9",""};
        Node root = constructBfs(arr);
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
    }
    
}
