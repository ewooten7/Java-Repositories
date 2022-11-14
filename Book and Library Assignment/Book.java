public class Book {

    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        // Implement this method
        this.title = bookTitle;
        this.borrowed = false;

//Notes: using 'this' keyword to refer current class instance variables
    }
   
    // Marks the book as rented
    public void borrowed() {
        // Implement this method
        this.borrowed = true;

//Notes: outputs 'false'
    }
   
    // Marks the book as not rented
    public void returned() {
        // Implement this method
        this.borrowed = false; 

//Notes: boolean - outputs 'false' 
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
        return this.borrowed;

//Notes: String - returns title ("Book name")
    }
   
    // Returns the title of the book
    public String getTitle() {
        // Implement this method
        return this.title;
    }



//The function below:
    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
} 