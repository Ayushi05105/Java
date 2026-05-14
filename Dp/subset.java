package Dp;

import java.util.Arrays;

public class subset {
    public static int coinChange(int[] coins,int target){
        int[] arr = new int[target + 1];
        Arrays.fill(arr, -1);
        int ans = helper(coins,target,arr);
        return ans ==Integer.MAX_VALUE ?-1:ans;
    }
    public static int helper(int[] coins,int target,int[] arr){
        if(target ==0) return 0;
        if(target <0) return Integer.MAX_VALUE;
        if(arr[target] != -1) return arr[target];
        int min = Integer.MAX_VALUE;
        for(int coin : coins){
            int res = helper(coins,target-coin,arr);
            if(res !=Integer.MAX_VALUE){
                min = Math.min(min,res+1);
            }
        }
        arr[target] = min;
        return min;

    }
    public static void main(String[] args) {
        int[] coins ={1,2,5,10,20,50};
        int target = 65;
        System.out.println(coinChange(coins, target));
    }
    
}
