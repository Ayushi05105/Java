class InvalidAge extends Exception{
        public InvalidAge(String message){
            super(message);
        }
     }
public class userException {

      public static void main(String[] args) {
        try{
            int age = 19;
            if(age < 18){
                throw new InvalidAge("Age is less than 18, not allowed");
            }
            System.out.println("You are eligible");
        }
        catch(InvalidAge e){
            System.out.println("exception caught" +e.getMessage());
        }
     }
    
}
