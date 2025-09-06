package Recursion.Day2;

public class LinearSearch {


    static void findAllIndices(int[] arr,int n,int target,int idx){

        //base case
        if(idx >= n) return;

        //self work
        if(arr[idx] == target){
            System.out.println(idx);
        }

        //recursive work
        findAllIndices(arr, n, target, idx + 1);
    }


    static boolean search(int[] arr,int n , int target,int idx){
            
        if(idx >= n) return false;
        if(arr[idx] == target) return true;
        return search(arr, n, target, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1 , 2, 5, 7,5,7,5,8};
        int target = 5;
        int n = arr.length;

        findAllIndices(arr, n, target, 0);


        //searching
        if(search(arr,  arr.length, target, 0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
