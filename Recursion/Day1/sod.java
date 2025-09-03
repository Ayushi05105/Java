package Recursion.Day1;

public class sod {

    static int SOD(int n){
        if(n >= 0 && n <= 9) return n;
        return SOD(n/10) + n%10 ;
    }


    public static void main(String[] args) {
        System.out.println(SOD(1234));
    }
    
}
