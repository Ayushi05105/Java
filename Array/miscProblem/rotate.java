package miscProblem;

import java.util.Scanner;

public class rotate {

    static void printArray(int arr[]){
        for(int i =0 ; i<arr.length; i++){
            System.out.println(arr[i]+" ");

        }
        System.out.println();

    }


    static int[] Rotate(int arr[],int k){
        int n = arr.length;
        k = k%n;
        int ans[]= new int[n];
        int j= 0;

        for(int i = n-k ; i<n ; i++){
            ans[j++] = arr[i];

        }

        for(int i = 0; i<n-k;i++){
            ans[j++] = arr[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter " + n + " element");
        for(int i = 0;i< n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k(no.of rotation): ");
        int k = sc.nextInt();

        System.out.println("Enter Original array: ");
        printArray(arr);
        
        int[] ans=Rotate(arr, k);
        System.out.println("Array after rotation: ");
        printArray(ans);

    }
    
}
