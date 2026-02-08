package Hashset;

import java.util.HashSet;

public class twoSum {
    public static boolean Two_Sum(int[] arr,int target){
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            int rem = target - ele;
            if(set.contains(rem)) return true;
            set.add(ele);
        }
        return false;
    }

    public static void main(String[] args) {
       int[] arr = {1,-1,6,5,2,3,4};
       int target = 5;
       System.out.println(Two_Sum(arr, target));
    }
    
}
