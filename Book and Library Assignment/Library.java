
import java.util.ArrayList; //+Arraylist added

public class Library {
    // 1. Add the missing implementation to this class
    private String address;
    private static String hours = "Libraries are open daily from 9am to 5pm.";
    private ArrayList<Book> books;

//Process to implement: use 'this' keyword to refer current class instance variables

//using ArrayList for books since there's a selection to output
    Library (String location) {
        this.address = location;
        this.books = new ArrayList<Book> ();
    }

    public void addBook (Book newBook) {
        this.books.add(newBook);
    }

//Hour of operation: must be static
    public static void printOpenHours() {
        System.out.println(hours);
    }

//Location Address: 
    public void printAddress() {
        System.out.println(this.address);
    }

//Borrowed status: Boolean if/else
    public void borrowBook(String title) {
        boolean foundBook = false;
        for(Book bk : this.books) {
            if(bk.title.equals(title)) {
                foundBook = true;
                if(bk.isBorrowed()) {
                    System.out.println("ERROR: this book is currently borrowed or unavailable at this time. Please contact a librarian for further assistance, or try again later.");
                } else {
                    bk.borrowed();
                    System.out.printf("Thank you! You have borrowed %s.\n", title);
                }
            }

//for unavailable books: boolean
        }
        if(!foundBook) {
            System.out.println("Sorry, this book is not available at this location. Please contact contact a librarian for further assistance");
        }
    }

//For available books: boolean if/else
    public void printAvailableBooks() {
        if(this.books.isEmpty()) {
            System.out.println("My apologies, the books are currently not in this catalog.");
        } else {
            for (Book bk : this.books) {
                if (!bk.isBorrowed()) {
                    System.out.println(bk.title);
                }
            }
        }
    }

    //Returning books
    public void returnBook(String title) {
        for(Book bk : this.books) {
            if(bk.title.equals(title)) {
                bk.returned();
                System.out.printf("Thank you! You have borrowed %s.\n", title);
                // If Found book, don't need to search further
                return;
            }
        }
        System.out.println("ERROR: this book CANNOT be returned at this location.");
    }










//The function
public static void main(String[] args) {
        // 2. Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");


        // 3. Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));


        // 4. Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpenHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();


        // 5. Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();


        // 6. Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();


        // 7. Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

    
        // 8. Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}