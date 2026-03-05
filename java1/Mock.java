class Car {
    private int speed;  

    
    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative!");
            this.speed = 0;  
        }
    }

    
    public int getSpeed() {
        return speed;
    }
}

public class Mock {
    public static void main(String[] args) {
        Car car = new Car();

        car.setSpeed(60);
        System.out.println("Speed: " + car.getSpeed());

        car.setSpeed(-20);   
        System.out.println("Speed: " + car.getSpeed());
    }
}