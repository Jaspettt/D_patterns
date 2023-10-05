public class PayProcess {
    private static PayProcess instance;
    private IPaymentStrategy Strategy;
    private PayProcess(IPaymentStrategy Strategy) {
        this.Strategy = Strategy;
    }
    public static PayProcess getInstance() {
        if (instance == null) {
            instance = new PayProcess(new PayWithCash());
        }
        return instance;
    }
    public void doPayment(double amount) {
        Strategy.pay(amount);
    }

    public void setStrategy(IPaymentStrategy strategy) {
        Strategy = strategy;
    }
}
