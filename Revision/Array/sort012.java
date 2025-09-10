package Revision.Array;

public class sort012 {

    static void printArray(int[] arr){
        for(int i = 0; i <arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void Swap012(int[] arr){
        int low = 0, mid = 0 , high = arr.length -1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
                swap(arr,mid,high);
                high--;
            }        
            
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,1,0,2,0};
        Swap012(arr);
        printArray(arr);
    }
    
}
