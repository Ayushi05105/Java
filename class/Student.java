public class Student {

    String name, city;
    int age;
    static int m;

    void printData() {
        System.out.println("Student name = " + name);
        System.out.println("Student city = " + city);
        System.out.println("Student age = " + age);
    }

    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Amit";
        s1.city = "Dehradun";
        s1.age = 22;

        s2.name = "Kapil";
        s2.city = "Delhi";
        s2.age = 23;

        s2.printData();
        s1.printData();

        Student.m = 27;

        System.out.println("s1.m = " + s1.m);
        System.out.println("s2.m = " + s2.m);
        System.out.println("Student.m = " + Student.m);
    }
}