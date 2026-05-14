public class lambda {

    //without paramenter

    // public interface Message {
    //         void show();
        
    // } 
    // public static class lambdaNo{
    //     public static void main(String[] args) {
    //         Message m=()->{
    //             System.out.println("hello java");
    //         };
    //         m.show();
    //     }
    // }

    //with parameter

    interface Square{
        int cal(int x);
    }
    public static class LambdaParameter{
        public static void main(String[] args) {
            Square s = (x)->x*x;
            System.out.println(s.cal(5));
        }
    }
    
}
