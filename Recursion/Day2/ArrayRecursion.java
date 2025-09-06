package Recursion.Day2;

public class ArrayRecursion {

    static void printArray(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);

        printArray(arr, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,9,8};
        printArray(arr,1);
    }
    
}
