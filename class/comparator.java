import java.util.ArrayList;
import java.util.*;

public class comparator {
     class student{
        int age;
        String name;
        void Student(int age,String name){
            this.age = age;
            this.name = name;
        }
        public String toString(){
            return age +" "+name;
        }
    }

    static class NameComparator implements Comparator<Student>{
        public int compare(Student s1,Student s2){
            return s1.name.compareTo(s2.name);
        }
    }
    public class ComparatorExample{
        public static void main(String[] args) {
            ArrayList<Student> list = new ArrayList<>();
            list.add(new Student(20,"aj"));
            list.add(new Student(16,"rj"));
            list.add(new Student(26,"jj"));
            Collections.sort(list,new NameComparator());
            System.out.println(list);
        }
    }
    
}
