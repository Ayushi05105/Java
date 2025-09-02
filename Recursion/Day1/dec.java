package Recursion.Day1;

import java.util.Scanner;

public class dec {

    static void printDecresing(int n){
        if(n== 1){
            System.out.println(n);
            return;
        }

        System.out.println(n);

        printDecresing(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecresing(n);
        sc.close();
    }
    
}
