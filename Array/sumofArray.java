

class Array {
    void sumofArray(){
        int []arr = {1,5,4,6,7,9};
        int sum = 0;

        for(int i= 0; i<arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }

    
}

public class sumofArray {
    public static void main(String[] args) {
        Array obj = new Array();
        obj.sumofArray();
    }
    
}
