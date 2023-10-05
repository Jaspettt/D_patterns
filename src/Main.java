public class Main {
    public static void main(String[] args) {
        PayProcess Money = PayProcess.getInstance();
        Money.doPayment(10.1);
        Money.setStrategy(new PayWithQiwi());
        Money.doPayment(20.0);
        Money.setStrategy(new PayWithCash());
        Money.doPayment(80.9);
        PayProcess TwoMoney = PayProcess.getInstance();
        TwoMoney.doPayment(69.0);
    }
}