public class PayWithCash implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf("paying with REAL money (%f$)\n", amount);
    }
}
