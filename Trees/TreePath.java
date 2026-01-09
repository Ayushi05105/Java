package Trees;

import java.util.ArrayList;
import java.util.List;


public class TreePath {

      public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public void helper(Node root,List<String> ans,String s){
        if(root==null) return;
        if(root.left == null && root.right == null){
            s += root.val;
            ans.add(s);
            return;
        }
        helper(root.left,ans,s+root.val+"->");
        helper(root.right,ans,s+root.val+"->");

    }
    public List<String> binaryTreePaths(Node root) {
        List<String> ans = new ArrayList<>();
        helper(root,ans,"");
        return ans;
    }
    
}
