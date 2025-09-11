package Revision.Array;

public class sortNegative {

    static void printArray(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] SortNegative(int[] arr){
        int j = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] < 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
    }
    return arr ;
    }

    public static void main(String[] args) {
        int[] arr = {20 , -10, 2,-5,8,9,-7};
        SortNegative(arr);
        printArray(arr);

    }
    
}
