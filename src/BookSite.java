package FactoryPlusObserver;

import java.util.ArrayList;
import java.util.List;

public class BookSite implements IObservable{
    private List<IObserver> followers = new ArrayList<>();
    @Override
    public void addObserver(IObserver observer) {
        followers.add(observer);
    }

    @Override
    public void delObserver(IObserver observer) {
        followers.remove(observer);
    }

    @Override
    public void notifyObserver(IBook book) {
        for (IObserver observer : followers) {
            observer.update(book);
        }
    }
    public void addBook(IBook book) {
        notifyObserver(book);
    }
}
