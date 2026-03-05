public class Rectangle {
    double length;
    double width;
    Rectangle(double l,double w){
        length=l;
        width=w;
    }
    double area(){
        return length*width;
    }
    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,2);
        System.out.println("Area of Rectangle:"+r.area());
    }
}
