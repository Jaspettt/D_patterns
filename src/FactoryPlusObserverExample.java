package FactoryPlusObserver;

public class FactoryPlusObserverExample {
    public static void main(String[] args) {
        BookSite bookSite = new BookSite();

        IObserver subscriber1 = new BookFollower("Subscriber 1");
        IObserver subscriber2 = new BookFollower("Subscriber 2");

        bookSite.addObserver(subscriber1);
        bookSite.addObserver(subscriber2);

        // Add a new novel to the site
        IBook novel = BookFactory.createBook("Novel", "Sample Novel", "Author A", 19);
        bookSite.addBook(novel);

        // Add a new audiobook to the site
        IBook audiobook = BookFactory.createBook("Audiobook", "Sample Audiobook", "Author B", 29);
        bookSite.addBook(audiobook);
    }
}
