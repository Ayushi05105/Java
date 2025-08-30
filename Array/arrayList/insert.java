package arrayList;

import java.util.ArrayList;

public class insert {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //printing the array list directly
        System.out.println(l1);

        //modifying element at index i
        l1.set(1,10);
        System.out.println(l1);

        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);


    }
    
}
