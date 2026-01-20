package Trees;

import java.util.ArrayList;
import java.util.List;


public class pathsumII {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
        public void helper(List<List<Integer>> ans,List<Integer> arr,Node root,int sum){
        if(root == null) return;
        if(root.left == null && root.right == null){
            arr.add(root.val);
            if(root.val == sum){
                List<Integer> a = new ArrayList<>();
                for(int i =0;i<arr.size();i++){
                    a.add(arr.get(i));
                }
                ans.add(a);
            }
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.val);
        helper(ans,arr,root.left,sum-root.val);
        helper(ans,arr,root.right,sum-root.val);
        arr.remove(arr.size()-1);

    }
    public List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr =new ArrayList<>();
        helper(ans,arr,root,targetSum); 
        return ans;
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
        Node f= new Node(7);
        b.left =e;
        b.right = f;
    }
    
}
