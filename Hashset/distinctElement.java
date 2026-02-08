package Hashset;
import java.util.HashSet;

public class distinctElement {
    public static int distinct(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) set.add(ele);
        return set.size();
    }
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        // set.add(1);set.add(1);set.add(1);set.add(2);
        // System.out.println("Distinct Element: "+ set.size());
        int[] arr = {1,1,2,3};
        System.out.println(distinct(arr));

    }
    
}
