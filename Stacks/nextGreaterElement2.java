package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement2 {
    private static int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        res[n-1]=-1;
        for(int i =n-2;i>=0;i--){
            while(st.peek()<arr[i] && !st.isEmpty()){
                st.pop();
            }
            if(st.isEmpty()){ res[i] = -1;}
            else {res[i] = st.peek();}
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,2,1,6,3,4};
        int[] res = nextGreater(arr);
        System.out.println(Arrays.toString(res));
       
        
    }
    
}
