package Recursion.Day2;

import java.util.ArrayList;

public class arrayList {

    static ArrayList<Integer> allIndices(int[] arr,int n,int x,int idx){
        if(idx >= n){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx] == x){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = allIndices(arr, n, x, idx+1);
        ans.addAll(smallAns);
        return ans ;
    }

    public static void main(String[] args) {
        int[] arr = {1 , 2, 4, 4, 5, 4};
        int target = 4;
        int n = arr.length;
        ArrayList<Integer> ans = allIndices(arr, n, target, 0);
        for(Integer i : ans){
            System.out.println(i);
        }

    }
    
}
