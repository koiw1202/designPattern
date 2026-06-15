package 전략패턴;

public class Main {

    public static void main(String[] args) {
        PaymentService service = new PaymentService(new KakaoPaymentStrategy());
        service.pay(10000);
    }
}