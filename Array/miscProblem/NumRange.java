package miscProblem;

import java.util.Scanner;

public class NumRange {

    static void Range(int[] arr){
        
        int low = 0,mid = 0, high = arr.length -1 ;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,mid,low);
                low ++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] ==2){
                swap(arr,mid,high);
                high--;
            }
        }

    }

    static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{0,1,2,0,2,1,0};

        Range(arr);

        for(int num : arr) {
            System.out.print(num +" ");
        }

          sc.close();
    }
    
}
