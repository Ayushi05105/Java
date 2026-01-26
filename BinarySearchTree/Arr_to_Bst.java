public class Arr_to_Bst {

    public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val = val;
        }
    }
     public static Node helper(int[] nums,int low,int hi){
      if(low > hi) return null;
      int mid = low +(hi-low)/2;
      Node root = new Node(nums[mid]);
      root.left = helper(nums,low,mid-1);
      root.right =  helper(nums,mid+1,hi);
      return root;
    }
    public static Node sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return helper(nums,0,n-1);
    }
}
