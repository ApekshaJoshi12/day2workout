class Details  {
    String name;
    int id;
    float marks;
    void display(){
        System.out.println("Name of the student:"+name);
         System.out.println("Id of the student:"+id);
         System.out.println("Marks of the student:"+marks);
    }
}
public class Student{
    public static void main(String[] args) {
        Details s1=new Details();
        s1.name="Apeksha";
        s1.id=004;
        s1.marks=90.43f;
    s1.display();
}
    }
