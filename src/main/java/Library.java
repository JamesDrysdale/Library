import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> bookCollection;

    //constructor
    public Library(int capacity){
        this.capacity = capacity;
        this.bookCollection = new ArrayList<Book>();
    }

    //methods

    //Check number of books in library
    public int bookCount(){
        return this.bookCollection.size();
    }

    //Check to see if library has capacity remaining
    public boolean checkCapacity(){
        if (bookCount() < this.capacity) {
            return true;
        }
        return false;
    }

    //Add a book to the library
    public void addBook(Book book){
       this.bookCollection.add(book);
    }
}
