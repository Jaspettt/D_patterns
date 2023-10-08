package Decorator;

import static java.lang.Math.ceil;

public class Main {
    public static void main(String[] args) {
        IGift bookGift = new Gift("Book", 13.69);

        IGift decoratedGift = new BoxDecorator(bookGift);
        IGift decoratedGift1 = new RibbonDecorator(decoratedGift);
        IGift decoratedGift2 = new GlitterDecorator(decoratedGift1);
        System.out.println("Description: " + decoratedGift2.getDescription());
        System.out.println("Cost " + ceil(decoratedGift2.getCost()));
    }

}
