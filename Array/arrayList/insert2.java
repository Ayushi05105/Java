package ArrayList;

import java.util.ArrayList;

public class insert2 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
        System.out.println(l.clone());  // shallow copy
        boolean m=l.isEmpty();
        System.out.println(m);
              
    }
    
}
