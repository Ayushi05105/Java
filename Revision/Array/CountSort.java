public class CountSort {

    static void displayArray(int[] a){
        for(int val:a){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    static int max(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static void countSort(int[] arr){
        int maxi=max(arr);
        int[] count=new int[maxi+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr={0,1,5,3,7,2,9};
        countSort(arr);
        displayArray(arr);
    }
    
}
