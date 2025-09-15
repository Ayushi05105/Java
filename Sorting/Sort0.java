package Sorting;

public class Sort0 {
    public static void main(String[] args) {
        int[] arr = {1,0,9,0,3,0};
        int n = arr.length;
        for(int i = 0 ; i<n-1;i++){
            for(int j = 0; j<n-i-1;j++){
                if(arr[j] == 0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int val: arr){
            System.out.print(val + " ");
        }
    }
    
}
