interface Student{
     void study();
    
}
class Section implements Student{
public void study(){
    System.out.println("Studying for exams....");
 }
}
public class Wealth {
    public static void main(String[] args) {
        Section section = new Section();
        section.study();
    }
}