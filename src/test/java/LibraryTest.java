import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {
    Library library;
    Book book;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book("The Colour of Magic", "Terry Pratchett", "Fantasy");
        book1 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        book2 = new Book("Pet Cemetery", "Steven King", "Horror");
        book3 = new Book("Ark", "Stephen Baxter", "Sci Fi");
    }

    @Test
    public void emptyLibraryHasNoBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkLibraryHasSpaceLeft(){
        assertEquals(true, library.checkCapacity());
    }

    @Test
    public void cantAddBookIfCapacityFull(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.bookCount());
    }


}
