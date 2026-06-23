package 데코레이터패턴;

public class Main {

    public static void main(String[] args) {

        Notifier notifier = new SlackDecorator(new SmsDecorator(new EmailNotifier()));

        notifier.send("주문 완료");

    }
}
