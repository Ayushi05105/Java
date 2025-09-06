package Recursion.Day2;

public class SumArray {

    static int sumOfArray(int[] arr , int idx){
        if(idx == arr.length){
            return 0;
        }

        int smallAns = sumOfArray(arr, idx + 1);
        return smallAns + arr[idx];
    }

    public static void main(String[] args) {
        int[] arr = {5,7,8,9,2};
        System.out.println(sumOfArray(arr, 0));
    }
    
}
