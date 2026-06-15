package 전략패턴;

public class NaverPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("네이버 결제");
    }
}
