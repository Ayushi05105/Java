package Hashmap;

import java.util.HashMap;

public class Subset {
    public static boolean isSubset(int[] a,int[] b){
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int ele:a){
            if(map1.containsKey(ele)){
                int freq = map1.get(ele);
                map1.put(ele, freq+1);
            }
            else map1.put(ele, 1);
        }

        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int ele:b){
            if(!map1.containsKey(ele)) return false;
            if(map2.containsKey(ele)){
                int freq = map2.get(ele);
                map2.put(ele, freq+1);
            }
            else map2.put(ele, 1);
        }
        for(int ele:map2.keySet()){
            int freq = map2.get(ele);
            int aFreq= map2.get(ele);
            if(aFreq<freq) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {11,7,1,13,21,3,7,3};
        int[] b = {11,3,7,1,7};
        System.out.println(isSubset(a, b));
    }
    
}
