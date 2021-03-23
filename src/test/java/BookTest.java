import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Cat in the Hat", "Dr. Suess", "Thriller");
    }

    @Test
    public void canGetTitle() {
        assertEquals("Cat in the Hat", book.getTitle());
    }

    @Test
    public void canGetAuthor() {
        assertEquals("Dr. Suess", book.getAuthor());
    }

    @Test
    public void canGetGenre() {
        assertEquals("Thriller", book.getGenre());
    }

}
