package FactoryPlusObserver;


public class BookFollower implements IObserver{
    private String name;
    public BookFollower(String name) {
        this.name = name;
    }
    @Override
    public void update(IBook book) {
        System.out.println(name + "we get a new book called: " + book.getTitle());
    }
}
