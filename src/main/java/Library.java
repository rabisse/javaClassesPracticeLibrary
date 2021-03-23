import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> collection;

    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Book> getCollection() {
        return collection;
    }

    public int getCollectionSize() {
        return collection.size();
    }

    public void addBookToCollection(Book book) {
        if (this.getCollectionSize() < this.capacity) {
            this.collection.add(book);
        }
    }

    public Book checkOutBook() {
        return this.collection.remove(0);
    }


}
