package Hashmap;

import java.util.*;

public class MaxFreq {
    public static char getMaxOccuringChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch,freq+1);    //overwrite
            }
            else map.put(ch,1);
        }
        int maxFreq = 1;
        for(char ch:map.keySet()){
            int freq = map.get(ch);
            if(freq >maxFreq) maxFreq = freq;
        }
        char ans = s.charAt(0);
         for(char ch:map.keySet()){
            int freq = map.get(ch);
            if(freq ==maxFreq && ch<ans){
                ans = ch;
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        int[] arr={2,5,1,4,4,6,5,7,1,4,3,1,4,9,1,1};
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
