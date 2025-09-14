package Sorting;

public class Insertion {
    static void InsertionSort(int[] a){
        for(int i = 1 ; i < a.length ; i++){
           int j = i;
           while(j>0 && a[j] < a[j-1]){
            int temp = a[j];
            a[j] = a[j-1];
            a[j-1] = temp;
            j--;
           }

        }
    }

    public static void main(String[] args) {
        int[] a = {2,6,3,9,0,5};
        InsertionSort(a);
        for(int val : a){
            System.out.print(val + " ");
        }
        
    }
    
}
