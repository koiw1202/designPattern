package 전략패턴;

public class KakaoPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("카카오 결제");
    }
}
