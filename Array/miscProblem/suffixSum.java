package miscProblem;

import java.util.Scanner;

public class suffixSum {

    static void printArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
    static int[] SuffixSum(int[] arr){
        int n = arr.length;
        int[] suff = new int[n];
        suff[n-1] = arr[n-1];
        for(int i = n-2; i>=0;i--){
            suff[i] = arr[i] + suff[i+1];
        }
        return suff;


    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input array");
        printArray(arr);
        int[] suff = SuffixSum(arr);
        printArray(suff);

        sc.close();
    }
    
}
