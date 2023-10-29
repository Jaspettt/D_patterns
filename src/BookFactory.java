package FactoryPlusObserver;



public class BookFactory {
    public static IBook createBook(String type, String title, String author, int price) {
        if ("Novel".equalsIgnoreCase(type)) {
            return new Novel(title, author, price);
        } else if ("Audiobook".equalsIgnoreCase(type)) {
            return new Audiobook(title, author, price);
        } else {
            throw new IllegalArgumentException("no such book type");

        }
    }
}
