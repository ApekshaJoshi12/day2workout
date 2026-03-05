class AreaCalculator {

    
    int area(int side) {
        return side * side;
    }

    
    int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        
        int squareArea = obj.area(5);
        System.out.println("Area of Square: " + squareArea);

       
        int rectangleArea = obj.area(4, 6);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}