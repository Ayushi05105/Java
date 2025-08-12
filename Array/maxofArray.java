class Array{
    void maxofArray(){
        int arr[] = {5,8,90,0,34,87,90};
        int ans = 0;
        for(int i =0;i< arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        

        System.out.println(ans);

    }
}

public class maxofArray {
    public static void main(String[] args) {
        Array obj = new Array();
        obj.maxofArray();
    }
    
}
