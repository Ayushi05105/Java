package Hashset;
import java.util.HashSet;

public class distinctElement {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);set.add(1);set.add(1);set.add(2);
        System.out.println("Distinct Element: "+ set.size());

    }
    
}
