package 데코레이터패턴;

public class SmsDecorator extends NotifierDecorator {

    protected SmsDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        notifier.send(message);

        System.out.println("SMS 전송");

    }
}
