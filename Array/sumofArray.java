public class sumofArray {
    static void sumofarray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr={1,5,6,4,7,9};
        sumofarray(arr);
    }
}

  