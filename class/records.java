public class records {
    record Student(int id,String name){

    }
    public static void main(String[] args) {
        Student s1 = new Student(101,"Ayushi");
        System.out.println(s1.id());
        System.out.println(s1.name());
        System.out.println(s1);
    }
}
