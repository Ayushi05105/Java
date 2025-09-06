package Recursion.Day2;

public class LinearSearch {


    static boolean search(int[] arr,int n , int target,int idx){
            
        if(idx >= n) return false;
        if(arr[idx] == target) return true;
        return search(arr, n, target, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1 , 2, 5, 7,};
        int target = 5;
        if(search(arr,  arr.length, target, 0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
