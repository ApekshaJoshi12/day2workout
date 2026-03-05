interface Father{
  void love();
}
interface Mother{
    void care();
}
class Child implements Father,Mother{
    public void love(){
        System.out.println("Father gives love");
    }
    public void care(){
        System.out.println("Mother gives care");
    }
}
public class Cover{
    public static void main(String[] args) {
        Child c = new Child();
        c.love();
        c.care();

    }
}
