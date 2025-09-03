package Recursion.Day1;

public class fibonacciNo {

    static int fibonacci(int n){

        //base case
        if(n==0 || n ==1) return n;

        //recursive case
        int prev = fibonacci(n-1);
        int prevPrev = fibonacci(n-2);

        //self work
        int ans = prev + prevPrev;
        return ans;
    }

    public static void main(String[] args) {
        for(int i = 0 ; i<=10;i++){
        System.out.println(fibonacci(i));
        }
    }
    
}
