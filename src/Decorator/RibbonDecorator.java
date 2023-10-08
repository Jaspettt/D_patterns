package Decorator;

public class RibbonDecorator extends GiftDecorator{

    public RibbonDecorator(IGift gift) {
        super(gift);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with ribbon";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.0;
    }
}

