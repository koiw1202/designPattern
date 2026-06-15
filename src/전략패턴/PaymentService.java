package 전략패턴;

public class PaymentService {

    private final PaymentStrategy strategy;

    public PaymentService(
            PaymentStrategy strategy) {

        this.strategy = strategy;
    }

    public void pay(int amount) {
        strategy.pay(amount);
    }
}
