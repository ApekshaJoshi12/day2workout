class Person {
    
    private int age;   
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }

    
    public int getAge() {
        return age;
    }
}

public class Mains {
    public static void main(String[] args) {
        Person p = new Person();

        p.setAge(25);     
        System.out.println("Age: " + p.getAge());

        p.setAge(-5);     
        System.out.println("Age: " + p.getAge());
    }
}