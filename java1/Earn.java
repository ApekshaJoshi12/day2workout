class Vehicle{
    Vehicle(){
        System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle{
    FourWheeler(){
        System.out.println("4 wheeler Vehicles");
    }
}
class Car extends FourWheeler{
    Car(){
        System.out.println("This 4 Wheeler Vehical is a Car");
    }
}
public class Earn{
    public static void main(String[] args) {
        Car obj = new Car();
    }
}