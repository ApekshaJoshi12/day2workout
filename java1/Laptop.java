class Laptop {
    String brand;
    int ram;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop();

        l1.brand = "Dell";
        l1.ram = 16;
        l1.price = 65000;

        l1.displayDetails();
    }
}