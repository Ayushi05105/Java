package miscProblem;

import java.util.Scanner;

public class rotate2 {

    static void printArray(int arr[]){
        for(int i =0 ; i<arr.length; i++){
            System.out.println(arr[i]+" ");

        }
        System.out.println();

    }

    static void swap(int arr[] ,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    static void reverse(int arr[] , int i , int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int arr[],int k){

        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr , n-k, n-1);
        reverse(arr, 0, n-1);

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
        rotateInPlace(arr,k);
        System.out.println("Array after rotation: ");
        printArray(arr);

        sc.close();

    }
    
}
