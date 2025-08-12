class Array{
    void searching(){
        int arr[]= {3, 6, 7, 8,9 ,4};
        int ans = -1;
        int x = 2;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == x){
                ans = i;
            }
        }
        System.out.println("Found " + x + " at index " +ans);
    }
}

public class searching {
    public static void main(String[] args) {
        Array obj = new Array();
        obj.searching();
    }
    
}
