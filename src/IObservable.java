package FactoryPlusObserver;

public interface IObservable {
    void addObserver(IObserver observer);
    void delObserver(IObserver observer);
    void notifyObserver(IBook book);
}
