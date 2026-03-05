class Parent{
    void display(){
        System.out.println("Parent method");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("Child method");
    }
    void show(){
        super.display();
        display();
    }
}
public class UIUX{
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}