public class Main {
    public static void main(String[] args) {
        PayProcess Money = PayProcess.getInstance(new PayWithCard());
        Money.doPayment(10.1);
        Money.setStrategy(new PayWithQiwi());
        Money.doPayment(20.0);
        Money.setStrategy(new PayWithCash());
        Money.doPayment(80.9);

    }
}