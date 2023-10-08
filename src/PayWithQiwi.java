public class PayWithQiwi implements IPaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.printf("paying using online (%f$)\n", amount);
    }
}
