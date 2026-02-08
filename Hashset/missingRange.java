package Hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class missingRange {
    public static ArrayList<Integer> missingrange(int[] arr,int low,int high){
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) set.add(ele);
        for(int i =low;i<=high;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}
