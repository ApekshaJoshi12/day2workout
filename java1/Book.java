class Book {
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        
        Book book1 = new Book();
        book1.title = "The Alchemist";
        book1.author = "Paulo Coelho";
        book1.price = 299.0;

       
        Book book2 = new Book();
        book2.title = "Harry Potter";
        book2.author = "J.K. Rowling";
        book2.price = 499.0;

        
        book1.displayDetails();
        book2.displayDetails();
    }
}