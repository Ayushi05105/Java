public class student2 {

    class Student2 {
        private String name, city;
        private int age;

        public void getData(String x, String y, int t) {
            name = x;
            city = y;
            age = t;
        }

        public void printData() {
            System.out.println("Student name =" + name);
            System.out.println("Student city =" + city);
            System.out.println("Student age =" + age);
        }
    }

    public static void main(String args[]) {

        student2 outer = new student2();

        student2.Student2 s1 = outer.new Student2();
        student2.Student2 s2 = outer.new Student2();

        s2.getData("Kapil", "Delhi", 23);
        s2.printData();

        s1.getData("Amit", "Dehradun", 22);
        s1.printData();
    }
}