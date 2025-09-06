package Recursion.Day2;

public class maxArray {

    static int maxInArray(int[] arr , int idx){
        if(idx == arr.length -1){
            return arr[idx];
        }

        int smallAns = maxInArray(arr, idx+1);

        return Math.max(arr[idx] , smallAns);
    }

    public static void main(String[] args) {
        int[] arr={15,4,7,8,9};
        System.out.println(maxInArray(arr, 0));
    }
    
}
