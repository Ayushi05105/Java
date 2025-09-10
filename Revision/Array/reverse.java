package Revision.Array;


public class reverse {

    static void printArray(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void Reverse(int[] arr){
        int i = 0, j= arr.length - 1;
        while(i<j){
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr ={1 , 2 , 3 , 4, 5};
        Reverse(arr);
        printArray(arr);
    }
    
}
