import java.util.Scanner;
public class arearCircle {
    public static void main(String[] args) {
       
        double pi = 3.1415;
       
        System.out.println("Enter radius: ");
       
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double area = pi * r * r ;
        System.out.println("The area of circle:" +area);
        
        double circumference = 2 * pi * r;
        System.out.println(circumference);

    }
    
}
