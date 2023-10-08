package Decorator;

public class BoxDecorator extends GiftDecorator{

    public BoxDecorator(IGift gift) {
        super(gift);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with box";

    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }
}
