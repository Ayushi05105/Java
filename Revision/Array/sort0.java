public class sort0 {
    static void sortlast0(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
            if(arr[j]==0 && arr[j+1]!=0){
                int temp = arr[j];
                arr[j] =arr[j+1];
                arr[j+1] = temp;
                j++;
            }
        }
    }
}
    public static void main(String[] args) {
        int[] arr={1,0,6,7,0,4,0};
        sortlast0(arr);
        for(int i :arr){
            System.out.print(i+" ");
        }
    }
    
}
