class Vehicle{
    Vehicle(){
        System.out.println("This is a Vehicle");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("This Vehical is Car");
    }
}
class Bus extends Vehicle{
    Bus(){
        System.out.println("This Vehical is Bus");
    }
}
public class Learn{
    public static void main(String[] args) {
        new Car();
        new Bus();
    }
}
