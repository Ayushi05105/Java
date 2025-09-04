package Recursion.Day1;

public class numberDigit {

    static int NumberOfDigit(int n){
        if(n / 10 == 0) return 1;

        return 1 + NumberOfDigit(n/10);

    }

    public static void main(String[] args) {
        System.out.println(NumberOfDigit( 1234));
    }
    
}
