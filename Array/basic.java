class Array{

    void multiArrays(){
        int[][] arr_1 = new int[5][3];
        int[][] arr ={{45,34,6} , {34,87,78} , {12,56,78}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        
    }

    void demoArray(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = new String[3];

        ages[0] = 15;
        ages[1] = 18;
        ages[2] = 20;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        
        System.out.println(ages.length);  // for length of array
    }
}

public class basic {
    public static void main(String[] args) {
        Array obj = new Array();
        obj.demoArray();
        obj.multiArrays();
    }
    
}
