import java.util.LinkedList;
import java.util.Queue;

public class deleteNode {
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
    public static void delete(Node root,int target){
        if(root.val > target){
            if(root.left.val == target){
                if(root.left.left == null && root.left.right == null) root.left = null;
                else if(root.left.left== null || root.left.right==null){
                    if(root.left.left !=null) root.left = root.left.left;
                    else root.left = root.left.right;
                }
            } 
            else delete(root.left, target);
        }
      if(root.val < target){
            if(root.right.val == target) root.right = null;
            else delete(root.right, target);
        }    
    }
    public static void main(String[] args) {
        String[] arr = {"50","20","60","17","34","55","89","10","","28","","","","70","","","14"};
        Node root = constructBfs(arr);
        preorder(root);
        System.out.println();
        delete(root,28);
        preorder(root);
    }
    
}
