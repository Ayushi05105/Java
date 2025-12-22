package CollectionFramework;

import java.util.HashSet;

public class SetInterface {

    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);  
        st.add(3);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st);
        st.remove(2);
        System.out.println(st.contains(2));
        System.out.println(st.size());                 
    }
    
}
