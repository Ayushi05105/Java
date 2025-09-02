import java.util.Scanner;

public class sq {
    public static void main(String[] args) {

        System.out.println("Enter the number: ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sq = number * number;
        System.out.println("Square of number is: " +sq);
        sc.close();

    }

}
