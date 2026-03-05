abstract class Student{
    abstract void study();
    void attendClass(){
        System.out.println("Attending class....");
    }
}
class Section extends Student{
 void study(){
    System.out.println("Studying for exams....");
 }
}
public class Measure {
    public static void main(String[] args) {
        Section section = new Section();
        section.attendClass();
        section.study();
    }
}