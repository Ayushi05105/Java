import java.util.Scanner;

public class min {
    static int FindMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;

    }
    static int findSecondMin(int arr[]){
        int min = FindMin(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondMin = FindMin(arr);
            return secondMin;


    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " + n +" elements");

        for(int i = 0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Second min element: "+findSecondMin(arr));

        sc.close();
    }
    
    
}
