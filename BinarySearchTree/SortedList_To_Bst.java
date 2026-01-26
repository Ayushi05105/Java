public class SortedList_To_Bst {
     public static class Node{
        int val;
        Node left;
        Node right;
        Node next;
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
    public static Node sortedListToBST(Node head) {
        Node temp = head;
        int n =0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        int[] nums = new int[n];
        int i =0;
        temp = head;
        while(temp!=null)
        {
            nums[i++] = temp.val;
            temp = temp.next;
        }
        return helper(nums,0,n-1);
    }
}
