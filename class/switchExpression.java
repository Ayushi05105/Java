public class switchExpression {

   public static void main(String[] args) {
    int day = 2;
    String res = switch(day){

        case 1->"Monday";
        case 2->{
            System.out.println("processing Tuesday");
            yield "Tuesday";
        }
        case 3->"wednessday";
        default->"Invalid day";
    };
    System.out.println(res);

    
   }

   //text block
//    public static void main(String[] args) {
//     String text ="""
//             Hello
//             Welcome
//             java
//             """;
//             System.out.println(text);
//    }
}
