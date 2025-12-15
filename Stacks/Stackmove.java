package Stacks;
import java.util.Stack;
import java.util.Scanner;

public class Stackmove {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of element:");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        sc.close();
    }
    
}
