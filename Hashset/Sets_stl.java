package Hashset;

import java.util.HashSet;

public class Sets_stl {
    public static void main(String[] args) {
     HashSet<Integer> set = new HashSet<>();
     set.add(7); set.add(89); set.add(76);
     set.add(80);set.add(24);
     for(int ele: set){
        System.out.print(ele+" ");
     }
     System.out.println(set.size());
     System.out.println(set.contains(89)+" "+ set.contains(21));
     set.remove(7);
     System.out.println(set.size());
    }
   

    
}
