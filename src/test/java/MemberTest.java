import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MemberTest {

    private Member member;
    private Library library;
    private Book book1;

    @Before
    public void before() {
        member = new Member("Oakley");
        library = new Library("Corner Library", 2);
        book1 = new Book("Cat in the Hat", "Dr. Suess", "Thriller");
    }

    @Test
    public void canGetName() {
        assertEquals("Oakley", member.getName());
    }

    @Test
    public void checkedOutStartsEmpty() {
        assertEquals(0, member.numberCheckedOut());
    }

    @Test
    public void canCheckOutBook() {
        library.addBookToCollection(book1);
        member.checkOutBook(library);
        assertEquals(1, member.numberCheckedOut());
    }

}
