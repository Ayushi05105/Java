import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter divident: ");
        int a = sc.nextInt();

        System.out.println("Enter divisor: ");
        int b = sc.nextInt();

        int q = a/b;
        int r = a - (b*q);
        System.out.println("The remainder when "+a+" is divided by "+b+" is :"+r);

        sc.close();
        
    }
}
