public class sealedclass {
    public static void main(String[] args) {
        Vehicle car = new car("Defender");
        Vehicle bike = new Bike("Royal Enfield");

        System.out.println(car);
        System.out.println(bike);
    }
}
sealed interface Vehicle permits car,Bike{

}
final class car implements Vehicle{
    private final String name;

    public car(String name){
        this.name = name;
    }
    public String toString(){
        return "Car Name: "+name;
    }
}

final class Bike implements Vehicle{
    private final String name;

    public Bike(String name){
        this.name = name;
    }
    public String toString(){
        return "Bike Name: "+name;
    }
}

