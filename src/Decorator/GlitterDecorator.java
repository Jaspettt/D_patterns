package Decorator;

public class GlitterDecorator extends GiftDecorator{

    public GlitterDecorator(IGift gift) {
        super(gift);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with glitter";

    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }
}
