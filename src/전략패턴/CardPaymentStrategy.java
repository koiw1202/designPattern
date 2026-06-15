package 전략패턴;

public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("카드 결제");
    }
}
