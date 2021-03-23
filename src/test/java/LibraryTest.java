import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library("Your Corner Library", 2);
        book1 = new Book("Cat in the Hat", "Dr. Suess", "Thriller");
        book2 = new Book("Harry Potter 1", "J.K. Rowling", "Nonfiction");
        book3 = new Book("Another Book", "Another Author", "Another Genre");
    }

    @Test
    public void libraryHasName() {
        assertEquals("Your Corner Library", library.getName());
    }

    @Test
    public void libraryHasCapacity() {
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void libraryCollectionStartsEmpty() {
        assertEquals( 0, library.getCollectionSize());
    }

    @Test
    public void canAddBookToCollection() {
        library.addBookToCollection(book1);
        assertEquals(1, library.getCollectionSize());
    }

    @Test
    public void cannotSurpassCapacity() {
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        library.addBookToCollection(book3);
        assertEquals(2, library.getCollectionSize());
    }

    @Test
    public void canRemoveBookFromCollection() {
        library.addBookToCollection(book1);
        library.checkOutBook();
        assertEquals(0, library.getCollectionSize());
    }

}
