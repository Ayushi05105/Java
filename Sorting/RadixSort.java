package Sorting;

public class RadixSort {

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

    static void countSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) { // make freq arr, arr[i] =105 freq[5]++,place =10
            count[(arr[i] / place) % 10]++;
        }
        // make prefix sum of count arr
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        // find index of each elemnt in original and put
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }
        // copy output to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int[] arr) {
        int max = findMax(arr); // get maximum element
        // apply count sort to sort element based on place value
        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, place);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 8, 9, 7 };
        radixSort(arr);
        display(arr);
    }
}
