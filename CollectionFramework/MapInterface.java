package CollectionFramework;

import java.util.HashMap;

public class MapInterface {

    public static void main(String[] args) {
        HashMap<Integer , String> mp = new HashMap<>();
        mp.put(3, "Aj");
        mp.put(5,"Rj");
        mp.put(7, "Sj");
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.containsKey(4));
        System.out.println(mp.keySet());
        System.out.println(mp.values());

    }
    
}
