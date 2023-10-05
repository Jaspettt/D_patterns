public class PayWithCard implements IPaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.printf("paying with a debit card (%f$)\n", amount);
    }
}
