import java.util.function.*;
public class functionalInterface {
    public static void main(String[] args) {
        Consumer<String> consumer = name->System.out.println("Hello" +name);
        consumer.accept("Ayushi");

        Supplier<String> supplier =()->"Welcome to java";
        System.out.println(supplier.get());

        Predicate<Integer>predicate = age-> age>=18;
        System.out.println("Eligible: "+predicate.test(20));

        Function<Integer,Integer> func = num-> num*num;
        System.out.println("Square: "+func.apply(5));
    }
}
