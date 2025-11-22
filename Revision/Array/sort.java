public class sort {
    static void display(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }

    static void sortnegative(int[] num){
        int l=0,r=num.length-1;
        while(l<r){
        while(num[l]<0) l++;
        while(num[r]>=0) r--;

        if(l<r){
            int temp=num[l];
            num[l]=num[r];
            num[r]=temp;
            l++;
            r--;
        }
    }
}


    public static void main(String[] args) {
        int[] num={1,-11,0,12,-23,21,56,-45,98,-2};
        sortnegative(num);
        display(num);
    }
    
}
