class Animal{
    Animal(){
        System.out.println("This is Animal");
    }
}
class Cat extends Animal{
    Cat(){
        System.out.println("This is Cat");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("This is Dog");
    }
}
class puppy extends Dog{
    puppy(){
        System.out.println("This is puppy");
    }
}
public class Code{
    public static void main(String[] args) {
        new Cat();
        new puppy();
    }
}