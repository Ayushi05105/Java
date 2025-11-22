package Searching;

public class mountain {

    static void display(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }

    static int Mountain(int[] arr){
        int st =0,end=arr.length-1;
        int ans=-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]<arr[mid+1]){
                ans=mid+1;
                st=mid+1;
            }
            else{
                end=st-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,6,2,1};
        System.out.println(Mountain(arr));
        display(arr);
    }
    
}
