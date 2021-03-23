import java.util.ArrayList;

public class Member {
    private String name;
    private ArrayList<Book> checkedOut;

    public Member(String name) {
        this.name = name;
        this.checkedOut = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getCheckedOut() {
        return checkedOut;
    }

    public int numberCheckedOut() {
        return checkedOut.size();
    }

    public void checkOutBook(Library library) {
        Book book = library.checkOutBook();
        this.checkedOut.add(book);
    }


}
