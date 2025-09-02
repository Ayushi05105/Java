package miscProblem;

public class swap {
    static void Swap(int a , int b){
        System.out.println("Original value:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        int temp = a ;
        a=b;
        b=temp;

        System.out.println("Values after swap: ");
        System.out.println("a: " +a);
        System.out.println("b: " +b);
    }



    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int arr[] = {1,2 ,3,4,5};
        Swap(a,b);

    }
    
}
