package Sorting;

public class CountSort1 {

    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void display(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
    }

    static void countSort(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // make prefix sum of count arr
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        // find index of each elemnt in original and put
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        // copy output to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 8, 9, 7 };
        countSort(arr);
        display(arr);
    }

}
