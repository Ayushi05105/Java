package Recursion.Day1;

import java.util.Scanner;

public class sum {

    static void printInteger(int n ){
        if(n == 1){
            System.out.println(n);
            return;
        }

        printInteger(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInteger(n);
        sc.close();

    }
    
}
