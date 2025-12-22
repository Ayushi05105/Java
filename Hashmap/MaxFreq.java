package Hashmap;

import java.util.HashMap;
import java.util.*;

public class MaxFreq {


    public static void main(String[] args) {
        int[] arr={2,5,1,4,4,6,5,7,1,4,3,1,4};
        Map<Integer, Integer> freq = new HashMap<>();
        for(int el : arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            }
            else{
                freq.put(el, freq.get(el)+1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());
        int maxFreq =0,ansKey =-1;

        //1st method

        // for(var e: freq.entrySet()){
        //     if(e.getValue()>maxFreq){
        //         maxFreq = e.getValue();
        //         ansKey=e.getKey();
        //     }
        // }

        //2nd method

        for(var key: freq.keySet()){
            if(freq.get(key)>maxFreq){
                maxFreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.printf("%d has max frequency and it occur %d times",ansKey,maxFreq);
    }
    
}
