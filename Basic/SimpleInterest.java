import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principle p:");
        float p = sc.nextFloat();

        System.out.println("Enter the Rate R:");
        float r = sc.nextFloat();

        System.out.println("Enter the Time t:");
        float t = sc.nextFloat();

        float SI = (p*r*t)/100;

        System.out.println("Simple interest SI:" +SI);
        sc.close();
    }
    
}
