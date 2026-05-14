
public class methofOfReference {
    
    public interface sayable {
        void say();
    }
    class  Message{
        static void display(){
            System.out.println("Hellofrom static method");
        }
    }
    public class StaticMethodReference{
        public static void main(String[] args) {
            sayable s = Message::display;
            s.say();
        }
    }
}
