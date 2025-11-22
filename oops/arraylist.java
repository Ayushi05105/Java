package oops;

import java.util.*;
import java.util.Arrays;

public class arraylist {
    int[] arr= new int[2];
    int idx =0;
    int size=0;
    public void add(int ele){
        if(size==arr.length){
            int[] brr=Arrays.copyOf(arr,arr.length*2);
            arr=brr;
        }
        arr[idx] = ele;
        idx++;
        size++;
    }
    public static void main(String[] args) {
        arraylist arr = new arraylist();
        arr.add(2);
        arr.add(5);
        System.out.println(arr.size);
    }
    
}
