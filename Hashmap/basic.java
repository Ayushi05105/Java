package Hashmap;

import java.util.Map;
import java.util.*;

public class basic {

    static void HashMapMethod(){
        Map<String, Integer> mp = new HashMap<>();
        //Adding element
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);
        //Getting value of a key from the HashMap
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul"));
        //changing value of a key in hashmap

        //Traversing all enteries of HashMap - multiple method
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        System.out.println();

        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();

        for(var e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }

    }

    public static void main(String[] args) {
        HashMapMethod();
    }
    
}
