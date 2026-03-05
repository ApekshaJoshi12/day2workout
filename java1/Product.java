class Product {

    
    private String productName;
    private double price;

    
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    
    public String getProductName() {
        return productName;
    }

    
    public void setProductName(String productName) {
        this.productName = productName;
    }

   
    public double getPrice() {
        return price;
    }

   
    public void setPrice(double price) {
        this.price = price;
    }

    
    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    
    public static void main(String[] args) {

        
        Product p1 = new Product("Laptop", 55000);

        
        p1.displayDetails();

        
        p1.setPrice(52000);

        System.out.println("\nAfter Updating Price:");
        p1.displayDetails();
    }
}