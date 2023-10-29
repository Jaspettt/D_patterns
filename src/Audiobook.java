package FactoryPlusObserver;

public class Audiobook implements IBook{
    private String title;
    private String author;
    private int price;
    private String type;
    public Audiobook(String type, String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }
}
