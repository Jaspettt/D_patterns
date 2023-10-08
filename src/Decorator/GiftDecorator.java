package Decorator;

public class GiftDecorator implements IGift {
    private IGift gift;
    public GiftDecorator(IGift gift) {
        this.gift = gift;
    }

    @Override
    public String getDescription() {
        return gift.getDescription();
    }

    @Override
    public double getCost() {
        return gift.getCost();
    }
}
