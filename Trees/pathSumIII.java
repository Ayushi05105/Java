package Trees;

public class pathSumIII {

    public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val = val;
        }
    }    
    public int noOfPath(Node root, int targetSum){
        if(root == null) return 0;
        int count = 0;
        if(root.val == targetSum) count++;
        return count + noOfPath(root.left,targetSum-root.val) + noOfPath(root.right,targetSum-root.val);
    }
    public int pathSum(Node root, int targetSum) {
        if(root == null) return 0;
        int count = noOfPath(root,targetSum);
        count += (pathSum(root.left,targetSum) + pathSum(root.right,targetSum));
        return count; 
    }
    
}
