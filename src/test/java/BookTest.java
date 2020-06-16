import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("The Colour of Magic", "Terry Pratchett", "Fantasy");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("The Colour of Magic", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Terry Pratchett", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }

}
