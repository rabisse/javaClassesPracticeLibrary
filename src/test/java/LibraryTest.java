import org.junit.Before;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library("Your Corner Library", 2);

    }



}
