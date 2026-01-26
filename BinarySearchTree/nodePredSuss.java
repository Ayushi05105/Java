
import java.util.*;

public class nodePredSuss {
    public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val = val;
        }
    }
    public static Node constructBfs(String[] Arr){
        int x = Integer.parseInt(Arr[0]);
        int n = Arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(i <n-1){
            Node temp = q.remove();
            Node left = new Node(10);
            Node right = new Node(100);
            if(Arr[i].equals("")) left = null;
            else{
                int l = Integer.parseInt(Arr[i]);
                left.val = l;
                q.add(left);
            }
            if(Arr[i+1].equals("")) right = null;
            else{
                int r = Integer.parseInt(Arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
    }
    public static void inorder(Node root,List<Integer> arr ){
        if(root == null) return ;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }

     public static void main(String[] args) {
        String[] Arr = {"50","20","60","17","34","55","89","10","","28","","","","70","","","14"};
        Node root = constructBfs(Arr);
        List<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        int val = 28;
        int idx = -1;
        for(int i =0;i<arr.size();i++){
            if(arr.get(i)== val){
                idx = i;
                break;
            }
        }
        int pred = arr.get(idx-1);
        int succ = arr.get(idx+1);
        System.out.println("Pred is: "+pred);
        System.out.println("Succ is: "+succ);
        
    }
    
}
