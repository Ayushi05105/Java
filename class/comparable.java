import java.util.*;
public class comparable {

    static class Student implements Comparable<Student>{
        int age;
        String name;
        Student(int age,String name){
            this.age = age;
            this.name = name;
        }
        public int compareTo(Student s){
            return this.age - s.age;
        }
        public String toString(){
            return age +" " +name;
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(22,"aj"));
        list.add(new Student(16,"rj"));
        list.add(new Student(26,"jj"));
        Collections.sort(list);
        System.out.println(list);
    }
    
}
